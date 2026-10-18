import { compile, type Template } from "handlebars";
import { readdir } from "node:fs/promises";
import { parse } from "node:path";

function variable(it: string) {
  return "${{ " + it + " }}";
}

const versions = ["1.20.x", "1.21.x", "26.1.x"].join(", ");
const types = ["common", "fabric", "neoforge"].join(", ");

async function loadPartials(): Promise<Record<string, Template>> {
  const files = await readdir("partials");

  return Object.fromEntries(
    await Promise.all(
      files.map(async (it) => {
        const key = parse(it).name;
        const file = Bun.file(`partials/${it}`);
        return [key, compile(await file.text())];
      }),
    ),
  );
}

const partials = await loadPartials();

async function generate(file: string) {
  const input = Bun.file(`templates/${file}`);
  const output = Bun.file(`.github/workflows/${file}`);

  const template = compile(await input.text());

  await output.write(
    template({ types, versions }, { helpers: { var: variable }, partials }),
  );

  console.info("generated", file);
}

const templates = await readdir("templates");

await Promise.all(templates.map(generate));

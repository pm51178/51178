import antlr4 from 'antlr4';
import fs from 'fs';
import readline from 'readline';

import MiniLangLexer from './generated/MiniLangLexer.js';
import MiniLangParser from './generated/MiniLangParser.js';
import CustomMiniLangVisitor from './CustomMiniLangVisitor.js';

async function main() {
  let input;

  try {
    input = fs.readFileSync('inputMiniLang.txt', 'utf8');
  } catch (err) {
    input = await leerCadena();
    console.log(input);
  }

  // Mostrar tokens (léxico)
  let inputStream = new antlr4.InputStream(input);
  let lexer = new MiniLangLexer(inputStream);
  const tokens = lexer.getAllTokens();

  console.log("\nTabla de Tokens y Lexemas:");
  console.log("--------------------------------------------------");
  console.log("| Lexema         | Token                         |");
  console.log("--------------------------------------------------");
  for (let token of tokens) {
    const tokenName = MiniLangLexer.symbolicNames[token.type] || `TOKEN_${token.type}`;
    console.log(`| ${token.text.padEnd(14)} | ${tokenName.padEnd(30)}|`);
  }
  console.log("--------------------------------------------------");

  // Reprocesar entrada porque getAllTokens() agota el lexer
  inputStream = new antlr4.InputStream(input);
  lexer = new MiniLangLexer(inputStream);
  const tokenStream = new antlr4.CommonTokenStream(lexer);
  const parser = new MiniLangParser(tokenStream);

  const tree = parser.programa();

  if (parser._syntaxErrors > 0) {
    console.error("\nSe encontraron errores de sintaxis en la entrada.");
  } else {
    console.log("\nEntrada válida.");
    console.log("Árbol de derivación:");
    console.log(tree.toStringTree(parser.ruleNames));

    const visitor = new CustomMiniLangVisitor();
    visitor.visit(tree);
  }
}

function leerCadena() {
  const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });

  return new Promise(resolve => {
    rl.question("Ingrese una cadena: ", (answer) => {
      rl.close();
      resolve(answer);
    });
  });
}

main();
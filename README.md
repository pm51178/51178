# MiniLang - Analizador con ANTLR4 y JavaScript

Este proyecto implementa un analizador léxico, sintáctico e intérprete básico para un lenguaje ficticio llamado **MiniLang**, utilizando **ANTLR4** y **Node.js**.

---

## Requisitos

Antes de ejecutar este proyecto, asegurate de tener instalados los siguientes elementos:

- [Node.js](https://nodejs.org/) (versión 16 o superior)
- [Java JRE](https://www.java.com/es/download/)
- [ANTLR4](https://www.antlr.org/)
- [Visual Studio Code](https://code.visualstudio.com/)
- Extensión de ANTLR4 para VS Code

---

## Estructura del proyecto
ssl-antlr-calculator/
├── MiniLang.g4                 # Archivo de gramática ANTLR
├── indexMiniLang.js           # Código principal del analizador
├── CustomMiniLangVisitor.js   # Visitor personalizado (interpreta el código)
├── inputMiniLang.txt          # Archivo de entrada con 4 ejemplos
├── generated/                 # Archivos generados por ANTLR
│   ├── MiniLangLexer.js
│   ├── MiniLangParser.js
│   ├── MiniLangVisitor.js
│   └── MiniLangListener.js
├── package.json               # Configuración del proyecto Node.js
├── package-lock.json
├── .vscode/launch.json        # Configuración de depuración en VS Code
└── README.md                  # Este archivo
---

## 🛠️ Cómo ejecutar el proyecto

### 1. Clonar el repositorio

```bash
git clone https://github.com/<usuario>/<legajo>.git
cd <legajo>
npm install
### si editas MiniLang.g4, ejecuta:
npx antlr4 -Dlanguage-JavaScript -visitor -o generated MiniLang.g4
### ejecutar el analizador:
npm start
Este comando realizará:
	 Análisis léxico: muestra tabla de lexemas y tokens
	 Análisis sintáctico: informa errores si los hay
   Muestra el árbol de derivación (texto)
   Ejecuta el visitor (interpretación)
PARA VER EL ARBOL DE DERIVACION:
### desde visual code: 
Abrir el archivo MiniLang.g4
presionar F5 
2 EJEMPLOS CORRECTOS:
// input1
repetir {
  imprimir("Hola mundo!");
  salir;
} hasta verdadero;

// input2
repetir {
  imprimir("Mensaje 1.");
  imprimir("Mensaje 2?");
  salir;
} hasta verdadero;
2 EJEMPLOS CON ERRORES:
// error1 - Falta punto y coma
repetir {
  imprimir("Falta el punto y coma")
  salir;
} hasta verdadero;

// error2 - Cadena sin cerrar
repetir {
  imprimir("Esto no se cierra;
  salir;
} hasta verdadero;

Nombre: Priscila Mamaní
Legajo: 51178
Repositorio: https://github.com/pm51178/51178

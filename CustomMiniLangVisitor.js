import MiniLangVisitor from './generated/MiniLangVisitor.js';

class CustomMiniLangVisitor extends MiniLangVisitor {
  constructor() {
    super();
    this.memory = {};
  }

  visitPrograma(ctx) {
    return ctx.instruccion().map(instr => this.visit(instr));
  }
  
  visitRepeticion(ctx) {
  const sentencias = ctx.sentencia();
  sentencias.forEach(sent => this.visit(sent));

  const condicion = this.visit(ctx.condicion());
  if (!condicion) {
    console.log("Advertencia: El bucle terminaría en 'falso', se simula solo una ejecución.");
  }
}

visitSalida(ctx) {
    const textoConComillas = ctx.CADENA().getText(); // e.g. '"Hola!"'
    const texto = textoConComillas.slice(1, -1); // eliminar comillas
    console.log(`Salida: ${texto}`);
  }

  visitTerminar(ctx) {
    console.log("Fin del programa.");
  }

  visitCondicion(ctx) {
    const valor = ctx.getText().trim();
    return valor === 'verdadero';
  }
}

export default CustomMiniLangVisitor;
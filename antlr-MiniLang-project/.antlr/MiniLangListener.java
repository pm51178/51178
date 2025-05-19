// Generated from c://Users//prisc//OneDrive//Escritorio//ssl-antlr-calculator//MiniLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniLangParser}.
 */
public interface MiniLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MiniLangParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MiniLangParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(MiniLangParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(MiniLangParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#repeticion}.
	 * @param ctx the parse tree
	 */
	void enterRepeticion(MiniLangParser.RepeticionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#repeticion}.
	 * @param ctx the parse tree
	 */
	void exitRepeticion(MiniLangParser.RepeticionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(MiniLangParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(MiniLangParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#salida}.
	 * @param ctx the parse tree
	 */
	void enterSalida(MiniLangParser.SalidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#salida}.
	 * @param ctx the parse tree
	 */
	void exitSalida(MiniLangParser.SalidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#terminar}.
	 * @param ctx the parse tree
	 */
	void enterTerminar(MiniLangParser.TerminarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#terminar}.
	 * @param ctx the parse tree
	 */
	void exitTerminar(MiniLangParser.TerminarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(MiniLangParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(MiniLangParser.CondicionContext ctx);
}
// Generated from Grammar_For_C.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Grammar_For_CParser}.
 */
public interface Grammar_For_CListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Grammar_For_CParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(@NotNull Grammar_For_CParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_For_CParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(@NotNull Grammar_For_CParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_For_CParser#allTokens}.
	 * @param ctx the parse tree
	 */
	void enterAllTokens(@NotNull Grammar_For_CParser.AllTokensContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_For_CParser#allTokens}.
	 * @param ctx the parse tree
	 */
	void exitAllTokens(@NotNull Grammar_For_CParser.AllTokensContext ctx);
}
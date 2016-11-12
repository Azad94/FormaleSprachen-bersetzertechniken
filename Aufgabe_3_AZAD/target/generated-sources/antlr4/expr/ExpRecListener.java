// Generated from ExpRec.g4 by ANTLR 4.4
package expr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpRecParser}.
 */
public interface ExpRecListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpRecParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(@NotNull ExpRecParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpRecParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(@NotNull ExpRecParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpRecParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull ExpRecParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpRecParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull ExpRecParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpRecParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull ExpRecParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpRecParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull ExpRecParser.ExprContext ctx);
}
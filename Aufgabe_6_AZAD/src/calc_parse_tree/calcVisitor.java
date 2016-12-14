// Generated from calc.g4 by ANTLR 4.4
package calc_parse_tree;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link calcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface calcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(@NotNull calcParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(@NotNull calcParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(@NotNull calcParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(@NotNull calcParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(@NotNull calcParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#clear}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClear(@NotNull calcParser.ClearContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clean}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClean(@NotNull calcParser.CleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull calcParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull calcParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull calcParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(@NotNull calcParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SmaGre}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmaGre(@NotNull calcParser.SmaGreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(@NotNull calcParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull calcParser.AssignContext ctx);
}
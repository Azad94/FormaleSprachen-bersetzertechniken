// Generated from calc_interpreter.g4 by ANTLR 4.4
package calc_interpreter;

import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calc_interpreterParser}.
 */
public interface calc_interpreterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calc_interpreterParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull calc_interpreterParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link calc_interpreterParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull calc_interpreterParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link calc_interpreterParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(@NotNull calc_interpreterParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link calc_interpreterParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(@NotNull calc_interpreterParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link calc_interpreterParser#clear}.
	 * @param ctx the parse tree
	 */
	void enterClear(@NotNull calc_interpreterParser.ClearContext ctx);
	/**
	 * Exit a parse tree produced by {@link calc_interpreterParser#clear}.
	 * @param ctx the parse tree
	 */
	void exitClear(@NotNull calc_interpreterParser.ClearContext ctx);
	/**
	 * Enter a parse tree produced by {@link calc_interpreterParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull calc_interpreterParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link calc_interpreterParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull calc_interpreterParser.ProgContext ctx);
}
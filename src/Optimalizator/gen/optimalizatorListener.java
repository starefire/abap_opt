package Optimalizator.gen;// Generated from C:/Users/Honza/Desktop/Skola/DP/DP_ABAP_compiler/DP_ABAP_compiler/grammars\optimalizator.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link optimalizatorParser}.
 */
public interface optimalizatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link optimalizatorParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(optimalizatorParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link optimalizatorParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(optimalizatorParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link optimalizatorParser#optimal}.
	 * @param ctx the parse tree
	 */
	void enterOptimal(optimalizatorParser.OptimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link optimalizatorParser#optimal}.
	 * @param ctx the parse tree
	 */
	void exitOptimal(optimalizatorParser.OptimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link optimalizatorParser#endoptimal}.
	 * @param ctx the parse tree
	 */
	void enterEndoptimal(optimalizatorParser.EndoptimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link optimalizatorParser#endoptimal}.
	 * @param ctx the parse tree
	 */
	void exitEndoptimal(optimalizatorParser.EndoptimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link optimalizatorParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(optimalizatorParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link optimalizatorParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(optimalizatorParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link optimalizatorParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(optimalizatorParser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link optimalizatorParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(optimalizatorParser.PrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link optimalizatorParser#star}.
	 * @param ctx the parse tree
	 */
	void enterStar(optimalizatorParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by {@link optimalizatorParser#star}.
	 * @param ctx the parse tree
	 */
	void exitStar(optimalizatorParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by {@link optimalizatorParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(optimalizatorParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link optimalizatorParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(optimalizatorParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectOpt}
	 * labeled alternative in {@link optimalizatorParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelectOpt(optimalizatorParser.SelectOptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectOpt}
	 * labeled alternative in {@link optimalizatorParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelectOpt(optimalizatorParser.SelectOptContext ctx);
}
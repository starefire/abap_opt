package Optimalizator.gen;// Generated from C:/Users/Honza/Desktop/Skola/DP/DP_ABAP_compiler/DP_ABAP_compiler/grammars\optimalizator.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link optimalizatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface optimalizatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link optimalizatorParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(optimalizatorParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link optimalizatorParser#optimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimal(optimalizatorParser.OptimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link optimalizatorParser#endoptimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndoptimal(optimalizatorParser.EndoptimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link optimalizatorParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(optimalizatorParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link optimalizatorParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix(optimalizatorParser.PrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link optimalizatorParser#star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(optimalizatorParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by {@link optimalizatorParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(optimalizatorParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectOpt}
	 * labeled alternative in {@link optimalizatorParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectOpt(optimalizatorParser.SelectOptContext ctx);
}
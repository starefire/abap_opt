package AST.gen;// Generated from C:/Users/Honza/Desktop/Skola/DP/DP_ABAP_compiler/DP_ABAP_compiler/grammars\abap.g4 by ANTLR 4.8
import AST.nodes.InfixNode;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link abapParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface abapVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link abapParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitProg(abapParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitBlock(abapParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitStatement(abapParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitEmpty(abapParser.EmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#report}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitReport(abapParser.ReportContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#clear}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitClear(abapParser.ClearContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitCondition(abapParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitElseif(abapParser.ElseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#elseifloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitElseifloop(abapParser.ElseifloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitAssignment(abapParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitComment(abapParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitLoop(abapParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitOp(abapParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rparenNode}
	 * labeled alternative in {@link abapParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitRparenNode(abapParser.RparenNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparationNode}
	 * labeled alternative in {@link abapParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitComparationNode(abapParser.ComparationNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varNode}
	 * labeled alternative in {@link abapParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitVarNode(abapParser.VarNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sparenNode}
	 * labeled alternative in {@link abapParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitSparenNode(abapParser.SparenNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueNode}
	 * labeled alternative in {@link abapParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitValueNode(abapParser.ValueNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticNode}
	 * labeled alternative in {@link abapParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitArithmeticNode(abapParser.ArithmeticNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitSelect(abapParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#swordf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitSwordf(abapParser.SwordfContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#sword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitSword(abapParser.SwordContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#sort_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitSort_key(abapParser.Sort_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#readtable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitReadtable(abapParser.ReadtableContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#rtable_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitRtable_key(abapParser.Rtable_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#transport_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitTransport_options(abapParser.Transport_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#casting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitCasting(abapParser.CastingContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#inline_fields_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitInline_fields_declaration(abapParser.Inline_fields_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitCols(abapParser.ColsContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#col}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitCol(abapParser.ColContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitIndex(abapParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#s_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitS_cond(abapParser.S_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#lidcommas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitLidcommas(abapParser.LidcommasContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#lidcomma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitLidcomma(abapParser.LidcommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitVar(abapParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitVariable(abapParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#fieldsymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitFieldsymbol(abapParser.FieldsymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#inline_data_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitInline_data_declaration(abapParser.Inline_data_declarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numNode}
	 * labeled alternative in {@link abapParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitNumNode(abapParser.NumNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringNode}
	 * labeled alternative in {@link abapParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitStringNode(abapParser.StringNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitDeclaration(abapParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#decl_eachloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitDecl_eachloop(abapParser.Decl_eachloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#decl_each}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitDecl_each(abapParser.Decl_eachContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#lid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitLid(abapParser.LidContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#tabkeys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitTabkeys(abapParser.TabkeysContext ctx);
	/**
	 * Visit a parse tree produced by {@link abapParser#join_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	InfixNode visitJoin_cond(abapParser.Join_condContext ctx);
}
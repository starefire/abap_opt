package AST.gen;// Generated from C:/Users/Honza/Desktop/Skola/DP/DP_ABAP_compiler/DP_ABAP_compiler/grammars\abap.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link abapParser}.
 */
public interface abapListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link abapParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(abapParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(abapParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(abapParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(abapParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(abapParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(abapParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(abapParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(abapParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#report}.
	 * @param ctx the parse tree
	 */
	void enterReport(abapParser.ReportContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#report}.
	 * @param ctx the parse tree
	 */
	void exitReport(abapParser.ReportContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#clear}.
	 * @param ctx the parse tree
	 */
	void enterClear(abapParser.ClearContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#clear}.
	 * @param ctx the parse tree
	 */
	void exitClear(abapParser.ClearContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(abapParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(abapParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#elseif}.
	 * @param ctx the parse tree
	 */
	void enterElseif(abapParser.ElseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#elseif}.
	 * @param ctx the parse tree
	 */
	void exitElseif(abapParser.ElseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#elseifloop}.
	 * @param ctx the parse tree
	 */
	void enterElseifloop(abapParser.ElseifloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#elseifloop}.
	 * @param ctx the parse tree
	 */
	void exitElseifloop(abapParser.ElseifloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(abapParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(abapParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(abapParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(abapParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(abapParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(abapParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(abapParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(abapParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rparenNode}
	 * labeled alternative in {@link abapParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRparenNode(abapParser.RparenNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rparenNode}
	 * labeled alternative in {@link abapParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRparenNode(abapParser.RparenNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparationNode}
	 * labeled alternative in {@link abapParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparationNode(abapParser.ComparationNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparationNode}
	 * labeled alternative in {@link abapParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparationNode(abapParser.ComparationNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varNode}
	 * labeled alternative in {@link abapParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarNode(abapParser.VarNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varNode}
	 * labeled alternative in {@link abapParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarNode(abapParser.VarNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sparenNode}
	 * labeled alternative in {@link abapParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSparenNode(abapParser.SparenNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sparenNode}
	 * labeled alternative in {@link abapParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSparenNode(abapParser.SparenNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueNode}
	 * labeled alternative in {@link abapParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterValueNode(abapParser.ValueNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueNode}
	 * labeled alternative in {@link abapParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitValueNode(abapParser.ValueNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticNode}
	 * labeled alternative in {@link abapParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticNode(abapParser.ArithmeticNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticNode}
	 * labeled alternative in {@link abapParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticNode(abapParser.ArithmeticNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(abapParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(abapParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#swordf}.
	 * @param ctx the parse tree
	 */
	void enterSwordf(abapParser.SwordfContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#swordf}.
	 * @param ctx the parse tree
	 */
	void exitSwordf(abapParser.SwordfContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#sword}.
	 * @param ctx the parse tree
	 */
	void enterSword(abapParser.SwordContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#sword}.
	 * @param ctx the parse tree
	 */
	void exitSword(abapParser.SwordContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#sort_key}.
	 * @param ctx the parse tree
	 */
	void enterSort_key(abapParser.Sort_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#sort_key}.
	 * @param ctx the parse tree
	 */
	void exitSort_key(abapParser.Sort_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#readtable}.
	 * @param ctx the parse tree
	 */
	void enterReadtable(abapParser.ReadtableContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#readtable}.
	 * @param ctx the parse tree
	 */
	void exitReadtable(abapParser.ReadtableContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#rtable_key}.
	 * @param ctx the parse tree
	 */
	void enterRtable_key(abapParser.Rtable_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#rtable_key}.
	 * @param ctx the parse tree
	 */
	void exitRtable_key(abapParser.Rtable_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#transport_options}.
	 * @param ctx the parse tree
	 */
	void enterTransport_options(abapParser.Transport_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#transport_options}.
	 * @param ctx the parse tree
	 */
	void exitTransport_options(abapParser.Transport_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#casting}.
	 * @param ctx the parse tree
	 */
	void enterCasting(abapParser.CastingContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#casting}.
	 * @param ctx the parse tree
	 */
	void exitCasting(abapParser.CastingContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#inline_fields_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInline_fields_declaration(abapParser.Inline_fields_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#inline_fields_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInline_fields_declaration(abapParser.Inline_fields_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#cols}.
	 * @param ctx the parse tree
	 */
	void enterCols(abapParser.ColsContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#cols}.
	 * @param ctx the parse tree
	 */
	void exitCols(abapParser.ColsContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#col}.
	 * @param ctx the parse tree
	 */
	void enterCol(abapParser.ColContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#col}.
	 * @param ctx the parse tree
	 */
	void exitCol(abapParser.ColContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(abapParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(abapParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#s_cond}.
	 * @param ctx the parse tree
	 */
	void enterS_cond(abapParser.S_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#s_cond}.
	 * @param ctx the parse tree
	 */
	void exitS_cond(abapParser.S_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#lidcommas}.
	 * @param ctx the parse tree
	 */
	void enterLidcommas(abapParser.LidcommasContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#lidcommas}.
	 * @param ctx the parse tree
	 */
	void exitLidcommas(abapParser.LidcommasContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#lidcomma}.
	 * @param ctx the parse tree
	 */
	void enterLidcomma(abapParser.LidcommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#lidcomma}.
	 * @param ctx the parse tree
	 */
	void exitLidcomma(abapParser.LidcommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(abapParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(abapParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(abapParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(abapParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#fieldsymbol}.
	 * @param ctx the parse tree
	 */
	void enterFieldsymbol(abapParser.FieldsymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#fieldsymbol}.
	 * @param ctx the parse tree
	 */
	void exitFieldsymbol(abapParser.FieldsymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#inline_data_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInline_data_declaration(abapParser.Inline_data_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#inline_data_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInline_data_declaration(abapParser.Inline_data_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numNode}
	 * labeled alternative in {@link abapParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNumNode(abapParser.NumNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numNode}
	 * labeled alternative in {@link abapParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNumNode(abapParser.NumNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringNode}
	 * labeled alternative in {@link abapParser#value}.
	 * @param ctx the parse tree
	 */
	void enterStringNode(abapParser.StringNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringNode}
	 * labeled alternative in {@link abapParser#value}.
	 * @param ctx the parse tree
	 */
	void exitStringNode(abapParser.StringNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(abapParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(abapParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#decl_eachloop}.
	 * @param ctx the parse tree
	 */
	void enterDecl_eachloop(abapParser.Decl_eachloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#decl_eachloop}.
	 * @param ctx the parse tree
	 */
	void exitDecl_eachloop(abapParser.Decl_eachloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#decl_each}.
	 * @param ctx the parse tree
	 */
	void enterDecl_each(abapParser.Decl_eachContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#decl_each}.
	 * @param ctx the parse tree
	 */
	void exitDecl_each(abapParser.Decl_eachContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#lid}.
	 * @param ctx the parse tree
	 */
	void enterLid(abapParser.LidContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#lid}.
	 * @param ctx the parse tree
	 */
	void exitLid(abapParser.LidContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#tabkeys}.
	 * @param ctx the parse tree
	 */
	void enterTabkeys(abapParser.TabkeysContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#tabkeys}.
	 * @param ctx the parse tree
	 */
	void exitTabkeys(abapParser.TabkeysContext ctx);
	/**
	 * Enter a parse tree produced by {@link abapParser#join_cond}.
	 * @param ctx the parse tree
	 */
	void enterJoin_cond(abapParser.Join_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link abapParser#join_cond}.
	 * @param ctx the parse tree
	 */
	void exitJoin_cond(abapParser.Join_condContext ctx);
}
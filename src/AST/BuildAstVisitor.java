package AST;

import AST.gen.abapBaseVisitor;
import AST.gen.abapParser;
import AST.gen.abapParser.ProgContext;
import AST.gen.abapVisitor;
import AST.nodes.*;
import Optimalizator.Optimalizator;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link abapParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class BuildAstVisitor <T extends InfixNode> extends abapBaseVisitor<T> implements abapVisitor<T> {

    @Override
    public InfixNode visitSwordf(abapParser.SwordfContext ctx) {
        SelectNode result = new SelectNode();
        for (ParseTree item: ctx.children
             ) {
            SelectNode container = (SelectNode)visit(item);
            if(container.itab!=null)result.itab = container.itab;
            if(container.mod!=null)result.mod = container.mod;
            if(container.where!=null)result.where = container.where;
            if(container.group.size()!=0)result.group = container.group;
            if(container.having!=null)result.having = container.having;
            if(container.wt!=null)result.wt = container.wt;
            if(container.order.size()!=0)result.order = container.order;
            result.cor = container.cor;
            result.table = container.table ;
            result.atsign = container.atsign;
            if(container.target!=null)result.target = container.target;
            if(container.rows != 0)result.rows = container.rows;
            if(container.where != null)result.where = container.where;
        }
        return result;
    }

    @Override
    public InfixNode visitSword(abapParser.SwordContext ctx) {
        SelectNode result = new SelectNode();
        if(ctx.itab!=null)result.itab = new VarNode(ctx.itab.getText());
        if(ctx.mod!=null)result.mod = ctx.mod.getText();
        if(ctx.prows!=null)result.rows = Integer.parseInt(ctx.prows.getText());
        if(ctx.cor!=null)result.cor = true;
        if(ctx.table!=null)result.table = true ;
        if(ctx.atsign!=null)result.atsign = true;
        if(ctx.trgt!=null)result.target = (VarNode)visit(ctx.trgt);
        if(ctx.conditions!=null && ctx.conditions.children.get(0)!=null)result.where = visit(ctx.conditions.children.get(0));
        if(ctx.s_sort_key!=null){
            LidNode ld = (LidNode)visit(ctx.s_sort_key.sk_cols);
            for (InfixNode item: ld.keys
                 ) {

                result.order.add(new VarNode(item.toString(), true));
            }
        }
        if(ctx.s_group!=null){
            LidNode ld = (LidNode)visit(ctx.s_group);
            for (InfixNode item: ld.keys
                    ) {
                result.group.add(new VarNode(item.toString(), true));
            }
        }
        if(ctx.s_group_cond!=null ){
            if(ctx.s_group_cond.children.get(0)!=null){
                result.having = visit(ctx.children.get(1));
                Optimalizator opt = Optimalizator.getINSTANCE();
                opt.unreg_var(3);
            }
        }

        return result;
    }

    @Override
    public InfixNode visitVariable(abapParser.VariableContext ctx) {
        VarNode result = new VarNode(ctx.pvar.getText());
        return result;
    }

    @Override
    public InfixNode visitFieldsymbol(abapParser.FieldsymbolContext ctx) {
        VarNode result = new VarNode(ctx.fsym.getText());
        result.fsymb = true;
        if(ctx.fscol != null)
            result.column = ctx.fscol.getText();
        return result;
    }

    @Override
    public InfixNode visitDecl_eachloop(abapParser.Decl_eachloopContext ctx) {
        DeclarNode result = new DeclarNode();
        int size = ctx.getChildCount();
        for ( int i = 0; i<size; i++ ) {
            String s =  getContextType(ctx.children.get(i).getClass().toString());
            if(s.equals("Decl_eachContext"))
                result.declars.add((DataNode)visit(ctx.children.get(i)));
        }

        return result;
    }

    @Override
    public InfixNode visitCondition(abapParser.ConditionContext ctx) {
        ConditionNode result = new ConditionNode();
        result.condition =  visit(ctx.con);
        int size = 0;
        if(ctx.if_body != null) {
            size = ctx.if_body.getChildCount();
            for (int i = 0; i < size; i++) {
                result.body.add(visit(ctx.if_body.children.get(i)));
            }
        }

        if(ctx.else_if != null) {
            size = ctx.else_if.getChildCount();
            for (int i = 0; i < size; i++) {
                result.elseif_blocks.add(visit(ctx.else_if.children.get(i)));
            }
        }

        if (ctx.else_body != null ) {
            size = ctx.else_body.getChildCount();
            for (int i = 0; i < size; i++) {
                result.else_body.add(visit(ctx.else_body.children.get(i)));
            }
        }
        return result;
    }

    @Override
    public InfixNode visitAssignment(abapParser.AssignmentContext ctx) {
        AssigmentNode result = new AssigmentNode();
        result.where = visit(ctx.where);
        InfixNode node = visit(ctx.what);
        result.what = node;


        Optimalizator opt = Optimalizator.getINSTANCE();
        opt.registerAssign(result);
        return result;
    }

    @Override
    public InfixNode visitRparenNode(abapParser.RparenNodeContext ctx) {
        ExprNode result = new ExprNode();
        result.rparen = true;
        result.left = visit(ctx.p1);
        return result;
    }

    @Override
    public InfixNode visitSparenNode(abapParser.SparenNodeContext ctx) {
        ExprNode result = new ExprNode();
        result.sparen = true;
        result.left = visit(ctx.p1);
        return result;
    }

    @Override
    public InfixNode visitValueNode(abapParser.ValueNodeContext ctx) {
        return visit(ctx.children.get(0));
    }

    @Override
    public InfixNode visitLidcommas(abapParser.LidcommasContext ctx) {
        LidNode result = new LidNode();
        for (ParseTree item: ctx.children
             ) {
            result.keys.add(visit(item));
        }
        return result;
    }

    @Override
    public InfixNode visitLidcomma(abapParser.LidcommaContext ctx) {
        return visit(ctx.lcol);
    }

    @Override
    public InfixNode visitNumNode(abapParser.NumNodeContext ctx) {
        ValueNode result = new ValueNode(Integer.parseInt(ctx.children.get(0).getText()));
        return result;
    }

    @Override
    public InfixNode visitStringNode(abapParser.StringNodeContext ctx) {
        ValueNode result = new ValueNode(ctx.children.get(1).getText());
        return result;
    }

    @Override
    public InfixNode visitLid(abapParser.LidContext ctx) {
        LidNode result = new LidNode();
        for (ParseTree item: ctx.children){
            result.keys.add(new VarNode(item.getText()));
        }
        return result;
    }

    @Override
    public InfixNode visitReport(abapParser.ReportContext ctx) {
        ReportNode reportNode = new ReportNode();
        reportNode.name = ctx.rep.getText();
        return reportNode;
    }

    @Override
    public InfixNode visitClear(abapParser.ClearContext ctx) {
        ClearNode clearNode = new ClearNode();
        for (ParseTree pt : ctx.co.children){
            clearNode.vars.add(visit(pt));
        }
        return clearNode;
    }

    @Override
    public InfixNode visitElseifloop(abapParser.ElseifloopContext ctx) {
        ConditionNode result = new ConditionNode();
        result.elseif = true;
        result.condition = visit(ctx.con);
        int size = ctx.if_body.getChildCount();
        for ( int i = 0; i<size; i++ ) {
            result.body.add(visit(ctx.if_body.children.get(i)) ) ;
        }
        return result;
    }

    @Override
    public InfixNode visitArithmeticNode(abapParser.ArithmeticNodeContext ctx) {
        ExprNode result = new ExprNode();
        result.left = visit(ctx.p1);
        result.right = visit(ctx.p2);
        result.op = ctx.rel.getText();
        return result;
    }

    @Override
    public InfixNode visitSelect(abapParser.SelectContext ctx) {

        SelectNode result = (SelectNode)visit(ctx.pswrodf);
        if(ctx.single!=null)result.single = ctx.single.getText();
        if(ctx.what != null){
            LidNode ld = (LidNode) visit(ctx.what);
            result.cols = ld.keys;
        }
        if(ctx.par!=null)result.par = true;
        result.source = new VarNode(ctx.data_source.getText(), true);
        if(ctx.tabalias!=null)result.tabalias = new VarNode(ctx.tabalias.getText());
        if(ctx.in != null)result.inner = true;
        if(ctx.dir!=null)result.direction = ctx.dir.getText();
        if(ctx.out!=null)result.outer = true;
        if(ctx.cross!=null)result.cross = true;
        if(ctx.pjoin!=null){
            visit(ctx.pjoin); //TODO
        }


        Optimalizator opt = Optimalizator.getINSTANCE();
        opt.registerSelect(result);
        return result;
    }

    @Override
    public InfixNode visitReadtable(abapParser.ReadtableContext ctx) {
        ReadTabNode result = new ReadTabNode();
        result.table = visit(ctx.table);
        result.var = visit(ctx.result);
        result.ptype = ctx.ptype.getText();

        for (ParseTree pt: ctx.rtabk.cls.children
             ) {
            result.rtabkeys.add((ExprNode) visit(pt));
        }

        Optimalizator optimalizator = Optimalizator.getINSTANCE();
        optimalizator.registerRead(result);
        return result;
    }

    @Override
    public InfixNode visitRtable_key(abapParser.Rtable_keyContext ctx) {

        return super.visitRtable_key(ctx);
    }

    @Override
    public InfixNode visitTransport_options(abapParser.Transport_optionsContext ctx) {
        return super.visitTransport_options(ctx);
    }

    @Override
    public InfixNode visitCasting(abapParser.CastingContext ctx) {
        return super.visitCasting(ctx);
    }

    @Override
    public InfixNode visitInline_fields_declaration(abapParser.Inline_fields_declarationContext ctx) {
        VarNode result = (VarNode) visit(ctx.children.get(2));
        result.inline = true;
        return result;
    }

    @Override
    public InfixNode visitCols(abapParser.ColsContext ctx) {
        return super.visitCols(ctx);
    }

    @Override
    public InfixNode visitCol(abapParser.ColContext ctx) {
        ExprNode result = new ExprNode();
        result.left = new VarNode(ctx.p1.getText() , true);
        result.op = ctx.pop.getText();
        result.right = visit(ctx.p2);
        return result;
    }

    @Override
    public InfixNode visitS_cond(abapParser.S_condContext ctx) {
        return visit(ctx.children.get(0));
    }

    @Override
    public InfixNode visitDeclaration(abapParser.DeclarationContext ctx) {
        DeclarNode result = (DeclarNode) visit(ctx.pdecl);
        if (ctx.pstruct != null){
            result.struct = new VarNode(ctx.pstruct.getText());
        }
        return result;
    }

    @Override
    public InfixNode visitDecl_each(abapParser.Decl_eachContext ctx) {
        DataNode result = new DataNode();

        result.pvar = new VarNode(ctx.pvar.getText());      //VarNode
        result.ptype = new VarNode(ctx.ptype.getText(),true);      //VarNode
        if(ctx.pblen != null) result.pblen = Integer.parseInt(ctx.pblen.getText()); ;      //int
        if(ctx.ptp != null) result.ptp = ctx.ptp.getText() ;      //String
        if(ctx.ptbl != null) result.ptbl = true ;        //boolean
        if(ctx.ptbtp != null) result.ptbtp = ctx.ptbtp.getText() ;      //String
        if(ctx.ptp2 != null) result.ptp2 = ctx.ptp2.getText() ;        //String
        if(ctx.pof != null) result.pof = true ;      //boolean
        if(ctx.pref != null) result.pref = true ;        //boolean
        if(ctx.palen != null) result.palen = Integer.parseInt(ctx.palen.getText()) ;      //int
        if(ctx.pkeys != null){
            LidNode ld = (LidNode)visit(ctx.pkeys);
            ArrayList<InfixNode> pkeys = ld.keys;
            result.pkeys = pkeys; //ArrayList
        }
        if(ctx.pdec != null) result.pdec = Integer.parseInt(ctx.pdec.getText()) ;        //int
        if(ctx.ptabkeys  != null) {
            LidNode ld = (LidNode) visit(ctx.ptabkeys);
            ArrayList<InfixNode> pkeys = ld.keys;
            result.ptabkeys = pkeys;        //ArrayList
        }
        if(ctx.pinitsize != null) result.pinitsize = Integer.parseInt(ctx.pinitsize.getText()) ;      //int
        if(ctx.pheader != null) result.pheader = true;        //boolean
        if(ctx.ptval != null) result.ptval = true ;      //boolean
        if(ctx.pval != null) result.pval = (ValueNode)visit(ctx.pval) ;
        if(ctx.pinit != null) result.pinit = true ;      //boolean
        //if(ctx.pred != null) result.pred = true ;      //boolean
        if(ctx.pbox != null ) result.pbox = true ;



        Optimalizator opt = Optimalizator.getINSTANCE();
        opt.registerDeclar(result);
        return result;
    }

    @Override
    public InfixNode visitTabkeys(abapParser.TabkeysContext ctx) {
        return super.visitTabkeys(ctx);
    }

    @Override
    public InfixNode visitJoin_cond(abapParser.Join_condContext ctx) {
        return super.visitJoin_cond(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public InfixNode visitProg(ProgContext ctx) {
        BlockNode blockNode = new BlockNode();
        int size = ctx.getChildCount();
        for ( int i = 0; i<size; i++ ) {
            blockNode.statements.add(visit(ctx.children.get(i)) ) ;
        }
        return  blockNode;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public InfixNode visitStatement(abapParser.StatementContext ctx) {
        return visit(ctx.children.get(0));
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public InfixNode visitEmpty(abapParser.EmptyContext ctx) {
        return new EmptyNode();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public InfixNode visitComment(abapParser.CommentContext ctx) {

        return new CommentNode(ctx.children.get(0).getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public InfixNode visitVar(abapParser.VarContext ctx) {
        return visit(ctx.children.get(0));
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public InfixNode visitBlock(abapParser.BlockContext ctx) {
        BlockNode blockNode = new BlockNode();
        int size = ctx.getChildCount();
        for ( int i = 0; i<size; i++ ) {
            blockNode.statements.add(visit(ctx.children.get(i)) ) ;
        }
        return  blockNode;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public InfixNode visitElseif(abapParser.ElseifContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public InfixNode visitLoop(abapParser.LoopContext ctx) {
        LoopNode result = new LoopNode();
        result.from = (VarNode) visit(ctx.lfrom);
        result.to = (VarNode)visit(ctx.lto);
        int size = ctx.lblock.getChildCount();
        for ( int i = 0; i<size; i++ ) {
            InfixNode node = visit(ctx.lblock.children.get(i));
            result.statements.add(node);
        }


        Optimalizator opt = Optimalizator.getINSTANCE();
        opt.registerLoop(result);
        return result;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public InfixNode visitComparationNode(abapParser.ComparationNodeContext ctx) {
        CompNode result = new CompNode();
        result.p1 = visit(ctx.p1);
        result.p2 = visit(ctx.p2);
        VarNode varNode = (VarNode) visit(ctx.rel);
        result.op = varNode.variable;
        return result;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public InfixNode visitVarNode(abapParser.VarNodeContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public InfixNode visitSort_key(abapParser.Sort_keyContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public InfixNode visitIndex(abapParser.IndexContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public InfixNode visitInline_data_declaration(abapParser.Inline_data_declarationContext ctx) {
        VarNode result = new VarNode(ctx.children.get(2).getText());
        result.inline = true;
        return result;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public InfixNode visitOp(abapParser.OpContext ctx) {
        VarNode result = new VarNode(ctx.rel.getText());
        return result;
    }


    private String getVal(String data){
        Pattern pattern = Pattern.compile("'(.*?)'");
        Matcher matcher = pattern.matcher(data);
        if (matcher.find())
        {
            return matcher.group(1);
        }
        return "";
    }

    private String getContextType(String data){
        String result = "";
        Pattern pattern = Pattern.compile("\\$(.*)");
        Matcher matcher = pattern.matcher(data);
        if (matcher.find())
        {
            return matcher.group(1);
        }
        return result;
    }

}

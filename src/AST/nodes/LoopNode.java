package AST.nodes;

import java.util.ArrayList;

public class LoopNode implements InfixNode {


    public VarNode from;
    public VarNode to;
    public ArrayList<InfixNode> statements;


    public LoopNode() {
        this.statements = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LOOP ");
        if(!to.fsymb)
            sb.append("AT ");
        sb.append(from.toString());
        if(to.fsymb){
            sb.append(" ASSIGNING ");
        }else{
            sb.append(" INTO ");
        }
        sb.append( to.toString() + ".\n");
        for (InfixNode statement : statements)
        {
            sb.append(statement.toString());
        }

        sb.append("ENDLOOP.\n");
        return sb.toString();
    }

    @Override
    public void optimize() {

    }

    @Override
    public void optimizeRead() {
        for (InfixNode statement : statements)
        {
            statement.optimizeRead();
        }
    }
}

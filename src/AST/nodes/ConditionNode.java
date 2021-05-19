package AST.nodes;

import java.util.ArrayList;

public class ConditionNode implements InfixNode {

    public boolean elseif = false;
    public InfixNode condition;
    public ArrayList<InfixNode> body;
    public ArrayList<InfixNode> else_body;
    public ArrayList<InfixNode> elseif_blocks;



    public ConditionNode() {
        this.body = new ArrayList<>();
        this.elseif_blocks = new ArrayList<>();
        this.else_body = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if(elseif)
            stringBuilder.append("ELSE");
        stringBuilder.append("IF ( ");
        stringBuilder.append(condition.toString());
        stringBuilder.append(" ).\n");
        for (InfixNode statement : body)
        {
            stringBuilder.append(statement.toString());
           // stringBuilder.append("\n");
        }
        for (InfixNode elseif: elseif_blocks
             ) {
            stringBuilder.append(elseif.toString());
        }
        if(else_body.size()!=0){
            stringBuilder.append("ELSE\n");
            for (InfixNode statement : else_body)
            {
                stringBuilder.append(statement.toString());
               // stringBuilder.append("\n");
            }
        }
        if(!elseif)
            stringBuilder.append("ENDIF.\n");
        return stringBuilder.toString();
    }

    @Override
    public void optimize() {

    }

    @Override
    public void optimizeRead() {
        for (InfixNode statement : body)
        {
            statement.optimizeRead();
        }
        for (InfixNode statement : else_body)
        {
            statement.optimizeRead();
        }
        for (InfixNode statement : elseif_blocks)
        {
            statement.optimizeRead();
        }
    }

}

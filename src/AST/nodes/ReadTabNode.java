package AST.nodes;

import java.util.ArrayList;

public class ReadTabNode implements InfixNode {


    public InfixNode table;
    public InfixNode var;
    public ArrayList<ExprNode> rtabkeys;
    public String ptype = "";

    public ReadTabNode() {
        this.rtabkeys = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("READ TABLE ");
        sb.append(table.toString());
        if(rtabkeys.size()!=0){
            sb.append("\n WITH TABLE KEY ");
            for (InfixNode item: rtabkeys
                 ) {
                sb.append("\n" + item.toString() );
            }
        }
        sb.append("\n" + ptype + " ");
        sb.append(var.toString());
        sb.append(".\n");
        return sb.toString();
    }

    @Override
    public void optimize() {

    }

    @Override
    public void optimizeRead() {
        return;
    }
}

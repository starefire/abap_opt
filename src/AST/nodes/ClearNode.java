package AST.nodes;

import java.util.ArrayList;

public class ClearNode implements InfixNode {


    public ArrayList<InfixNode> vars;


    public ClearNode() {
        this.vars = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CLEAR");
        int size = vars.size();
        if (size > 1){
            sb.append(':');
        }
        sb.append(' ');
        if (size > 0){
            sb.append(vars.get(0).toString());
        }
        for(int i = 1; i < size ; i++) {
            sb.append(",\n"+vars.get(i).toString());
        }
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

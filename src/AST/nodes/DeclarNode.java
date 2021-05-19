package AST.nodes;

import java.util.ArrayList;

public class DeclarNode implements InfixNode {


    public DeclarNode() {
        this.declars = new ArrayList<>();
    }

    public VarNode struct = null;
    public ArrayList<DataNode> declars;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

            if(struct!=null) {
                stringBuilder.append("TYPES: BEGIN OF ");
                stringBuilder.append(struct.variable + ",\n");
            }else{
                stringBuilder.append("DATA: ");
            }

            if(declars.size()==1){
                stringBuilder.append(declars.get(0).toString());
            }else if (declars.size()>1) {
                for (int i = 0; i < declars.size() - 1; i++) {
                    stringBuilder.append(declars.get(i).toString() + ",\n");
                }
                stringBuilder.append(declars.get(declars.size()-1).toString());
                if(struct!=null)
                    stringBuilder.append(",\n");
            }
            if(struct!=null){
                stringBuilder.append("END OF ");
                stringBuilder.append(struct.variable);
            }
            stringBuilder.append(".\n");
        return stringBuilder.toString();
    }

    @Override
    public void optimize() {

    }

    @Override
    public void optimizeRead() {
        for (InfixNode statement: declars
             ) {
            statement.optimizeRead();
        }
    }
}

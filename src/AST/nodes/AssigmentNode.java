package AST.nodes;

public class AssigmentNode implements InfixNode {


    public InfixNode where;
    public InfixNode what;


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(where.toString());
        stringBuilder.append(" = ");
        stringBuilder.append(what.toString());
        stringBuilder.append(".\n");
        return stringBuilder.toString();
    }

    @Override
    public void optimize() {

    }

    @Override
    public void optimizeRead() {
        return;
    }

}

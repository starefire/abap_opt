package AST.nodes;

public class ReportNode implements InfixNode {


    public String name;

    @Override
    public String toString() {
        return "report " + name + ".\n";
    }

    @Override
    public void optimize() {

    }

    @Override
    public void optimizeRead() {
        return;
    }
}

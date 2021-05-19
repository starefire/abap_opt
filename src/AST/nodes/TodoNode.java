package AST.nodes;

public class TodoNode implements InfixNode {

    @Override
    public String toString() {
        return "Ještě nutno dodělat!!!";
    }

    @Override
    public void optimize() {

    }

    @Override
    public void optimizeRead() {
        return;
    }


}

package AST.nodes;

public class EmptyNode implements InfixNode {

    @Override
    public String toString() {
            return ".\n";
    }

    @Override
    public void optimize() {

    }

    @Override
    public void optimizeRead() {
        return;
    }


}

package AST.nodes;

public interface InfixNode {

    @Override public String toString();

    public void optimize();

    public void optimizeRead();
}

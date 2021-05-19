package AST.nodes;

public class CompNode implements InfixNode {

    public InfixNode p1;
    public String op;
    public InfixNode p2;

    @Override
    public void optimize() {

    }

    @Override
    public void optimizeRead() {
        return;
    }

    @Override
    public String toString() {
        return  p1 + " " + op + " " + p2 ;
    }
}

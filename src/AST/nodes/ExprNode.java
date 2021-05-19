package AST.nodes;

public class ExprNode implements InfixNode {

    public InfixNode left;
    public boolean sparen = false;
    public boolean rparen = false;
    public String op;
    public InfixNode right;

    @Override
    public void optimize() {

    }

    @Override
    public void optimizeRead() {
        return;
    }

    @Override
    public String toString() {
        return  left.toString() + " " + op.toString() + " " +  right.toString() ;
    }
}

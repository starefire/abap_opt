package AST.nodes;

public class CommentNode implements InfixNode {

    public String value;

    public CommentNode(String value) {
        this.value = value;
    }

    @Override
    public void optimize() {

    }

    @Override
    public void optimizeRead() {
        return;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(value + "\n");

        return sb.toString();
    }
}

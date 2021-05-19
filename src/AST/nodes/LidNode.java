package AST.nodes;

import java.util.ArrayList;

public class LidNode implements InfixNode {
    public LidNode() {
        this.keys = new ArrayList<>();
    }

    public ArrayList<InfixNode> keys;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (InfixNode statement : keys)
        {
            stringBuilder.append(statement.toString());
        }

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

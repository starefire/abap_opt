package AST.nodes;

import java.util.*;

public class ProgNode implements InfixNode {
    public ProgNode() {
        this.statements = new ArrayList<>();
    }

    public ArrayList<InfixNode> statements;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (InfixNode statement : statements)
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
        for (InfixNode statement : statements)
        {
            statement.optimizeRead();
        }

    }
}

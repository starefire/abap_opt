package AST.nodes;

public class ValueNode implements InfixNode {



    public String value;
    public int value_int;

    public ValueNode(int value) {
        this.value_int = value;
    }

    public ValueNode(String value){
        this.value = value;
    }


    @Override
    public void optimize() {}

    @Override
    public void optimizeRead() {
        return;
    }

    @Override
    public String toString() {

        StringBuilder sb =  new StringBuilder();
        if (value != null){
            sb.append('\'' + value +'\'');
        }else{
            sb.append(value_int);
        }

        return sb.toString();
    }
}

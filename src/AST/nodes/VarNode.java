package AST.nodes;

import Optimalizator.Optimalizator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VarNode implements InfixNode {



    public String variable;
    public boolean inline = false;
    public boolean fsymb = false;
    public String column;

    @Override
    public void optimize() {

    }

    @Override
    public void optimizeRead() {
        return;
    }

    public VarNode(String variable, boolean suppress){
        create(variable);
        if(!suppress){
            Optimalizator opt = Optimalizator.getINSTANCE();
            opt.registerVar(this);
        }
    }

    public VarNode(String variable) {
        Optimalizator opt = Optimalizator.getINSTANCE();
        create(variable);
        opt.registerVar(this);
    }

    private void create(String variable){
        if(variable.contains("-")){
            String result = "";
            Pattern pattern = Pattern.compile("(.*)-(.*)");
            Matcher matcher = pattern.matcher(variable);
            if (matcher.find())
            {
                this.variable = matcher.group(1);
                this.column = matcher.group(2);
            }
        }else{
            this.variable = variable;
        }
    }

    @Override
    public String toString() {

        StringBuilder sb =  new StringBuilder();
        if (inline){
            if(fsymb){
                sb.append("FIELD-SYMBOL(");
            }else{
                sb.append("DATA(");
            }

        }
        if(fsymb){
            sb.append('<'+variable+'>');
        } else{
            sb.append(variable);
        }
        if(inline){
            sb.append(')');
        }
        if (column != null){
            sb.append('-'+column);
        }
        return sb.toString();
    }
}

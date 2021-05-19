package AST.nodes;

import java.util.ArrayList;

public class SelectNode implements InfixNode {


    public String single;
    public ArrayList<InfixNode> cols;
    public boolean par = false;
    public VarNode source;
    public VarNode tabalias;
    public boolean inner = false;
    public String direction;
    public boolean outer = false;
    public boolean cross = false;
    public String mod;
    public VarNode itab;
    public InfixNode where;
    public ArrayList<InfixNode> group;
    public InfixNode having;
    public String wt;
    public ArrayList<InfixNode> order;
    public boolean cor = false;
    public boolean table = false;
    public boolean atsign = false;
    public VarNode target;
    public int rows;
    public boolean join = false;
    public InfixNode joincond;
    public SelectNode select;

    public SelectNode() {
        this.cols = new ArrayList<>();
        this.group = new ArrayList<>();
        this.order = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb. append("SELECT ");
        if(single != null){
            if (single.toUpperCase().equals("UPDATE"))
                sb.append(" SINGLE FOR ");
            sb.append(single+" ");
        }
        if(cols.size() == 0){
            sb.append(" * ");
        }else{
            boolean first = true;
            for (InfixNode item: cols
                 ) {
                if(!first){
                    sb.append(',');
                }
                first = false;
                sb.append(item.toString() + " ");
            }
        }
        sb.append("\nFROM ");
        if(par==true){
            sb.append("(");
        }
        sb.append(source.toString());
        if(tabalias != null)
            sb.append(" AS "+ tabalias.toString()+" ");
        if(join == true ){
            if(inner == true)
                sb.append(" INNER ");
            if(direction != null)
                sb.append(direction);
            if(cross == true)
                sb.append("  CROSS ");
            sb.append(" JOIN ");

        }
        if(joincond != null)
            sb.append(" " + joincond.toString() + " ");
        if(par==true){
            sb.append(")");
        }
        sb.append("\n");
        if(rows!=0) {
            sb.append(" UP TO " + rows + " rows ");
            sb.append("\n");
        }
        sb.append(" " + mod + " ");
        if(cor == true)
            sb.append(" CORRESPONDING FIELDS OF ");
        if(table == true)
            sb.append(" TABLE ");
        if(atsign == true)
            sb.append("@");
        sb.append(target.toString());
        sb.append("\n");
        if(itab!=null){
            sb.append(" FOR ALL ENTERIES IN "+itab.toString());
            sb.append("\n");
        }
        if(where!=null){
            sb.append(" WHERE "+where.toString());
            sb.append("\n");
        }
        if(group.size()!=0) {
            sb.append(" GROUP BY ");
            for (InfixNode item : group
                    ) {
                sb.append(item.toString() + " ");
            }
            sb.append("\n");
        }
        if(having!=null) {
            sb.append(" HAVING ");
            sb.append(having.toString());
            sb.append("\n");
        }
        if(select!=null){
            sb.append(" UNION ");
            if(wt!=null)
                sb.append(" " + wt +" ");
            sb.append("  "+ select.toString());
            sb.append("\n");
        }
        if(order.size()!=0){
                sb.append(" ORDER BY ");
            for (InfixNode item: order
                 ) {
                sb.append(item.toString()+ " ");
            }
            sb.append("\n");
        }

        sb.append(".\n");

        return sb.toString();
    }

    @Override
    public void optimize() {

    }

    @Override
    public void optimizeRead() {
        return;
    }
}

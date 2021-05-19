package AST.nodes;

import java.util.ArrayList;

public class DataNode implements InfixNode {

    public VarNode pvar;
    public VarNode ptype;
    public int pblen;
    public String ptp;
    public boolean ptbl;
    public String ptbtp;
    public String ptp2;
    public boolean pof;
    public boolean pref;
    public int palen;
    public ArrayList<InfixNode> pkeys;
    public int pdec;
    public ArrayList<InfixNode> ptabkeys;
    public int pinitsize;
    public boolean pheader;
    public boolean ptval;
    public ValueNode pval;
    public boolean pinit;
    public boolean pread;
    public boolean pbox;


    public DataNode() {
        this.pkeys = new ArrayList<>();
        this.ptabkeys = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

            stringBuilder.append(pvar.toString() + " ");
            if(pblen!=0)
                stringBuilder.append("(" + pblen +")");
            stringBuilder.append(" "+ptp+" ");
            if(ptbtp!=null)
                stringBuilder.append(ptbtp);
            if(ptbl == true)
                stringBuilder.append(" TABLE ");
            if(ptp2 != null)
                stringBuilder.append(ptp2);
            if(pof == true)
                stringBuilder.append(" OF ");
            if(pref == true)
                stringBuilder.append(" REF TO ");
            stringBuilder.append(ptype.toString());
            if(palen != 0)
                stringBuilder.append(" LENGTH "+palen+" ");
            if(pkeys.size() != 0){
                stringBuilder.append(" WITH UNIQUE KEY ");
                for (InfixNode item: pkeys
                     ) {
                    stringBuilder.append(item.toString()+ " ");
                }
            }
            if(pdec != 0)
                stringBuilder.append(" DECIMALS "+pdec+" ");
            if(ptabkeys.size() != 0){
                for (InfixNode item: ptabkeys
                        ) {
                    stringBuilder.append(item.toString() + " ");
                }
            }
            if(pinitsize != 0)
                stringBuilder.append(" INITIAL SIZE "+pinitsize+" ");
            if(pheader == true)
                stringBuilder.append(" WITH HEADER LINE ");
            if(ptval== true)
                stringBuilder.append(" VALUE ");
            if(pval!=null)
                stringBuilder.append(pval.toString());
            if(pinit == true)
                stringBuilder.append(" IS INITIAL ");
            if(pread == true)
                stringBuilder.append(" READONLY ");
            if(pbox == true)
                stringBuilder.append(" BOXED ");

        return stringBuilder.toString();
    }

    @Override
    public void optimize() {

    }

    @Override
    public void optimizeRead() {
        return;
    }

    public void optimizeRead(ReadTabNode readTabNode) {
        ptbtp = "SORTED";
        for (ExprNode varNode: readTabNode.rtabkeys
             ) {
            if(!pkeys.contains(varNode.left))
                pkeys.add(varNode.left);
        }
    }
}

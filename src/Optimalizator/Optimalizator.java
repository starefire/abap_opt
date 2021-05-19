package Optimalizator;

import AST.nodes.*;

import java.util.ArrayList;

public class Optimalizator {

    private static Optimalizator INSTANCE;
    private InfixNode ast;

    //ccontrol parameters
    private boolean opt_select = false;
    private boolean opt_var = false;
    private boolean opt_read = false;


    private ArrayList<SelectNode> selects;
    private ArrayList<VarNode> vars;
    private ArrayList<ReadTabNode> reads;
    private ArrayList<AssigmentNode> assigns;
    private ArrayList<DataNode> declars;
    private ArrayList<LoopNode> loops;

    public boolean optimalize = false;

    private Optimalizator(){
        this.selects = new ArrayList<>();
        this.vars = new ArrayList<>();
        this.reads = new ArrayList<>();
        this.declars = new ArrayList<>();
        this.assigns = new ArrayList<>();
        this.loops = new ArrayList<>();
    }

    public static Optimalizator getINSTANCE() {
        if (INSTANCE == null){
            INSTANCE = new Optimalizator();
        }
        return INSTANCE;
    }

    public void set_ast(InfixNode ast){
        this.ast = ast;
    }

    public void set_opt_select () {
        optimalize = true;
        opt_select = true;
    }


    public void set_opt_read () {
        optimalize = true;
        opt_read = true;
    }


    public void set_opt_var (String prefix){
        optimalize = true;
        opt_var = true;
        this.prefix = prefix;
    }

    public void unreg_var (int pos){
        int len = this.vars.size();
        this.vars.remove(len-pos);
    }

    public void what_to_opt() {
        if (!optimalize){
            System.out.println("Nothing to do.");
            return;
        }
        if (this.opt_select){
            System.out.println("Optimalization of select will be done.");
        }
        if (this.opt_var){
            System.out.println("Optimalization of var will be done with prefix " + prefix + ".");
        }
        if (this.opt_read){
            System.out.println("Optimalization of read will be done.");
        }

    }


    private String  prefix = "";

    public void optimize () {
        if(!optimalize) return;
        if (this.opt_var){
            System.out.println("Start optimalization - VAR.");
            optimize_prefix();
        }

        if (this.opt_select){
            System.out.println("Start optimalization - SELECT.");

            optimize_select();
        }

        if (this.opt_read){
            System.out.println("Start optimalization - READ.");
            optimize_read();
        }

    }

    public void registerSelect (SelectNode selectNode){
        if(!selects.contains(selectNode))
            selects.add(selectNode);
    }

    public void registerVar(VarNode var){
        if(!vars.contains(var))
            vars.add(var);
    }

    public void registerRead(ReadTabNode readTabNode){
        if(!reads.contains(readTabNode))
            reads.add(readTabNode);
    }

    public void registerDeclar(DataNode dataNode){
        if(!declars.contains(dataNode))
            declars.add(dataNode);
    }

    public void registerAssign (AssigmentNode assignNode){
        if(!assigns.contains(assignNode)){
            assigns.add(assignNode);
        }
    }

    private void optimize_select(){
        int size = selects.size();
        for(int i = 0;i<size;i++){
            if (selects.get(i).cols.size()==0){
                selects.get(i).cols = new ArrayList<>();
                int varsize = vars.size();
                for(int l = 0;l<varsize;l++){
                    if((vars.get(l).variable.equals(selects.get(i).target.variable))){
                        String str = (vars.get(l).column);
                        if(!selects.get(i).cols.contains(vars.get(l).column))
                            if(str!=null)
                                selects.get(i).cols.add(new VarNode(vars.get(l).column, true));
                    }
                }
                for (AssigmentNode assi: assigns
                     ) {
                    if(assi.what.equals(selects.get(i).target.variable)){
                        for(int l = 0;l<varsize;l++){
                            if((vars.get(l).variable.equals(assi.where))){
                                String str = (vars.get(l).column);
                                if(!selects.get(i).cols.contains(vars.get(l).column))
                                    if(str!=null)
                                        selects.get(i).cols.add(new VarNode(vars.get(l).column, true));
                            }
                        }
                    }
                }

                for (LoopNode loop: loops
                        ) {
                    if(loop.from.variable.equals(selects.get(i).target.variable)){
                        for(int l = 0;l<varsize;l++){
                            if((vars.get(l).variable.equals(loop.to.variable))){
                                String str = (vars.get(l).column);
                                if(!selects.get(i).cols.contains(vars.get(l).column))
                                    if(str!=null)
                                        selects.get(i).cols.add(new VarNode(vars.get(l).column, true));
                            }
                        }
                    }
                }

            }
        }
    }

    private void optimize_prefix(){
        int varsize = vars.size();
        for(int i = 0;i<varsize;i++){
            String s = vars.get(i).variable;
            if(!s.startsWith(prefix) && !s.startsWith("sy")){
                vars.get(i).variable = prefix+vars.get(i).variable;
            }
        }
    }

    private void optimize_read(){
        int readsize = reads.size();
        for(int i = 0;i<readsize;i++){
            for (DataNode decNode: declars
                 ) {
                if( decNode.pvar.variable.equals(reads.get(i).table.toString())){
                    decNode.optimizeRead(reads.get(i));
                }
            }

        }
    }

    public void registerLoop(LoopNode loopNode) {
        if(!loops.contains(loopNode))
            loops.add(loopNode);
    }
}

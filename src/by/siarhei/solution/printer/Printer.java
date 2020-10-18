package by.siarhei.solution.printer;

import by.siarhei.solution.tag.Tag;

public  class Printer<C extends Tag> {

    private C context;

    public Printer() {
    }
    
    public void setContext(C context){
        this.context = context;
    }

    public void print() {
        if(this.context != null) {
            System.out.println(this.context.toString());
        } else {
            System.err.println("Cannot print with reason: 'context wasn't set'.");
        }
    }
}

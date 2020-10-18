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
        System.out.println(this.context.toString());
    }
}

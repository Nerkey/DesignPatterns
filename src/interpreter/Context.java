package interpreter;

import java.util.Hashtable;

public class Context {

    private Hashtable table = new Hashtable();

    public void assign(Variable var, boolean value) {
        table.put(var, value);
    }

    public boolean lookup(Variable var) {
        return (boolean) table.get(var);
    }

}

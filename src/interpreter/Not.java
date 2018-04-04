package interpreter;

public class Not extends Expression {

    private Expression exp;

    public Not(Expression exp) {
        this.exp = exp;
    }

    @Override
    public boolean interpret(Context context) {
        return !exp.interpret(context);
    }
}

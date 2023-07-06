package Scream;

import java.util.List;

public class ScreamFunction implements ScreamCallable{
    private final Stmt.Function declaration;
    private final Environment closure;
    ScreamFunction(Stmt.Function declaration, Environment closure) {
        this.closure = closure;
        this.declaration = declaration;
    }

    @Override
    public String toString() {
        return "<fn " + declaration.name.lexeme + " >";
    }

    @Override
    public int arity() {
        return declaration.params.size();
    }

    @Override
    public Object call(InterPreter interPreter, List<Object> arguments) {
        Environment environment = new Environment(closure);

        for (int i=0; i<declaration.params.size(); i++) {
            environment.define(declaration.params.get(i).lexeme, arguments.get(i));
        }

        try {
            interPreter.executeBlock(declaration.body, environment);
        } catch (Return returnValue) {
            return returnValue.value;
        }

        return null;
    }
}

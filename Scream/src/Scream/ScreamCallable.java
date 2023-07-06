package Scream;

import java.util.List;

public interface ScreamCallable {

    int arity();
    Object call (InterPreter interPreter, List<Object> arguments);
}

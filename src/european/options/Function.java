package european.options;

import java.util.HashMap;
import java.util.Map;

public abstract class Function {
    public abstract double evaluate(HashMap<String, Double> parameters);
}

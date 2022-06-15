import org.antlr.v4.runtime.ParserRuleContext;

import java.util.Arrays;
import java.util.HashMap;

public class Tradutor extends GramaticaBaseListener {
    private static HashMap<String, String> variaveis_lista = new HashMap<String, String>();

    public static boolean checkVariables(String variavel) {
        for (String key : variaveis_lista.keySet()) {
            if (key.equals(variavel)) {
                return true;
            }
        }
        return false;
    }

}

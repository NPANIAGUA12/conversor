import java.util.HashMap;
import java.util.Map;

public class Divisas {
    //mapeo de las divisas
    public static final Map<String,String> DIVISAS = new HashMap<>() {{
        put("ARS", "Peso argentino");
        put("BOB", "Boliviano boliviano");
        put("BRL", "Real brasileño");
        put("CLP", "Peso chileno");
        put("COP", "Peso colombiano");
        put("USD", "Dólar estadounidense");
        put("EUR", "Euro");
    }};
}

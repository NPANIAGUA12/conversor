import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;

public class ConvertidorDivisa {
    private static final HistorialConversiones historial = new HistorialConversiones();

    public static void convertirDivisa(String targetCurrency, String baseCurrency) {
        try {
            String jsonData = ConsultaAPI.obtenerDatosDivisas(baseCurrency);

            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson (jsonData, JsonObject.class);
            double rate = jsonObject.getAsJsonObject("conversion_rates")
                    .get(targetCurrency).getAsDouble();

            double amount = 1.0;
            double convertedAmount = amount * rate;

            System.out.println("-------------------------------------------------");
            System.out.println("Resultado de la conversión:");
            System.out.printf("1 %s equivale a %.2f %s\n", baseCurrency
                    ,convertedAmount, targetCurrency);
            System.out.println("-------------------------------------------------\n");

            historial.agregarRegistro(baseCurrency, targetCurrency, rate, amount);

        } catch (IOException | InterruptedException e) {
            System.out.println("Error al obtener la tasa de cambio: " + e.getMessage());
        }
    }
}

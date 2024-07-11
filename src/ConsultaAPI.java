import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {

    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";
    private static final String API_KEY = "d05f15a8008f70e9c827695a";
    private static final String ENDPOINT = "/latest/"; // Endpoint

    public static String obtenerDatosDivisas(String baseCurrency) throws IOException, InterruptedException {
        // Cliente
        HttpClient client = HttpClient.newHttpClient();
        String url = BASE_URL + API_KEY + ENDPOINT + baseCurrency;

        //Solicitud de cliente
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        // Respuesta
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}



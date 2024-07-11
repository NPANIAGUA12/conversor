import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.time.format.DateTimeFormatter;


public class HistorialConversiones {
    private static List<RegistroConversion> historial = new ArrayList<>();
    private static final DateTimeFormatter formatter = DateTimeFormatter
            .ofPattern("yyyy-MM-dd 'T'HH:mm:ss");

    public void agregarRegistro(String baseCurrency,
                                String targetCurrency,
                                double rate,
                                double amount) {
        RegistroConversion registro = new RegistroConversion(baseCurrency,
                targetCurrency, rate,
                amount,
                LocalDateTime.now());
        historial.add(registro);
    }

    public static void mostrarHistorial(){
        System.out.println("-------------------------------------------------");
        System.out.println("Historial de conversiones");
        for(RegistroConversion registro : historial) {
            System.out.printf("%s - 1 %s a %.2f %s\n",
                    registro.getFechaHora().format(formatter),
                    registro.getBaseCurrency(),
                    registro.getConvertedAmount(),
                    registro.getTargetCurrency(),
                    registro.getRate());
        }
        System.out.println("-------------------------------------------------\n");
    }
}

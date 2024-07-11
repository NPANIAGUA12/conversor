import java.time.LocalDateTime;

public class RegistroConversion {
    private String baseCurrency;
    private String targetCurrency;
    private double rate;
    private double amount;
    private double convertedAmount;
    private LocalDateTime fechaHora;

    public RegistroConversion(String baseCurrency,
                              String targetCurrency,
                              double rate,
                              double amount,
                              LocalDateTime fechaHora) {
        this.baseCurrency = baseCurrency;
        this.targetCurrency = targetCurrency;
        this.rate = rate;
        this.amount = amount;
        this.convertedAmount = amount * rate;
        this.fechaHora = fechaHora;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public double getRate() {
        return rate;
    }

    public double getConvertedAmount() {
        return convertedAmount;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
}



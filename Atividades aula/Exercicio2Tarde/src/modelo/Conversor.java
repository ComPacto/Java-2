package modelo;

/**
 *
 * @author Müller Gonçalves
 * @since 16/04/2018 - 14:09
 * @version 1.0
 */
public class Conversor {

    private double real;
    private double dolar;
    private double euro;
    private double bitcoin;

    public Conversor() {
    }
    
    /**
     * 
     * @param real Recebe o valor em reais
     * @param dolar Recebe o valor em dolares
     * @param euro Recebe o valor em euros
     * @param bitcoin Recebe o valor em bitcoin
     */
    public Conversor(double real, double dolar, double euro, double bitcoin) {
        this.real = real;
        this.dolar = dolar;
        this.euro = euro;
        this.bitcoin = bitcoin;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double getEuro() {
        return euro;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public double getBitcoin() {
        return bitcoin;
    }

    public void setBitcoin(double bitcoin) {
        this.bitcoin = bitcoin;
    }

    /**
     *
     * @return Converte real para dolar
     */
    public double converterParaDolar() {
        return real * dolar;
    }

    /**
     *
     * @return Converter real para euro
     */
    public double converterParaEuro() {
        return real * euro;
    }

    /**
     *
     * @return Converte real para bitcoin
     */
    public double converterParaBitcoin() {
        return real * bitcoin;
    }

    @Override
    public String toString() {
        return "Real = " + real + "\n"
                + "Dolar = " + dolar + "\n"
                + "Euro = " + euro + "\n"
                + "Bitcoin = " + bitcoin + "\n"
                + "Valor do real em dólar = " + converterParaDolar() + "\n"
                + "Valor do real em euro = " + converterParaEuro() + "\n"
                + "Valor do real em bitcoin = " + converterParaBitcoin();
    }

}

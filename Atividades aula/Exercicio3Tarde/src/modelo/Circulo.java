package modelo;

/**
 *
 * @author Müller Gonçalves
 * @since 16/04/2018 - 14:58
 * @version 1.0
 */
public class Circulo {

    private double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, raio);
    }

    @Override
    public String toString() {
        return "Raio = " + raio + "\n"
                + "Perímetro = " + calcularPerimetro() + "\n"
                + "Área = " + calcularArea();
    }

}

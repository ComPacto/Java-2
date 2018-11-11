package modelo;

/**
 *
 * @author Müller Gonçalves
 * @since 16/04/2018 - 13:43
 * @version 1.0
 */
public class Retangulo {

    private double altura;
    private double largura;

    public Retangulo() {
    }
    
    /**
     * 
     * @param altura Recebe a altura do triângulo
     * @param largura Recebe a largura do triângulo
     */
    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    /**
     * 
     * @return Calcula a área do retângulo 
     */
    public double calcularAreaRetangulo() {
        return largura * altura;
    }
    
    /**
     * 
     * @return Calcula o perímetro do retângulo 
     */
    public double calcularPerimetro() {
        return (largura * 2) + (altura * 2);
    }

    @Override
    public String toString() {
        return "Altura = " + altura + "\n"
                + "Largura = " + largura + "\n"
                + "Área do retângulo =  " + calcularAreaRetangulo() + "\n"
                + "Perímetro = " + calcularPerimetro();
    }

}

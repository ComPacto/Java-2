package modelo;

/**
 *
 * @author Müller Gonçalves
 * @since 16/04/2018 - 15:33
 * @version 1.0
 */
public class Calculo {

    private double a;
    private double b;
    private double c;

    public Calculo() {
    }

    /**
     *
     * @param a Recebe o valor de A
     * @param b Recebe o valor de B
     * @param c Recebe o valor de C
     */
    public Calculo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    /**
     * 
     * @return Calcula o delta 
     */
    public double calcularDelta() {
        return (Math.pow(b, 2)) - (4 * a * c);
    }
    
    /**
     * 
     * @return Calcula X1 
     */
    public double calcularX1() {
        return (-b + Math.sqrt(calcularDelta())) / (2 * a);
    }
    
    /**
     * 
     * @return Calcula X2 
     */
    public double calcularX2() {
        return (-b - Math.sqrt(calcularDelta())) / (2 * a);
    }
    
    /**
     * 
     * @return Verifica se a raiz é positiva ou negativa
     */
    public String verificarRaiz(){
        if (calcularDelta() < 0) {
            return "A raiz é negativa";
        }
        return "A raiz é positiva";
    }

    @Override
    public String toString() {
        return "A = " + a + "\n"
                + "B = " + b + "\n"
                + "C = " + c + "\n"
                + "Delta = " + calcularDelta() + "\n"
                + "X1 = " + calcularX1() + "\n"
                + "X2 = " + calcularX2() + "\n"
                + "Verificação da raiz = " + verificarRaiz();
    }

}

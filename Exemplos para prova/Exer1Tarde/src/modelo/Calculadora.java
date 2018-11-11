package modelo;

/**
 *
 * @author Fernando de Aragão Gonçalves
 * @since 17/04/2018 15:38
 * @version 1.0
 */
public class Calculadora {

    private double n1;
    private double n2;

    public Calculadora() {
    }

    /**
     *
     * @param n1 receber um valor.
     * @param n2 receber um valor.
     */
    public Calculadora(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    /**
     *
     * @return retorna a soma dos números
     */
    public double calcularSoma() {
        return n1 + n2;
    }

    /**
     *
     * @return retorna a subtração dos números
     */
    public double calcularSubtracao() {
        return n1 - n2;
    }

    /**
     *
     * @return retorna a divisão dos números
     *
     */
    public double calcularDivisao() {
        return n1 / n2;
    }

    /**
     *
     * @return retorna a multiplicação dos números
     */
    public double calcularMultiplicacao() {
        return n1 * n2;
    }

    /**
     * 
     * @param op receber a opção escolhida pelo usuário
     * @return retorna o cálculo
     */
    public String mostrar(String op) {
        if (op.equalsIgnoreCase("Somar")) {
            return n1 + " + " + n2 + " = " + calcularSoma();
        } else if (op.equalsIgnoreCase("Subtrair")) {
            return n1 + " - " + n2 + " = " + calcularSubtracao();
        } else if (op.equalsIgnoreCase("Dividir")) {
            return n1 + " / " + n2 + " = " + calcularDivisao();
        } else if (op.equalsIgnoreCase("Multiplicar")) {
            return n1 + " * " + n2 + " = " + calcularMultiplicacao();
        } else {
            return n1 + " + " + n2 + " = " + calcularSoma() + "\n"
                    + n1 + " - " + n2 + " = " + calcularSubtracao() + "\n"
                    + n1 + " / " + n2 + " = " + calcularDivisao() + "\n"
                    + n1 + " * " + n2 + " = " + calcularMultiplicacao();
        }
    }
}
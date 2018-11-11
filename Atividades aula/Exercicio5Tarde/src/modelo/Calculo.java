package modelo;

/**
 *
 * @author Müller Gonçalves
 * @since 16/04/2018 - 16:01
 * @version 1.0
 */
public class Calculo {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Calculo() {
    }
    
    /**
     * 
     * @param x1 Recebe x1
     * @param y1 Recebe y1
     * @param x2 Recebe x2
     * @param y2 Recebe y2
     */
    public Calculo(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    /**
     * 
     * @return Calcula a distância dos pontos
     */
    public double calcularParOrdenado(){
        return Math.hypot(x1-x2, y1-y2);
    }

    @Override
    public String toString() {
        return "X1 = " + x1 + "\n"
                + "Y1 = " + y1 + "\n"
                + "X2 = " + x2 + "\n"
                + "Y2 = " + y2 + "\n"
                + "Distância entre eles = " + calcularParOrdenado();
    }
    
    
}

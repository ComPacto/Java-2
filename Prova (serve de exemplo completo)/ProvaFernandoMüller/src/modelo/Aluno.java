package modelo;

import java.util.ArrayList;

/**
 *
 * @author Müller Gonçalves & Fernando Aragão
 * @since 19/04/2018 - 13:44
 * @version 1.0
 */
public class Aluno {
    private String nome;
    private String sexo;
    private double n1;
    private double n2;
    private double p1;
    private double p2;
    private double totalDeAulas;
    private double numeroPresencas;
    private ArrayList<String> disc;

    public Aluno() {
    }
    
    /**
     * 
     * @param nome Recebe o nome do aluno
     * @param sexo Recebe o sexo do aluno
     * @param n1 Recebe a N1 do aluno
     * @param n2 Recebe a N2 do aluno
     * @param p1 Recebe a P1 do aluno
     * @param p2 Recebe a P2 do aluno
     * @param totalDeAulas Recebe o total de aulas
     * @param numeroPresencas Recebe o total de aulas presenciadas pelo aluno
     * @param disc Recebe as disciplinas do aluno
     */
    public Aluno(String nome, String sexo, double n1, double n2, double p1, double p2, double totalDeAulas, double numeroPresencas, ArrayList<String> disc) {
        this.nome = nome;
        this.sexo = sexo;
        this.n1 = n1;
        this.n2 = n2;
        this.p1 = p1;
        this.p2 = p2;
        this.totalDeAulas = totalDeAulas;
        this.numeroPresencas = numeroPresencas;
        this.disc = disc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getTotalDeAulas() {
        return totalDeAulas;
    }

    public void setTotalDeAulas(double totalDeAulas) {
        this.totalDeAulas = totalDeAulas;
    }

    public double getNumeroPresencas() {
        return numeroPresencas;
    }

    public void setNumeroPresencas(double numeroPresencas) {
        this.numeroPresencas = numeroPresencas;
    }

    public ArrayList<String> getDisc() {
        return disc;
    }

    public void setDisc(ArrayList<String> disc) {
        this.disc = disc;
    }
    
    /**
     * 
     * @return Calcula a média aritmética do aluno
     */
    public double calcularMediaAritmetica(){
        return (n1 + n2) / 2;
    }
    
    /**
     * 
     * @return Calcula a média ponderada do aluno 
     */
    public double calcularMediaPonderada(){
        return (n1 * p1 + n2 * p2) / (p1+p2);
    }
    
    /**
     * 
     * @return  Retorna a nota como conceito alfabético
     */
    public String verificarConceito(){
        if (calcularMediaAritmetica() >= 9){
            return "A";
        } else if (calcularMediaAritmetica() >= 8){
            return "B";
        } else if (calcularMediaAritmetica() >=6) {
            return "C";
        }
        return "D";
    }
    
    /**
     * 
     * @return Retorna a frequência do aluno 
     */
    public double verificarFrequencia(){
        return numeroPresencas * 100 / totalDeAulas;      
    }
    
    /**
     * 
     * @return Retorna se o aluno está aprovado (ou não) 
     */
    public String verificarAprovacao(){
        if (calcularMediaAritmetica() >= 6 && verificarFrequencia() >= 75) {
            return "Aluno aprovado";
        }
        return "Aluno reprovado";
    }

    @Override
    public String toString() {
        String mensagem = "";
        for (int i = 0; i < disc.size(); i++) {
            mensagem = mensagem + "\n - " + disc.get(i);
        }
        return "Nome: " + nome + "\n"
                + "Sexo: " + sexo + "\n"
                + "N1: " + n1 + "\n"
                + "N2: " + n2 + "\n"
                + "P1: " + p1 + "\n"
                + "P2: " + p2 + "\n"
                + "Total de aulas: " + totalDeAulas + "\n"
                + "Número de presenças: " + numeroPresencas + "\n"
                + "Disciplina: " + mensagem + "\n"
                + "Média do Aluno: " + calcularMediaAritmetica() + "\n"
                + "Média ponderada: " + calcularMediaPonderada() + "\n"
                + "Conceito do aluno: " + verificarConceito() + "\n"
                + "Frequência do aluno: " + verificarFrequencia() + "%\n"
                + "Estado do aluno: " +verificarAprovacao() + "\n\n";
    } 
}

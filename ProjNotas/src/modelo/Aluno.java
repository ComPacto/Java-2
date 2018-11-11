package modelo;

/**
 *
 * @author Müller Gonçalves
 * @since 15/04/2018 - 18:24
 * @version 1.0
 */
public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private byte qtdPresencas;
    private int numeroTotalDeAulas;

    public Aluno() {
    }
    
    /**
     * 
     * @param nome Recebe o nome
     * @param nota1 Recebe a nota 1
     * @param nota2 Recebe a nota 2
     * @param qtdPresencas Recebe a quantidade de presença em aulas do aluno    
     * @param numeroTotalDeAulas Rece o número total de aulas executadas
     */
    public Aluno(String nome, double nota1, double nota2, byte qtdPresencas, int numeroTotalDeAulas) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.qtdPresencas = qtdPresencas;
        this.numeroTotalDeAulas = numeroTotalDeAulas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public byte getQtdPresencas() {
        return qtdPresencas;
    }

    public void setQtdPresencas(byte qtdPresencas) {
        this.qtdPresencas = qtdPresencas;
    }

    public int getNumeroTotalDeAulas() {
        return numeroTotalDeAulas;
    }

    public void setNumeroTotalDeAulas(int numeroTotalDeAulas) {
        this.numeroTotalDeAulas = numeroTotalDeAulas;
    }
    
    /**
     * 
     * @return Retorna a média total do aluno 
     */
    public double calcularMediaAritmetica(){
        return (nota1 + nota2) / 2;
    }
    
    /**
     * 
     * @return Calcula a média do aluno e verifica se o aluno está aprovado baseado na nota 
     */
    public String verificarAprovacao(){
        if (calcularMediaAritmetica() >= 6) {
            return "Aluno aprovado por nota";
        }
        return "Aluno reprovado";
    }
    
    /**
     * 
     * @return Calcula a frequência do aluno e verifica se está aprovado baseado na frequência 
     */
    public double calcularFrequenciaAluno(){
        return qtdPresencas * 100 / numeroTotalDeAulas;
    }

    @Override
    public String toString() {
        return "Nome = " + nome + "\n"
                + "N1 = " + nota1 + "\n"
                + "N2 = " + nota2 + "\n"
                + "Quantidade de presenças = " + qtdPresencas + "\n"
                + "Número total de aulas = " + numeroTotalDeAulas + "\n"
                + "Média final = " + calcularMediaAritmetica() + "\n"
                + "Status da aprovação por nota = " + verificarAprovacao() + "\n"
                + "Total de frequência = " + calcularFrequenciaAluno() + "%";
    }
    
    
}

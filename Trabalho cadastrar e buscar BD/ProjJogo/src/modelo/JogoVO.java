package modelo;

/**
 *
 * @author Müller Gonçalves e Fernando 
 */
public class JogoVO {
    private long idJogo;
    private int quantidade;
    private String nome;
    private String desenvolvedora;
    private double valor;
    private String classificacao;

    public JogoVO() {
    }

    public long getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(long idJogo) {
        this.idJogo = idJogo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public String toString() {
        return "JogoVO{" + "idJogo=" + idJogo + ", quantidade=" + quantidade + ", nome=" + nome + ", desenvolvedora=" + desenvolvedora + ", valor=" + valor + ", classificacao=" + classificacao + '}';
    } 
}

package modelo;

/**
 *
 * @author Müller Gonçalves
 * @since 24/04/2018 - 16:45
 * @version 1.0
 */
public class Cliente {
    private String nome;
    private int cpf;

    public Cliente() {
    }

    public Cliente(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n"
                + "CPF: " + cpf;
    }
    
    
}

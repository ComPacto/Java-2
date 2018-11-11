package modelo;

import java.util.ArrayList;

/**
 *
 * @author Müller Gonçalves
 * @since 18/04/2018 - 15:26
 * @version 1.0
 */
public class Cliente{
    private String nome;
    private String sexo;
    private boolean possuiCartao;
    protected byte quantidadeDeCartoes;
    private ArrayList<String> cartoes;
    private ArrayList<String> contas;

    public Cliente(){
    }
    
    /**
     * 
     * @param nome Recebe nome da pessoa
     * @param sexo Recebe sexo da pessoa
     * @param possuiCartao Recebe se a pessoa possui cartões
     * @param quantidadeDeCartoes Recebe a quantidade de cartões
     * @param cartoes Recebe quais cartões ela possui
     * @param contas Recebe qual conta ele possui
     */
    public Cliente(String nome, String sexo, boolean possuiCartao, byte quantidadeDeCartoes, ArrayList<String> cartoes, ArrayList<String> contas){
        this.nome = nome;
        this.sexo = sexo;
        this.possuiCartao = possuiCartao;
        this.quantidadeDeCartoes = quantidadeDeCartoes;
        this.cartoes = cartoes;
        this.contas = contas;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSexo(){
        return sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public boolean isPossuiCartao(){
        return possuiCartao;
    }

    public void setPossuiCartao(boolean possuiCartao){
        this.possuiCartao = possuiCartao;
    }

    public byte getQuantidadeDeCartoes(){
        return quantidadeDeCartoes;
    }

    public void setQuantidadeDeCartoes(byte quantidadeDeCartoes)
    {
        this.quantidadeDeCartoes = quantidadeDeCartoes;
    }

    public ArrayList<String> getCartoes(){
        return cartoes;
    }

    public void setCartoes(ArrayList<String> cartoes){
        this.cartoes = cartoes;
    }

    public ArrayList<String> getContas(){
        return contas;
    }

    public void setContas(ArrayList<String> contas){
        this.contas = contas;
    }

    @Override
    public String toString(){
        String mensagem = "";
  
        mensagem = "Nome: " + nome + "\n"
                + "Sexo: " + sexo + "\n"
                + "O cliente possui cartão? " + possuiCartao;
            mensagem = "Quantidade de cartões: " + quantidadeDeCartoes;
                for(int i = 0; i < cartoes.size(); i++){
                    mensagem += "\n - " + cartoes.get(i);
                }
                for(int i = 0; i < contas.size(); i++){
                    mensagem += "\n - " + contas.get(i);
                }
        
        return mensagem;
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.sun.org.apache.xml.internal.utils.StringToStringTable;

/**
 *
 * @author Alunos
 */
public class Pessoa {
    
    private String nome;
    private String sexo;

    public Pessoa() {
    }

    /**
     * 
     * @param construindo método nome
     * @param construindo método sexo 
     */
    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
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
    
    public String verificarSexo(){
        if (sexo.equalsIgnoreCase("Masculino")){
            return "você é homem";
        }
            return "você é mulher";
    }//fecha método
    
     public String verificarOP(String op){
        if (op.equalsIgnoreCase("1")){
            return "você escolhe opção número 1!";
        }
        return "você escolheu opção número 2!";
    }//fecha método
    @Override
    public String toString(){
        return  "\n"
                + "Nome : " + nome + "\n"
                + "Sexo : " + sexo + "\n"
                + "Seu Sexo é : " + verificarSexo();
    }    
}

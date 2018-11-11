package modelo;

import java.util.ArrayList;

/**
 *
 * @author Müller Gonçalves
 * @since 18/04/2018 - 14:03
 * @version 1.0
 */
public class Pessoa
{

    private String nome;
    private ArrayList<String> prefs;

    public Pessoa(){
    }
    
    /**
     * 
     * @param nome Recebe o nome da pessoa
     * @param prefs Recebe as preferências da pessoa
     */
    public Pessoa(String nome, ArrayList<String> prefs){
        this.nome = nome;
        this.prefs = prefs;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public ArrayList<String> getPrefs(){
        return prefs;
    }

    public void setPrefs(ArrayList<String> prefs){
        this.prefs = prefs;
    }

    @Override
    public String toString(){
        String preferenciaBonita = "";
        
        for (int i = 0; i < prefs.size(); i++){
            preferenciaBonita = preferenciaBonita + "\n" + prefs.get(i);
        }
        
        if (prefs.isEmpty()){
            return "Nome: " + nome;
        }
        return "\nNome: " + nome + "\n"
                + "Preferência: " + preferenciaBonita;
    }

}

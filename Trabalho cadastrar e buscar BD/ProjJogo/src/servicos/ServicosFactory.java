/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 *
 * @author Alunos
 */
public class ServicosFactory {
    
    public static final JogoServicos JS = new JogoServicos();
    
    public static JogoServicos getJogoServicos() {
        return JS;
    }
}

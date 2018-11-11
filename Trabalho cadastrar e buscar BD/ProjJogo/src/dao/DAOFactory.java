package dao;

/**
 *
 * @author Alunos
 */
public class DAOFactory {
    
    private static final JogoDAO JDAO = new JogoDAO();
    
    public static JogoDAO getJogoDAO() {
        return JDAO;
    }
}

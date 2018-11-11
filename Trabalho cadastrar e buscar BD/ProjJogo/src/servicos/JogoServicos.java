package servicos;

import dao.DAOFactory;
import dao.JogoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.JogoVO;

/**
 *
 * @author Alunos
 */
public class JogoServicos {
    
    
    public void cadastrarJogo(JogoVO jVO) throws SQLException {
        JogoDAO JDAO = DAOFactory.getJogoDAO();
        JDAO.cadastrarJogo(jVO);
    }
    
    public ArrayList<JogoVO> buscarJogos() throws SQLException {
        JogoDAO JDAO = DAOFactory.getJogoDAO();
        return JDAO.buscarJogos();
    }
}

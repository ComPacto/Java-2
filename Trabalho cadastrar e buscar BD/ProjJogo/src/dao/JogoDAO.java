package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.JogoVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author Alunos
 */
public class JogoDAO {
    
    public void cadastrarJogo(JogoVO jVO) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            
            sql = "insert into jogo(idjogo,nome,desenvolvedora,classificacao,quantidade,valor)"
                    + "values(null,"
                    + " '"+jVO.getNome()+"',"
                    + " '"+jVO.getDesenvolvedora()+"',"
                    + " '"+jVO.getClassificacao()+"',"
                    + jVO.getQuantidade()+","
                    + jVO.getValor()+")";
            
            stat.execute(sql);
            
        } catch (SQLException e) {
           throw new SQLException("Erro ao cadastrar jogo! "+e.getMessage()); 
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public ArrayList<JogoVO> buscarJogos() throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            
            sql = "select * from jogo";
            ResultSet rs = stat.executeQuery(sql);
            
            ArrayList<JogoVO> jogo = new ArrayList<>();
            
            while(rs.next()) {
               JogoVO objJogo = new JogoVO();
               objJogo.setIdJogo(rs.getLong("idjogo"));
               objJogo.setQuantidade(rs.getInt("quantidade"));
               objJogo.setNome(rs.getString("nome"));
               objJogo.setDesenvolvedora(rs.getString("desenvolvedora"));
               objJogo.setValor(rs.getDouble("valor"));
               objJogo.setClassificacao(rs.getString("classificacao"));
               jogo.add(objJogo);
            }
            return jogo;           
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar o jogo! " +e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
}

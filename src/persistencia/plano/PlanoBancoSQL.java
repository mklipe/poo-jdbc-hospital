
package persistencia.plano;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Plano;
import persistencia.ConexaoBanco;

/**
 *
 * @author mauricio 
 */
public class PlanoBancoSQL implements IPlanoBancoDados{

    
    @Override
    public void adicionar(Plano plano) {
        String sql = 
                "INSERT INTO PLANO (NOME, MENSALIDADE) " +
                "VALUES (?, ?)";
        
        PreparedStatement stmt = null;
        Connection con = ConexaoBanco.getConnection();
        try {
            stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, plano.getNome());
            stmt.setFloat(2, plano.getMensalidade());
            
            System.out.println("[INFO] SQL Gerada: " + stmt.toString());
            
            stmt.execute();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if (rs.next()) {
                Long codigoGerado = rs.getLong(1);
                plano.setCodigo(codigoGerado);
            }            
            
            stmt.close();
            con.close();
            
            System.out.println("[INFO] Plano cadastrado com sucesso!");
            
        } catch (SQLException e) {
            System.out.println("[ERRO] Ocorreu uma falha ao gravar os dados na base!");
            throw new RuntimeException(e);
        } 
    }

    @Override
    public void alterar(Plano plano) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Plano plano) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}

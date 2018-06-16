
package persistencia.endereco;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Endereco;
import persistencia.ConexaoBanco;

/**
 *
 * @author mauricio
 */
public class EnderecoBancoSQL implements IEnderecoBancoDados{

    @Override
    public void adicionar(Endereco endereco) {
        String sql = 
                "INSERT INTO ENDERECO (LOGRADOURO, BAIRRO, NUMERO, CEP) " +
                "VALUES (?, ?, ?, ?)";
        
        
        
        PreparedStatement stmt = null;
        Connection con = ConexaoBanco.getConnection();
        try {
            stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, endereco.getLogradouro());
            stmt.setString(2, endereco.getBairro());
            stmt.setString(3, endereco.getNumero());
            stmt.setString(4, endereco.getCep());
            
            System.out.println("[INFO] SQL Gerada: " + stmt.toString());
            stmt.execute();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if (rs.next()) {
                Long codigoGerado = rs.getLong(1);
                endereco.setCodigo(codigoGerado);
            }   
            
            stmt.close();
            con.close();
            
            System.out.println("[INFO] ENDEREÇO cadastrado com sucesso!");
            
        } catch (SQLException e) {
            System.out.println("[ERRO] Ocorreu uma falha ao gravar os dados no banco!");
            throw new RuntimeException(e);
        } 
    }

    @Override
    public void alterar(Endereco endereco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Endereco endereco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

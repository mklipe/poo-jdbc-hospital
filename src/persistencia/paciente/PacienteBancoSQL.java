
package persistencia.paciente;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.List;
import modelo.Paciente;
import modelo.Pessoa;
import persistencia.ConexaoBanco;

/**
 *
 * @author mauricio
 */
public class PacienteBancoSQL implements IPacienteBancoDados{

    
    @Override
    public void adicionar(Paciente paciente) {
        adicionarDadosTabelaPessoa(paciente);
        adicionarDadosTabelaPaciente(paciente);
        
    }



    @Override
    public void alterar(Paciente paciente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Paciente paciente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Paciente> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Paciente> consultar(String nome, Calendar dataNascimento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void adicionarDadosTabelaPessoa(Pessoa pessoa) {
        String sql = 
                "INSERT INTO PESSOA (NOME, DATA_NASCIMENTO, CODIGO_ENDERECO, CPF) " +
                "VALUES (?, ?, ?, ?)";
        
        PreparedStatement stmt = null;
        Connection con = ConexaoBanco.getConnection();
        try {
            stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, pessoa.getNome());
            stmt.setDate(2, new Date(pessoa.getDataNascimento().getTimeInMillis()));
            stmt.setLong(3, pessoa.getEndereco().getCodigo());
            stmt.setString(4, pessoa.getCpf());
            
            System.out.println("[INFO] SQL Gerada: " + stmt.toString());
            stmt.execute();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if (rs.next()) {
                Long codigoGerado = rs.getLong(1);
                pessoa.setCodigo(codigoGerado);
            }  
            
            stmt.close();
            con.close();
            
            System.out.println("[INFO] Pessoa cadastrado com sucesso!");
            
        } catch (SQLException e) {
            System.out.println("[ERRO] Ocorreu uma falha ao gravar os dados no banco!");
            throw new RuntimeException(e);
        } 
    }

    private void adicionarDadosTabelaPaciente(Paciente paciente) {
        String sql = 
                "INSERT INTO PACIENTE (CODIGO_PESSOA, CODIGO_PLANO, STATUS) " +
                "VALUES (?, ?, ?)";
        
        PreparedStatement stmt = null;
        Connection con = ConexaoBanco.getConnection();
        try {
            stmt = con.prepareStatement(sql);
            
            stmt.setLong(1, paciente.getCodigo());
            stmt.setLong(2, paciente.getPlano().getCodigo());
            stmt.setInt(3, paciente.getStatus().getValue());
            
            System.out.println("[INFO] SQL Gerada: " + stmt.toString());
            stmt.execute();
            
            stmt.close();
            con.close();
            
            System.out.println("[INFO] Pessoa cadastrado com sucesso!");
            
        } catch (SQLException e) {
            System.out.println("[ERRO] Ocorreu uma falha ao gravar os dados no banco!");
            throw new RuntimeException(e);
        } 
    }
    
}

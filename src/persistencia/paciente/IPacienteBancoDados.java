package persistencia.paciente;


import java.util.Calendar;
import modelo.Paciente;
import java.util.List;


public interface IPacienteBancoDados {

    public void adicionar(Paciente paciente) throws RuntimeException;

    public void alterar(Paciente paciente);

    public void excluir(Paciente paciente);

    public List<Paciente> listarTodos();

    public List<Paciente> consultar(String nome, Calendar dataNascimento);
    
}

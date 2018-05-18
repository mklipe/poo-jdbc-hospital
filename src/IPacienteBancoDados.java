
import java.util.List;


public interface IPacienteBancoDados {

    public void adicionar(Paciente paciente);

    public void alterar(Paciente paciente);

    public void excluir(Paciente paciente);

    public List<Paciente> listarTodos();
    
}

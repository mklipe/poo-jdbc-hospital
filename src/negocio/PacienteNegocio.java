package negocio;

import modelo.Paciente;
import java.util.Calendar;
import java.util.List;
import persistencia.paciente.IPacienteBancoDados;
import persistencia.paciente.PacienteBancoSQL;

public class PacienteNegocio {

    private IPacienteBancoDados bancoDeDados;
    
    public PacienteNegocio() {
        this.bancoDeDados = new PacienteBancoSQL();
        
    }

    public void cadastrar(Paciente paciente) {
        try {
            bancoDeDados.adicionar(paciente);
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        }
    }

    public void alterar(Paciente paciente) {
        bancoDeDados.alterar(paciente);
    }

    public void excluir(Paciente paciente) {
        bancoDeDados.excluir(paciente);
    }

    public Paciente consultar(String CPF) {

        Paciente paciente = new Paciente();
        paciente.setCpf(CPF);

        return paciente;
    }

    public List<Paciente> consultar(String nome, Calendar dataNascimento) {

        List<Paciente> pacientes = bancoDeDados.consultar(nome, dataNascimento);

        return pacientes;
    }

    public List<Paciente> listarTodos() {
        return bancoDeDados.listarTodos();
    }
}

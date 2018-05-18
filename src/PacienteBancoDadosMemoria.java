

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class PacienteBancoDadosMemoria implements IPacienteBancoDados{







	private List<Paciente> pacientes;
	
	public PacienteBancoDadosMemoria() {
		this.pacientes = new ArrayList<>();
	}
	
	public void adicionar(Paciente paciente) {
		
		if (!pacientes.contains(paciente)) {
			pacientes.add(paciente);
		} 
	}
	
	public void alterar(Paciente paciente) {
		
		int posicao = pacientes.indexOf(paciente);
		pacientes.set(posicao, paciente);
	}
	
	public void excluir(Paciente paciente) {
		pacientes.remove(paciente);
	}
	
	public List<Paciente> listarTodos() {
		return Collections.unmodifiableList(pacientes);
	}

}
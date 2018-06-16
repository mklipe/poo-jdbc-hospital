package modelo;

import modelo.enums.StatusPaciente;


public class Paciente extends Pessoa{
    private Plano plano;
    private StatusPaciente status;
    
    public Paciente(){
        this.status = StatusPaciente.ATIVO;
    }
    
    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }
    
    public StatusPaciente getStatus(){
        return status;
    }
    
    public void setStatusPaciente(StatusPaciente status){
        this.status = status;
    }
   

    
    
}

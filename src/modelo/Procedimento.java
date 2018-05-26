package modelo;


import java.util.ArrayList;
import java.util.Date;


public abstract class Procedimento {
    Paciente paciente;
    ArrayList<Medico> medicos;
    Date data;
    Sala sala;
    String obervacoes;
    int tempoDuracao;
    float valor;
    
}

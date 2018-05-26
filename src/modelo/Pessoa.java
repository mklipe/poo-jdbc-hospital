package modelo;


import java.util.Calendar;


public abstract class Pessoa {
    private String nome;
    private String cpf;
    private Calendar dataNascimento;
    private Endereco endereco;
    private Long codigo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public void setDataNascimento(Integer dia, Integer mes, Integer ano){
        dataNascimento = Calendar.getInstance();
        dataNascimento.set(ano, mes - 1, dia); 
       
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    
    
}

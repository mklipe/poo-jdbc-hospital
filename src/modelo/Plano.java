package modelo;

public class Plano {
    private String nome;
    private Float mensalidade;
    private Long codigo;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(Float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    
}

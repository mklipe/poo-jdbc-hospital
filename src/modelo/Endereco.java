package modelo;


public class Endereco {
    private String logradouro;
    private String numero;
    private String bairro;
    private String cep;
    private Long codigo;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Long getCodigo() {
        return codigo;
    }
    
    public void setCodigo(Long codigo){
        this.codigo = codigo;
    }
    
    
}

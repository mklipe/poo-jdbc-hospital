
public enum CorUniforme {
    
    
    VERMELHO ("Vermelho"),
    AMARELO ("Amarelo"),
    PRETO ("Preto"),
    AZUL ("Azul"),
    VERDE ("Verde"),
    VERDE_LARANJA ("Verde e Laranja");
    
    String cor;
    
    CorUniforme(String cor){
        this.cor = cor;
    }
    
    public String getCor(){
        return cor;
    }
}

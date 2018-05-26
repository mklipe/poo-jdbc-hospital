
package modelo.enums;

/**
 *
 * @author mauricio
 */
public enum StatusPaciente {
    ATIVO(1),
    INATIVO(2),
    EXCLUIDO(3),
    CANCELADO(4);
    
    StatusPaciente(int value){
        this.value = value;
    }
    
    private int value;
    
    public int getValue() {
        return this.value;
    }
}

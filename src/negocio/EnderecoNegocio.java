
package negocio;

import modelo.Endereco;
import persistencia.endereco.IEnderecoBancoDados;
import persistencia.endereco.EnderecoBancoSQL;

/**
 *
 * @author mauricio
 */
public class EnderecoNegocio {
    private IEnderecoBancoDados bancoDeDados;
    
    public EnderecoNegocio() {
        this.bancoDeDados = new EnderecoBancoSQL();
    }

    public void cadastrar(Endereco endereco) {
        try {
            bancoDeDados.adicionar(endereco);
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        }
    }

    public void alterar(Endereco endereco) {
        bancoDeDados.alterar(endereco);
    }

    public void excluir(Endereco endereco) {
        bancoDeDados.excluir(endereco);
    }

    
}


package persistencia.endereco;

import modelo.Endereco;

/**
 *
 * @author mauricio
 */
public interface IEnderecoBancoDados {

    public void adicionar(Endereco endereco);

    public void alterar(Endereco endereco);

    public void excluir(Endereco endereco);
    
}

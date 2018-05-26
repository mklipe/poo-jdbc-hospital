
package persistencia.plano;

import modelo.Plano;

/**
 *
 * @author mauricio
 */
public interface IPlanoBancoDados {

    public void adicionar(Plano plano);

    public void alterar(Plano plano);

    public void excluir(Plano plano);
    
}

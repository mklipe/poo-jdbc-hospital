
package negocio;

/**
 *
 * @author mauricio
 */

import modelo.Plano;
import persistencia.plano.IPlanoBancoDados;
import persistencia.plano.PlanoBancoSQL;

/**
 *
 * @author mauricio
 */
public class PlanoNegocio {
    private IPlanoBancoDados bancoDeDados;
    
    public PlanoNegocio() {
        this.bancoDeDados = new PlanoBancoSQL();
        
    }

    public void cadastrar(Plano plano) {
        try {
            bancoDeDados.adicionar(plano);
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        }
    }

    public void alterar(Plano plano) {
        bancoDeDados.alterar(plano);
    }

    public void excluir(Plano plano) {
        bancoDeDados.excluir(plano);
    }

    
}


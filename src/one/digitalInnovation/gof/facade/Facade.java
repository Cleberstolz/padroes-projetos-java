package one.digitalInnovation.gof.facade;

import one.digitalInnovation.gof.subsistema1.crm.CrmService;
import one.digitalInnovation.gof.subsistema2.cep.CepApi;

public class Facade {

    public void migrarCiente(String nome, String cep) {
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);


        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}

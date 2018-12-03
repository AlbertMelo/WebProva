/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import javax.ejb.EJB;
import modelo.Metar;


/**
 *
 * @author Albert Lima de Melo
 */

public class Local implements ILocal{
    
    private Metar local;
    
    Local(){
        local = null;
    }
    
    public Metar consomeDados(String codigo){
        
        Client cliente = new Client();
        WebResource resource = cliente.resource("http://servicos.cptec.inpe.br/XML/estacao/"+codigo+"/condicoesAtuais.xml");
        Metar local = resource.get(Metar.class);
        
        return local;      
    }

    @Override
    public Metar getLocal() {
        return local;
    }
    
   
    
}

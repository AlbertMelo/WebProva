/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Albert Lima de Melo
 */

@Entity
public class Estacao implements Serializable {
    
    @Id
    private String codigo;
    private String aeroporto;
    private String estado;

    public String getSigla() {
        return codigo;
    }

    public void setSigla(String sigla) {
        this.codigo = sigla;
    }

    public String getAeroporto() {
        return aeroporto;
    }

    public void setAeroporto(String aeroporto) {
        this.aeroporto = aeroporto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
}

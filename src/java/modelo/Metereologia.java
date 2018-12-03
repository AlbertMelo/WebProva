/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Albert Lima de Melo
 */

@Entity
public class Metereologia implements Serializable {
    
    @Id
    @GeneratedValue
    private Long id;
    private String codigo;
    private Date dataHora;
    private Integer pressao;
    private Double temperatura;
    private String tempo_desc;
    private Double umidade;
    private Long visibilidade;
    private Estacao estacao;

    public Metereologia() {
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Integer getPressao() {
        return pressao;
    }

    public void setPressao(Integer pressao) {
        this.pressao = pressao;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public String getTempo_desc() {
        return tempo_desc;
    }

    public void setTempo_desc(String tempo_desc) {
        this.tempo_desc = tempo_desc;
    }

    public Double getUmidade() {
        return umidade;
    }

    public void setUmidade(Double umidade) {
        this.umidade = umidade;
    }

    public Long getVisibilidade() {
        return visibilidade;
    }

    public void setVisibilidade(Long visibilidade) {
        this.visibilidade = visibilidade;
    }

    public Estacao getEstacao() {
        return estacao;
    }

    public void setEstacao(Estacao estacao) {
        this.estacao = estacao;
    }
    
    
    
}

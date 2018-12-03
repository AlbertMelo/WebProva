/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Albert Lima de Melo
 */

@XmlRootElement
public class Metar implements Serializable{
    
    
    private String codigo;
    private String atualizacao;
    private String pressao;
    private String temperatura;
    private String tempo;
    private String tempo_desc;
    private String umidade;
    private String vento_dir;
    private String vento_int;
    private String visibilidade;

    public Metar() {
    }
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAtualizacao() {
        return atualizacao;
    }

    public void setAtualizacao(String atualizacao) {
        this.atualizacao = atualizacao;
    }

    public String getPressao() {
        return pressao;
    }

    public void setPressao(String pressao) {
        this.pressao = pressao;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getTempo_desc() {
        return tempo_desc;
    }

    public void setTempo_desc(String tempo_desc) {
        this.tempo_desc = tempo_desc;
    }

    public String getUmidade() {
        return umidade;
    }

    public void setUmidade(String umidade) {
        this.umidade = umidade;
    }

    public String getVento_dir() {
        return vento_dir;
    }

    public void setVento_dir(String vento_dir) {
        this.vento_dir = vento_dir;
    }

    public String getVento_int() {
        return vento_int;
    }

    public void setVento_int(String vento_int) {
        this.vento_int = vento_int;
    }

    public String getVisibilidade() {
        return visibilidade;
    }

    public void setVisibilidade(String visibilidade) {
        this.visibilidade = visibilidade;
    }
    
    
    
}

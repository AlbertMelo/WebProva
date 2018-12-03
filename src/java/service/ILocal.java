/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import modelo.Metar;

/**
 *
 * @author Albert Lima de Melo
 */
public interface ILocal {
    
    public Metar consomeDados(String codigo);
    public Metar getLocal();
    
    
}

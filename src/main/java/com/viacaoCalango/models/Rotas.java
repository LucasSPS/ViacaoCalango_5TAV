/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viacaoCalango.models;

import java.util.HashSet;
import java.util.LinkedList;

/**
 *
 * @author Lucas
 */
public class Rotas {

    private String localPartida;
    private String localDestino;
    private int qntParadas;
    private HashSet<String> paradas = new HashSet<String>();
    private double preço;

    public Rotas(String _localPartida, String _localDestino, double _preço, String... _parada) {
        localPartida = _localPartida;
        localDestino = _localDestino;
        qntParadas = _parada.length;
        preço = _preço;

        for (int i = 0; i < qntParadas; i++) {
            paradas.add(_parada[i]);
            System.out.println(paradas);
        }
    }

    public boolean embarqueDiferenteDeDestino() {
        if(localDestino==localPartida){
            return false;
        }       
        return true;
    }
    
    /*public boolean paradasSaoDiferentes() {
        if(paradas.contains(this))
        
        if(localDestino==localPartida){
            return false;
        }       
        return true;
    }*/

    public String getLocalPartida() {
        return localPartida;
    }

    public void setLocalPartida(String localPartida) {
        this.localPartida = localPartida;
    }

    public String getLocalDestino() {
        return localDestino;
    }

    public void setLocalDestino(String localDestino) {
        this.localDestino = localDestino;
    }

    public int getQntParadas() {
        return qntParadas;
    }

    public void setQntParadas(int qntParadas) {
        this.qntParadas = qntParadas;
    }

    public HashSet<String> getParadas() {
        return paradas;
    }

    public void setParadas(HashSet<String> paradas) {
        this.paradas = paradas;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
    
    

}

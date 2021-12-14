/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viacaoCalango.models;

/**
 *
 * @author Lucas
 */
public class Onibus {

    //- id
    private String modelo;
    private String placa;
    private int qntAssentos;
    private String tipoOnibus;

    public Onibus(String modelo, String placa, int qntAssentos, String tipoOnibus) {
        this.modelo = modelo;
        this.placa = placa;
        this.qntAssentos = qntAssentos;
        this.tipoOnibus = tipoOnibus;
    }
   

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getQntAssentos() {
        return qntAssentos;
    }

    public void setQntAssentos(int qntAssentos) {
        this.qntAssentos = qntAssentos;
    }

    public String getTipoOnibus() {
        return tipoOnibus;
    }

    public void setTipoOnibus(String tipoOnibus) {
        this.tipoOnibus = tipoOnibus;
    }

    
}

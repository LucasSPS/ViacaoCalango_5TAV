/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viacaoCalango.models;

/**
 *
 * @author Lucas
 */
public class Passageiros {
    private String nome;
    private String RG;
    private String embarque;
    private String desembarque;

    public Passageiros(String nome, String RG, String embarque, String desembarque) {
        this.nome = nome;
        this.RG = RG;
        this.embarque = embarque;
        this.desembarque = desembarque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getEmbarque() {
        return embarque;
    }

    public void setEmbarque(String embarque) {
        this.embarque = embarque;
    }

    public String getDesembarque() {
        return desembarque;
    }

    public void setDesembarque(String desembarque) {
        this.desembarque = desembarque;
    }
    
    
}

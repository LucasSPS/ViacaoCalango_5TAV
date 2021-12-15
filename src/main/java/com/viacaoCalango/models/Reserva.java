/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viacaoCalango.models;

import java.util.HashSet;

/**
 *
 * @author Lucas
 */
public class Reserva {

    private String nome;
    private String RG;
    private String embarque;
    private String desembarque;
    private String tipoAssento;
    private String inicioRota;
    private String destinoRota;
    private int qntAssentos;
    private double desconto;
    private double valorTrecho;
    private HashSet<String> paradas = new HashSet<String>();

    public Reserva(Onibus onibus, Rotas rota, Passageiros passageiro) {
        nome = passageiro.getNome();
        RG = passageiro.getRG();
        embarque = passageiro.getEmbarque();
        desembarque = passageiro.getDesembarque();
        tipoAssento = onibus.getTipoAssento();
        qntAssentos = onibus.getQntAssentos();
        inicioRota = rota.getLocalPartida();
        destinoRota = rota.getLocalDestino();
        valorTrecho = rota.getPreço();
        paradas = rota.getParadas();
    }
    
    public double valorViagem() {
        switch (tipoAssento) {
            case "SL":
                valorTrecho = valorTrecho + (valorTrecho * 0.11);
                break;

            case "L":
                valorTrecho = valorTrecho + (valorTrecho * 0.20);
                break;

            case "E":
                valorTrecho = valorTrecho + (valorTrecho * 0.25);
                break;            
        }
        aplicaDesconto();
        return valorTrecho;
    }

    public void aplicaDesconto() {
        if (embarque == inicioRota && desembarque == destinoRota) {
            valorTrecho = valorTrecho-(valorTrecho*0.2);
        }
    }

    //Getter and Setters
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

    public String getTipoAssento() {
        return tipoAssento;
    }

    public void setTipoAssento(String tipoAssento) {
        this.tipoAssento = tipoAssento;
    }

    public String getInicioRota() {
        return inicioRota;
    }

    public void setInicioRota(String inicioRota) {
        this.inicioRota = inicioRota;
    }

    public String getDestinoRota() {
        return destinoRota;
    }

    public void setDestinoRota(String destinoRota) {
        this.destinoRota = destinoRota;
    }

    public int getQntAssentos() {
        return qntAssentos;
    }

    public void setQntAssentos(int qntAssentos) {
        this.qntAssentos = qntAssentos;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValorTrecho() {
        return valorTrecho;
    }

    public void setValorTrecho(double valorTrecho) {
        this.valorTrecho = valorTrecho;
    }

}

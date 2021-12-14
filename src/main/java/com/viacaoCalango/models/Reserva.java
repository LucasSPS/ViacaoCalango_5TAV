/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viacaoCalango.models;

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
    private String numAssento;
    private String inicioRota;
    private String destinoRota;

    public Reserva(String _nome, String _RG, String _embarque, String _desembarque,
            String _tipoAssento, String _numAssento, String _inicioRota, String _destinoRota) {//passar passageiro, onibus, rota como objeto
        
        //fazer verificação se onibus está lotado
        
        nome = _nome;
        RG = _RG;
        embarque = _embarque;
        desembarque = _desembarque;
        tipoAssento = _tipoAssento;
        numAssento = _numAssento;
        inicioRota = _inicioRota;
        destinoRota = _destinoRota;
    }

    public boolean aplicaDesconto() {
        if (embarque==inicioRota && desembarque == destinoRota) {
            return true;
        }
        return false;
    }
    
    public double confirmarReserva(){
        //fazer verificação se o embarque e o destino do passageiro são iguais ao da rota, se sim dar desconto de 10%, retornar o valor
        //Calcular valor da passagem dado a rota, 
        //acrescentar constante do tipo de assento ao preço,
        return 0;
    }
        

    //Reserva reserva = new Reserva("Gabriel Souza", "30147144-2", "Rio de Janeiro", "Aparecida do Norte", "semi-leito", "SL14")
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viacaoCalango.tests;

import com.viacaoCalango.models.Onibus;
import com.viacaoCalango.models.Reserva;
import com.viacaoCalango.models.Rotas;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author Lucas
 */
@SpringBootTest
public class TestesReserva {   
    @Test
    public void desembarqueEmParada()
    {
        //Arrange
        Onibus bus = new Onibus("A458", "BTT-4477", 28, "SL");
        Rotas rota = new Rotas("Rio de Janeiro", "São Paulo", "Graal - Itatiaia", "Aparecida do Norte", "Frango Assado - Taubaté");
        Reserva reserva = new Reserva("Gabriel Souza", "30147144-2", "Rio de Janeiro", "Aparecida do Norte", "semi-leito", "SL14", rota.getLocalPartida(), rota.getLocalDestino());
           
        //Act
        Boolean resultado = rota.embarqueDiferenteDeDestino();
        
        //Assert
        assertTrue(resultado);        
    } 
    
    @Test
    public void verificaDesembarqueExistente(){
        
    }
    
    @Test
    public void verificaDisponibilidadeDeAssento(){
        
    }
    
    @Test
    public void verificaDesconto(){
        //Arrange
        Rotas rota = new Rotas("Rio de Janeiro", "São Paulo", "Itatiaia", "Aparecida do Norte", "Taubaté");
        Reserva reserva = new Reserva("Gabriel Souza", "30147144-2", "Itatiaia", "São Paulo", "semi-leito", "SL14", rota.getLocalPartida(), rota.getLocalDestino());
           
        //Act
        Boolean resultado = reserva.aplicaDesconto();
        
        //Assert
        assertTrue(resultado); 
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viacaoCalango.tests;

import com.viacaoCalango.models.Onibus;
import com.viacaoCalango.models.Passageiros;
import com.viacaoCalango.models.Reserva;
import com.viacaoCalango.models.Rotas;
import static org.junit.jupiter.api.Assertions.*;
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
        Passageiros lucas = new Passageiros("Lucas Pereira", "30174144-2", "Rio de Janeiro", "Aparecida do Norte");        
        Onibus bus = new Onibus("A458", "BTT-4477", 28, "SL");        
        Rotas rota = new Rotas("Rio de Janeiro", "São Paulo", 47.80, "Itatiaia", "Aparecida do Norte", "Frango Assado - Taubaté");
        
        Reserva reserva = new Reserva(bus, rota, lucas);//"Gabriel Souza", "30147144-2", "Rio de Janeiro", "Aparecida do Norte", "semi-leito", "SL14", rota.getLocalPartida(), rota.getLocalDestino());
           
        //Act
        Boolean resultado = rota.embarqueDiferenteDeDestino();
        
        //Assert
        assertTrue(resultado);        
    } 
    
    @Test
    public void precoEmOnibusExecutivo()
    {
        //Arrange
        Passageiros lucas = new Passageiros("Lucas Pereira", "30174144-2", "Rio de Janeiro", "Aparecida do Norte");        
        Onibus bus = new Onibus("A458", "BTT-4477", 28, "E");        
        Rotas rota = new Rotas("Rio de Janeiro", "São Paulo", 50.00, "Itatiaia", "Aparecida do Norte", "Frango Assado - Taubaté");
        
        Reserva reserva = new Reserva(bus, rota, lucas);
           
        //Act
        
        double resultado = reserva.valorViagem();
        double esperado = ((50*0.25) + 50);
        
        //Assert
        assertEquals(esperado, resultado);
    } 
    
    @Test
    public void precoEmOnibusLeitoComDesconto()
    {
        //Arrange
        Passageiros lucas = new Passageiros("Lucas Pereira", "30174144-2", "Minas Gerais", "Santa Catarina");        
        Onibus bus = new Onibus("A458", "BTT-4477", 28, "L");        
        Rotas rota = new Rotas("Minas Gerais", "Santa Catarina", 245.00, "Bar do Tião", "Graal Caixa Prego");
        
        Reserva reserva = new Reserva(bus, rota, lucas);
           
        //Act
        
        double resultado = reserva.valorViagem();
        double esperado = ((245*0.20)+245);
        esperado = esperado - esperado*0.2;
        
        //Assert
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void verificaDesembarqueExistente(){
        
    }
    
    @Test
    public void verificaDisponibilidadeDeAssento(){
        
    }
    

    
}

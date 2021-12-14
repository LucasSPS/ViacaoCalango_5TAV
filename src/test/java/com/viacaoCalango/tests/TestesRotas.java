/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.viacaoCalango.tests;

import com.viacaoCalango.models.Rotas;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author Lucas
 */
@SpringBootTest
public class TestesRotas {
    
    @Test
    public void embarqueIgualAoDestino()
    {
        //Arrange
        Rotas rota = new Rotas("Rio de Janeiro", "São Paulo", "Graal - Itatiaia", "Aparecida do Norte", "Frango Assado - Taubaté");
           
        //Act
        Boolean resultado = rota.embarqueDiferenteDeDestino();
        
        //Assert
        assertTrue(resultado);        
    }

}

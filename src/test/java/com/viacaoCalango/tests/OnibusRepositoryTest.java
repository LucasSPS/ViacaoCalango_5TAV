/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.viacaoCalango.tests;

import com.viacaoCalango.models.Onibus;
import com.viacaoCalango.models.OnibusRepository;
import java.util.HashSet;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

/**
 *
 * @author Lucas
 */

@DataJpaTest
class OnibusRepositoryTest {

    @Autowired
    private OnibusRepository underTest;
    
    
    private HashSet<String> paradas = new HashSet<String>();

    @Test
    public void OnibusRepositoryTest() {
        Onibus onibus = new Onibus(
                "A774",
                "GTR-5544",
                28,
                "L"
);
     underTest.save(onibus);
     
     boolean esperado = underTest.selectOnibusLeito("L");
     
     assertThat(esperado).isTrue();
        
    }
    
    
}

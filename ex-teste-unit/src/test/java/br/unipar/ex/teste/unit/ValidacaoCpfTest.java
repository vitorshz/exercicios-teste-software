/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.unipar.ex.teste.unit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lucia
 */
public class ValidacaoCpfTest {
    private ValidacaoCpf vcpf;
    private String cpf;
    private boolean valida;
    public ValidacaoCpfTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        vcpf = new ValidacaoCpf();
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testValidarCPF() {
        
        assertTrue(vcpf.validarCPF("123112312"),"validacao");
        assertTrue(vcpf.validarCPF("12345678910"), "validacao");

        
    }
    
}

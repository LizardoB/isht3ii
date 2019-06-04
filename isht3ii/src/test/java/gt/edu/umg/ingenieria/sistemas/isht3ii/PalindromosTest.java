/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.isht3ii;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lizardo
 */
public class PalindromosTest {
    
    public PalindromosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void EntradaNula() {
        System.out.println("TEST #1 - ENTRADA NULA");
        
        //given
        String word = null;
        
        boolean resultadoEsperado = false;
        
        //when
        boolean resultadoObtenido = Palindromos.evaluate(word);
        
        //then
        assertEquals("TEST #1 FAILED!",resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void EntradaVacia() {
        System.out.println("TEST #2 - ENTRADA VACIA");
        
        //given
        String word = "";
        
        boolean resultadoEsperado = true;
        
        //when
        boolean resultadoObtenido = Palindromos.evaluate(word);
        
        //then
        assertEquals("TEST #2 FAILED!",resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void EntradaConEspacios() {
        System.out.println("TEST #3 - ENTRADA CON ESPACIOS");
        
        //given
        String word = "la ruta natural";
        
        boolean resultadoEsperado = true;
        
        //when
        boolean resultadoObtenido = Palindromos.evaluate(word);
        
        //then
        assertEquals("TEST #3 FAILED!",resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void EntradaPar() {
        System.out.println("TEST #4 - ENTRADA PAR");
        
        //given
        String word = "rallar";
        
        boolean resultadoEsperado = true;
        
        //when
        boolean resultadoObtenido = Palindromos.evaluate(word);
        
        //then
        assertEquals("TEST #4 FAILED!",resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void EntradaImpar() {
        System.out.println("TEST #5 - ENTRADA IMPAR");
        
        //given
        String word = "recocer";
        
        boolean resultadoEsperado = true;
        
        //when
        boolean resultadoObtenido = Palindromos.evaluate(word);
        
        //then
        assertEquals("TEST #5 FAILED!",resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void EntradaMayusculasMinusculas() {
        System.out.println("TEST #6 - ENTRADA MAYUSCULAS Y MINUSCULAS");
        
        //given
        String word = "A lA gOrDa DrOgAlA";
        
        boolean resultadoEsperado = true;
        
        //when
        boolean resultadoObtenido = Palindromos.evaluate(word);
        
        //then
        assertEquals("TEST #6 FAILED!",resultadoEsperado, resultadoObtenido);
    }
    
    
    @Test
    public void EntradaDigitosSimbolos() {
        System.out.println("TEST #7 - ENTRADA DIGITOS Y SIMBOLOS");
        
        //given
        String word = "/*A1^2?3oso+-+oso3?2^1A*/";
        
        boolean resultadoEsperado = true;
        
        //when
        boolean resultadoObtenido = Palindromos.evaluate(word);
        
        //then
        assertEquals("TEST #7 FAILED!",resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void EntradaUnitaria() {
        System.out.println("TEST #8 - ENTRADA UNITARIA");
        
        //given
        String word = "a";
        
        boolean resultadoEsperado = true;
        
        //when
        boolean resultadoObtenido = Palindromos.evaluate(word);
        
        //then
        assertEquals("TEST #8 FAILED!",resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void EntradaGrande() {
        System.out.println("TEST #9 - ENTRADA GRANDE");
        
        //given
        String word = "si le dare una lanosa medalla de mason a la nuera de lis";
        
        boolean resultadoEsperado = true;
        
        //when
        boolean resultadoObtenido = Palindromos.evaluate(word);
        
        //then
        assertEquals("TEST #9 FAILED!",resultadoEsperado, resultadoObtenido);
    }

}

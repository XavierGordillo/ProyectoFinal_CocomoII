/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_cocomo.ii.controlador;

import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class MétodosTest {
    
    public Métodos met = new Métodos();
    
    public MétodosTest() {
    }
    
    

    @Test
    public void testsuma(){
    int a = 7;
    //int suma = met.suma(a);
    int suma = met.suma(a,8);
    Assert.assertEquals(15, suma);
    }
    
    @Test
    public void testRedondearDecimal(){
    double d = 4.8725678;
    BigDecimal redondeado = met.r(d);
    Assert.assertEquals("4.87", redondeado.toString());
    
    }
    
    
    /*Para ejecutar el siguiente metedo antes es necesario comentar algunas lineas de codigo
    que son son ocupadas por la vista principal y que efectivamente al no hacerlo el test no 
    pasara por (java.lang.NullPointerExecption), asi como tambien es necesario comentar la 
    ejeccucion de otros metedos que tambien nos da (java.lang.NullPointerExecption) por la 
    utilizacion de vistas del programa no son inicializadas en los test, las lineas a comentar son:
    linea 325
    linea 331
    linea 333
    luego de ejecutar los test, es necesario habilitar las lineas de vista del programa para
    su correcto funcionamiento.
    */
    @Test
    public void testTiempoD(){
        double esfuerzo = 6.0;
        double factorEscala = 9.0;
         
        BigDecimal tiempoD = met.tiempoD_cantidadP(esfuerzo,factorEscala);
        Assert.assertEquals("6.41", tiempoD.toString());
    }
    
}

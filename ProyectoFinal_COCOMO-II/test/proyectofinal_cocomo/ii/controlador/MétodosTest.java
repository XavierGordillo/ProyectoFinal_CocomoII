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
    
    

    /* El siguiente test se encarga de comprobar si la funcion redondearP esta corriendo 
    correctamente, para ello le enviamos el double a redondear, el resultado que nos da
    al llamar a la funcion lo comparamos con el resultado que nosotros esperamos
    */
    @Test
    public void testredondearP(){
    double  a = 7.3;
    //int suma = met.suma(a);
    String redondearP = met.redondearP(a);
        System.err.println("..........."+redondearP);
    Assert.assertEquals("7 a 8", redondearP);//comparo el metodo con el resultado esperado
    }
    
    
    
    /* El siguiente test se encarga de comprobar si la funcion redondear esta corriendo 
    correctamente, para ello le enviamos el double a redondear, el resultado que nos da
    al llamar a la funcion lo comparamos con el resultado que nosotros esperamos
    */
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
    linea 363
    linea 369
    linea 371
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
    
    
    /*Para ejecutar el siguiente metedo antes es necesario comentar algunas lineas de codigo
    que son son ocupadas por la vista principal y que efectivamente al no hacerlo el test no 
    pasara por (java.lang.NullPointerExecption), asi como tambien es necesario comentar la 
    ejeccucion de otros metedos que tambien nos da (java.lang.NullPointerExecption) por la 
    utilizacion de vistas del programa no son inicializadas en los test, las lineas a comentar son:
    linea 414
    linea 417
    linea 420
    luego de ejecutar los test, es necesario habilitar las lineas de vista del programa para
    su correcto funcionamiento.
    */
   @Test
    public void testCalcularCosto(){
        double tiempo = 3;
        double personas = 2;
        double costoT =met.calculoCosto(tiempo, personas);

        double costo = ((600) * (3 * 1.25) * (2)*0.10);
        double costoF =((600) * (3 * 1.25) * (2))+costo;
        System.err.println("...................costo: "+costoF);
        
        Assert.assertEquals("6075.0", costoT+"");
        
        
    }
    
    
    /*Para ejecutar el siguiente metedo antes es necesario comentar algunas lineas de codigo
    que son son ocupadas por la vista principal y que efectivamente al no hacerlo el test no 
    pasara por (java.lang.NullPointerExecption), asi como tambien es necesario comentar la 
    ejeccucion de otros metedos que tambien nos da (java.lang.NullPointerExecption) por la 
    utilizacion de vistas del programa no son inicializadas en los test, las lineas a comentar son:
    linea 183
    linea 191
    linea 198
    linea 205
    linea 212
    linea 218
    linea 224
    linea 230
    linea 236
    linea 242
    luego de ejecutar los test, es necesario habilitar las lineas de vista del programa para
    su correcto funcionamiento.
    */
    @Test
    public void testCalcularKsloc(){
        String lenguaje="JAVA";
        double puntosFA =34.70;
        
        BigDecimal totalKsloc = met.calculoKlineas(lenguaje,puntosFA);
        Assert.assertEquals("0.69", totalKsloc.toString());
        
    }
    
    /**
     * Test para verificar el calculo de la variable b
     */
    @Test
    public void testFactorB(){
        
        double Fi =18.98;
        
        double  b = met.calcularB(Fi);
        Assert.assertEquals("1.0998", b+"");
        
    }
    
    
    
}

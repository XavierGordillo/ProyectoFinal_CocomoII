/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_cocomo.ii.controlador;

import static com.sun.javafx.tk.Toolkit.getToolkit;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import proyectofinal_cocomo.ii.vista.frmPrincipal;

/**
 *
 * @author xavie
 */
public class Métodos {

    
 JFileChooser seleccionar = new JFileChooser();
 File archivo;
 FileInputStream entrada;
 FileOutputStream salida;
 
 
 
 int bajo[]={3,4,3,7,5};
 int medio[]={4,5,4,10,7};
 int alto[]={6,7,6,15,10};
 

    public Métodos() {
    }

    //Método para obtener lo que se ingresa en el TextField y presentarlo en un label
    public void datos(){
        int total=0, total2=0, total3=0, total4=0, total5=0, sumTotal=0;
        int b1= 0 , b2= 0 , b3= 0, b4= 0, b5= 0, m1= 0, m2= 0,m3= 0,
                m4=0,m5= 0,a1= 0,a2= 0,a3= 0,a4= 0,a5 = 0;
        
        if (frmPrincipal.txtF.getText()!=null||frmPrincipal.txtF2.getText()!=null||frmPrincipal.txtF3.getText()!=null) {
            b1 = Integer.parseInt(frmPrincipal.txtF.getText())*bajo[0];
            m1 = Integer.parseInt(frmPrincipal.txtF2.getText())*medio[0];
            a1 = Integer.parseInt(frmPrincipal.txtF3.getText())*alto[0];
            total = b1+m1+a1;
            //String numTotal= total+"";
            frmPrincipal.lbl1.setText(""+total);
        }
        
        if (frmPrincipal.txtF4.getText()!=null||frmPrincipal.txtF5.getText()!=null||frmPrincipal.txtF6.getText()!=null) {
            b2 = Integer.parseInt(frmPrincipal.txtF4.getText())*bajo[1];
            m2 = Integer.parseInt(frmPrincipal.txtF5.getText())*medio[1];
            a2 = Integer.parseInt(frmPrincipal.txtF6.getText())*alto[1];
            total2 = b2+m2+a2;
            //String numTotal= total+"";
            frmPrincipal.lbl2.setText(""+total2);
        }
        
        if (frmPrincipal.txtF7.getText()!=null||frmPrincipal.txtF8.getText()!=null||frmPrincipal.txtF9.getText()!=null) {
            b3 = Integer.parseInt(frmPrincipal.txtF7.getText())*bajo[2];
            m3 = Integer.parseInt(frmPrincipal.txtF8.getText())*medio[2];
            a3 = Integer.parseInt(frmPrincipal.txtF9.getText())*alto[2];
            total3 = b3+m3+a3;
            //String numTotal= total+"";
            frmPrincipal.lbl3.setText(""+total3);
        }
        
        if (frmPrincipal.txtF10.getText()!=null||frmPrincipal.txtF11.getText()!=null||frmPrincipal.txtF12.getText()!=null) {
            b4 = Integer.parseInt(frmPrincipal.txtF10.getText())*bajo[3];
            m4 = Integer.parseInt(frmPrincipal.txtF11.getText())*medio[3];
            a4 = Integer.parseInt(frmPrincipal.txtF12.getText())*alto[3];
            total4 = b4+m4+a4;
            //String numTotal= total+"";
            frmPrincipal.lbl4.setText(""+total4);
        }
        
        if (frmPrincipal.txtF13.getText()!=null||frmPrincipal.txtF14.getText()!=null||frmPrincipal.txtF15.getText()!=null) {
            b5 = Integer.parseInt(frmPrincipal.txtF13.getText())*bajo[4];
            m5 = Integer.parseInt(frmPrincipal.txtF14.getText())*medio[4];
            a5 = Integer.parseInt(frmPrincipal.txtF15.getText())*alto[4];
            total5 = b5+m5+a5;
            //String numTotal= total+"";
            frmPrincipal.lbl5.setText(""+total5);
        }
        sumTotal=total+total2+total3+total4+total5; 
        System.out.println("suma"+sumTotal);
        frmPrincipal.lblTotal.setText(""+sumTotal);
   }
   
   
    
   /* public void AbrirArchivo(String archivo){
        try {
            File objetofile = new File(archivo);
            Desktop.getDesktop().open(objetofile);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }*/
    
    //Método para leer un archivo desde el computador   
    public String AbrirArchivo(File archivo){
        String documento ="";
        try {
            entrada = new FileInputStream(archivo);
            int ascci;
            while((ascci=entrada.read())!=-1){
                char caracter = (char)ascci;
                documento+=caracter;
            }
        } catch (Exception e) {
        }
        return documento;
    }
     
     public void bloqueLetras(java.awt.event.KeyEvent evt){
     char F1 = evt.getKeyChar();
        if (Character.isLetter(F1)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresar solo numeros");
        }
     }
}

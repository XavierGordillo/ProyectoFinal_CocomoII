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
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import proyectofinal_cocomo.ii.vista.frmFa;
import proyectofinal_cocomo.ii.vista.frmFactorescala;
import proyectofinal_cocomo.ii.vista.frmFactoresfuerzo;
import proyectofinal_cocomo.ii.vista.frmPrincipal;


/**
 *
 * @author xavie
 */
public class Métodos {

    
 /*JFileChooser seleccionar = new JFileChooser();
 File archivo;
 FileInputStream entrada;
 FileOutputStream salida;*/
 
 //DecimalFormat df = new DecimalFormat("#.##");
 
 int bajo[]={3,4,3,7,5};
 int medio[]={4,5,4,10,7};
 int alto[]={6,7,6,15,10};
 
 

    public Métodos() {
    }

    
    //<etodopara redondear decimales
    public BigDecimal r(double n) {
        BigDecimal bd = new BigDecimal(n);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        bd.doubleValue();
        
        return bd;
    }

    //Método para obtener lo que se ingresa en el TextField y presentarlo en un label
    public void datos(){
        int total=0, total2=0, total3=0, total4=0, total5=0, sumTotal=0;
        int b1= 0 , b2= 0 , b3= 0, b4= 0, b5= 0, m1= 0, m2= 0,m3= 0,
                m4=0,m5= 0,a1= 0,a2= 0,a3= 0,a4= 0,a5 = 0;
        
       // try {
       
       if ((frmPrincipal.txtF.getText()!=null)||frmPrincipal.txtF2.getText()!=null||frmPrincipal.txtF3.getText()!=null) {
            
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
        //System.out.println("suma"+sumTotal);
        frmPrincipal.lblTotal.setText(""+sumTotal);
        
        
         /*
        
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingresa valores correctos");
        }
        */
       
   }
   
   public void factorAjuste(){
        int f1=0, f2=0,f3=0,f4=0,f5=0,f6=0,f7=0,f8=0,f9=0,f10=0,f11=0,f12=0,f13=0,f14=0;
        int sumFactor;
        double factor=0;
        f1 = Integer.parseInt((String) frmFa.fa1.getSelectedItem());
        //JOptionPane.showMessageDialog(null, "el valor de factor 1 es: "+f1);
        f2 = Integer.parseInt((String) frmFa.fa2.getSelectedItem());
        f3 = Integer.parseInt((String) frmFa.fa3.getSelectedItem());
        f4 = Integer.parseInt((String) frmFa.fa4.getSelectedItem());
        f5 = Integer.parseInt((String) frmFa.fa5.getSelectedItem());
        f6 = Integer.parseInt((String) frmFa.fa6.getSelectedItem());
        f7 = Integer.parseInt((String) frmFa.fa7.getSelectedItem());
        f8 = Integer.parseInt((String) frmFa.fa8.getSelectedItem());
        f9 = Integer.parseInt((String) frmFa.fa9.getSelectedItem());
        f10 = Integer.parseInt((String) frmFa.fa10.getSelectedItem());
        f11 = Integer.parseInt((String) frmFa.fa11.getSelectedItem());
        f12 = Integer.parseInt((String) frmFa.fa12.getSelectedItem());
        f13 = Integer.parseInt((String) frmFa.fa13.getSelectedItem());
        f14 = Integer.parseInt((String) frmFa.fa14.getSelectedItem());
        
        sumFactor=f1+f2+f3+f4+f5+f6+f7+f8+f9+f10+f11+f12+f13+f14;
        if (sumFactor == 0) {
            
        }else{
            factor = Double.parseDouble(frmPrincipal.lblTotal.getText())*(0.65+(0.01*sumFactor));
            JOptionPane.showMessageDialog(null,"Factor" +factor);
           // df.format(factor);
           //BigDecimal bd = new BigDecimal(factor);
                //bd = bd.setScale(2, RoundingMode.HALF_UP);
         BigDecimal factorF =   r(factor);
        frmPrincipal.lblTotalPFA.setText(""+factorF);
        }
        
    }
    
          
    public void calculoKlineas() {
        String seleccion = (String) frmPrincipal.cbxLen.getSelectedItem();
        double ksloc;
        BigDecimal kslocF;
        int leng;
        switch (seleccion) {
            case "JAVA":leng = 20;
                ksloc = (Double.parseDouble(frmPrincipal.lblTotalPFA.getText()) * leng) / 1000;
                //BigDecimal bd = new BigDecimal(ksloc);
                //bd = bd.setScale(2, RoundingMode.HALF_UP);
                  kslocF=r(ksloc);
                frmPrincipal.lblKsloc.setText(""+kslocF);
                break;

            case "C":
                leng = 128;
                ksloc = (Double.parseDouble(frmPrincipal.lblTotalPFA.getText()) * leng) / 1000;
                kslocF=r(ksloc);
                frmPrincipal.lblKsloc.setText(""+kslocF);
                break;

            case "C++":
                leng = 64;
                ksloc = (Double.parseDouble(frmPrincipal.lblTotalPFA.getText()) * leng) / 1000;
                kslocF=r(ksloc);
                frmPrincipal.lblKsloc.setText(""+kslocF);
                break;

            case "COBOL":
                leng = 105;
                ksloc = (Double.parseDouble(frmPrincipal.lblTotalPFA.getText()) * leng) / 1000;
                kslocF=r(ksloc);
                frmPrincipal.lblKsloc.setText(""+kslocF);
                break;

            case "ENSAMBLADOR":
                leng = 320;
                ksloc = (Double.parseDouble(frmPrincipal.lblTotalPFA.getText()) * leng) / 1000;
               kslocF=r(ksloc);
                frmPrincipal.lblKsloc.setText(""+kslocF);
                break;
            case "PASCAL":
                leng = 90;
                ksloc = (Double.parseDouble(frmPrincipal.lblTotalPFA.getText()) * leng) / 1000;
                kslocF=r(ksloc);
                frmPrincipal.lblKsloc.setText(""+kslocF);
                break;
            case "ADA":
                leng = 70;
                ksloc = (Double.parseDouble(frmPrincipal.lblTotalPFA.getText()) * leng) / 1000;
                kslocF=r(ksloc);
                frmPrincipal.lblKsloc.setText(""+kslocF);
                break;
            case "LENGUAJES 4TA G.":
                leng = 20;
                ksloc = (Double.parseDouble(frmPrincipal.lblTotalPFA.getText()) * leng) / 1000;
               kslocF=r(ksloc);
                frmPrincipal.lblKsloc.setText(""+kslocF);
                break;
            case "LENGUAJES OO.":
                leng = 30;
                ksloc = (Double.parseDouble(frmPrincipal.lblTotalPFA.getText()) * leng) / 1000;
               kslocF=r(ksloc);
                frmPrincipal.lblKsloc.setText(""+kslocF);
                break;
            case "LENGUAJES  GRÁFICOS":
                leng = 4;
                ksloc = (Double.parseDouble(frmPrincipal.lblTotalPFA.getText()) * leng) / 1000;
                kslocF=r(ksloc);
                frmPrincipal.lblKsloc.setText(""+kslocF);
                break;
            default:
                break;

        }
        /*if (seleccion.equals("JAVA")) {
           ksloc = Double.parseDouble(frmGuardar.lblTotalPFA.getText())*20;
           frmGuardar.lblKsloc.setText(""+ksloc);
       }*/

    }
    //Esfuerzo
    //------------------------------------------------------------------------------
    //Calculo Sumatoria de Factores de Escala
    public void calculoFi(){
       double sumFi;
        double prec = Double.parseDouble((String)frmFactorescala.cbxPrec.getSelectedItem());
        double flex = Double.parseDouble((String)frmFactorescala.cbxFlex.getSelectedItem());
        double resl = Double.parseDouble((String)frmFactorescala.cbxResl.getSelectedItem());
        double team = Double.parseDouble((String)frmFactorescala.cbxTeam.getSelectedItem());
        double pmai = Double.parseDouble((String)frmFactorescala.cbxPmai.getSelectedItem());
        sumFi = prec + flex + resl+team+pmai;
        BigDecimal sumFiF =r(sumFi);
        frmPrincipal.lblFi.setText(""+sumFiF);
        
        
    }
    
    //Calculo de B 
    public double calcularB(){
        double b = 0.91 + (0.01*Double.parseDouble(frmPrincipal.lblFi.getText()));
        //JOptionPane.showMessageDialog(null, "el numero es: "+b);
        return b;
    }
    
    public void calculoMi(){
        double prodMi;
        BigDecimal prodMif;
        double rely = Double.parseDouble((String)frmFactoresfuerzo.cbxRely.getSelectedItem());
        double data= Double.parseDouble((String)frmFactoresfuerzo.cbxData.getSelectedItem());
        double docu= Double.parseDouble((String)frmFactoresfuerzo.cbxDocu.getSelectedItem());
        double cplx= Double.parseDouble((String)frmFactoresfuerzo.cbxCplx.getSelectedItem());
        double ruse = Double.parseDouble((String)frmFactoresfuerzo.cbxRuse.getSelectedItem());
        double time= Double.parseDouble((String)frmFactoresfuerzo.cbxTime.getSelectedItem());
        double store= Double.parseDouble((String)frmFactoresfuerzo.cbxStore.getSelectedItem());
        double pvol= Double.parseDouble((String)frmFactoresfuerzo.cbxPvol.getSelectedItem());
        double acap= Double.parseDouble((String)frmFactoresfuerzo.cbxAcap.getSelectedItem());
        double aexp= Double.parseDouble((String)frmFactoresfuerzo.cbxAexp.getSelectedItem());
        double pcap= Double.parseDouble((String)frmFactoresfuerzo.cbxPcap.getSelectedItem());
        double pexp= Double.parseDouble((String)frmFactoresfuerzo.cbxPexp.getSelectedItem());
        double ltex= Double.parseDouble((String)frmFactoresfuerzo.cbxLtex.getSelectedItem());
        double pcon= Double.parseDouble((String)frmFactoresfuerzo.cbxPcom.getSelectedItem());
        double tool= Double.parseDouble((String)frmFactoresfuerzo.cbxTool.getSelectedItem());
        double site= Double.parseDouble((String)frmFactoresfuerzo.cbxSite.getSelectedItem());
        double sced= Double.parseDouble((String)frmFactoresfuerzo.cbxSced.getSelectedItem());
        prodMi = rely*data*docu*cplx*ruse*time*store*pvol*acap*aexp*pcap*pexp*ltex*pcon*tool*site*sced;
        //prodR = Math.round(prodMi*100)/100;
        prodMif = r(prodMi);
        frmPrincipal.lblMi.setText(""+prodMif);
       // JOptionPane.showMessageDialog(null, "Factor Complejo"+prodMif);
    }
    
    //Calculo de factor de Esfuerzo
    public double calculoEsfuerzo(){
        double A = 2.94;
        double b = calcularB();
        //System.out.println("el valor de b es "+b);
        double mi = Double.parseDouble(frmPrincipal.lblMi.getText());
        double esfuerzo;
        double lin = (Double.parseDouble(frmPrincipal.lblKsloc.getText()));
        esfuerzo = A *Math.pow(lin,b)*mi;
//        esfuerzo = Math.round(esfuerzo*1000)/1000;
        BigDecimal esfuerzoF = r(esfuerzo);
        //JOptionPane.showMessageDialog(null, "Esfurzo ="+esfuerzo);
        //imprimiendo en pantalla
        frmPrincipal.lblEsfuerzo.setText(""+esfuerzoF+" Per./mes");
        //tiempoD_cantidadP(esfuerzo);
        double factorEscala = Double.parseDouble(frmPrincipal.lblFi.getText());//obtengo factor escala de la vista principal
        //para pruebas
        BigDecimal tiempoDesarrollo = tiempoD_cantidadP(esfuerzo,factorEscala);
        return esfuerzo;
    }
    
    public BigDecimal tiempoD_cantidadP(double esfuerzo, double factorEsacla){
        double tiempoDes;
         //tiempoDes = 3.76*Math.pow(esfuerzo, 0.28+0.002*(Double.parseDouble(frmPrincipal.lblFi.getText())));
         tiempoDes = 3.76*Math.pow(esfuerzo, 0.28+0.002*(factorEsacla));
         BigDecimal tiempoDesf = r(tiempoDes );
        frmPrincipal.lblTiempoD.setText(""+tiempoDesf+" meses");
        
        
         double cantidadPersonas;
         cantidadPersonas = esfuerzo/tiempoDes;
         BigDecimal cantidadPersonasf =r(cantidadPersonas);
        frmPrincipal.lblCantidadP.setText(cantidadPersonasf+" personas");
         
         calculoCosto(tiempoDes, cantidadPersonas);
         
         //para pruebas
         return tiempoDesf;
    }
    public int suma(int a, int b){
        //int b =7;
        int suma = 0;
        if(a > 0){
            
            suma = b+a;
            
        }else{}
        return suma;
    }
    
    
    
    public void calculoCosto(double tiempo, double cantidadPers){
        double imprevitos;
        double costo;
        double costoTotal;
        //pedir el salario
        String sueldo = JOptionPane.showInputDialog(null, "¿Cual es el salario?");
        
        //controlar si es double
        Boolean esDouble = false;
         while (esDouble ==false)
         {
             try {
		Double.parseDouble(sueldo);
		esDouble = true;
                } catch (NumberFormatException nfe){
                    sueldo = JOptionPane.showInputDialog(null, "Ingrese el salario correctamente! El salario debe ser tipo '350.00'");
                }
         }
        
        //costo = Double.parseDouble(sueldo)*(Double.parseDouble(frmPrincipal.lblTiempoD.getText())*1.25)*(Double.parseDouble(frmPrincipal.lblCantidadP.getText()));
        costo = Double.parseDouble(sueldo)*(tiempo*1.25)*(cantidadPers);
        BigDecimal costoR = r(costo);
        frmPrincipal.lblCosto.setText(""+costoR);
        imprevitos = costo * 0.35;
        BigDecimal imprevitosR = r(imprevitos);
        frmPrincipal.lblImprevistos.setText(""+imprevitosR);
        costoTotal = costo + imprevitos;
        BigDecimal costoTotalR = r(costoTotal);
        frmPrincipal.lblCostoT.setText(""+costoTotalR);
        
       /* imprevitos = Double.parseDouble(frmPrincipal.txtFSueldo.getText())*(Double.parseDouble(frmPrincipal.lblTiempoD.getText())*1.25)*(Double.parseDouble(frmPrincipal.lblCantidadP.getText()))*0.10;
        costoTotal= Double.parseDouble(frmPrincipal.txtFSueldo.getText())*(Double.parseDouble(frmPrincipal.lblTiempoD.getText())*1.25)*(Double.parseDouble(frmPrincipal.lblCantidadP.getText()))+imprevitos;
        frmPrincipal.lblCosto.setText(""+costoTotal);*/
    }
    
    
    
    
    
   /* public double calculoFi(){
        double sumFi;
        double prec = Double.parseDouble((String)frmFactorescala.cbxPrec.getSelectedItem());
        double flex = Double.parseDouble((String)frmFactorescala.cbxFlex.getSelectedItem());
        double resl = Double.parseDouble((String)frmFactorescala.cbxResl.getSelectedItem());
        double team = Double.parseDouble((String)frmFactorescala.cbxTeam.getSelectedItem());
        double pmai = Double.parseDouble((String)frmFactorescala.cbxPmai.getSelectedItem());
        sumFi = prec + flex + resl+team+pmai;
        
        return sumFi;
        
        //JOptionPane.showMessageDialog(null, +sumFi);
        
    }
    
    //-------------------------------------------------------------------------------
    //Calculo de B 
    public double calcularB(){
        double b = 0.91 + (0.01*calculoFi());
        //JOptionPane.showMessageDialog(null, "el numero es: "+b);
        return b;
    }
    
    //calculo EMi
    public double calculoMi(){
        double prodMi;
        double rely = Double.parseDouble((String)frmFactoresfuerzo.cbxRely.getSelectedItem());
        double data= Double.parseDouble((String)frmFactoresfuerzo.cbxRely.getSelectedItem());
        double docu= Double.parseDouble((String)frmFactoresfuerzo.cbxRely.getSelectedItem());
        double cplx= Double.parseDouble((String)frmFactoresfuerzo.cbxRely.getSelectedItem());
        double time= Double.parseDouble((String)frmFactoresfuerzo.cbxRely.getSelectedItem());
        double store= Double.parseDouble((String)frmFactoresfuerzo.cbxRely.getSelectedItem());
        double pvol= Double.parseDouble((String)frmFactoresfuerzo.cbxRely.getSelectedItem());
        double acap= Double.parseDouble((String)frmFactoresfuerzo.cbxRely.getSelectedItem());
        double aexp= Double.parseDouble((String)frmFactoresfuerzo.cbxRely.getSelectedItem());
        double pcap= Double.parseDouble((String)frmFactoresfuerzo.cbxRely.getSelectedItem());
        double pexp= Double.parseDouble((String)frmFactoresfuerzo.cbxRely.getSelectedItem());
        double ltex= Double.parseDouble((String)frmFactoresfuerzo.cbxRely.getSelectedItem());
        double pcon= Double.parseDouble((String)frmFactoresfuerzo.cbxRely.getSelectedItem());
        double tool= Double.parseDouble((String)frmFactoresfuerzo.cbxRely.getSelectedItem());
        double site= Double.parseDouble((String)frmFactoresfuerzo.cbxRely.getSelectedItem());
        double sced= Double.parseDouble((String)frmFactoresfuerzo.cbxRely.getSelectedItem());
        prodMi = rely*data*docu*cplx*time*store*pvol*acap*aexp*pcap*pexp*ltex*pcon*tool*site*sced;
        return prodMi;
    }
    
    //Calculo de factor de Esfuerzo
    public double calculoEsfuerzo(){
        double A = 2.94;
        double b = calcularB();
        System.out.println("el valor de b es "+b);
        double mi = calculoMi();
        double esfuerzo;
        double lin = (Double.parseDouble(frmPrincipal.lblKsloc.getText()));
        
        esfuerzo = A *Math.pow(lin,b)*mi;
        JOptionPane.showMessageDialog(null, "Esfurzo ="+esfuerzo);
        return esfuerzo;

       
    }*/
    
     
    
    
    
     public void bloqueLetras(java.awt.event.KeyEvent evt){
     char F1 = evt.getKeyChar();
        if (Character.isLetter(F1)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresar solo numeros");
        }if(Character.isWhitespace(F1)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "El espacio esta vacio");
        }
     }
}

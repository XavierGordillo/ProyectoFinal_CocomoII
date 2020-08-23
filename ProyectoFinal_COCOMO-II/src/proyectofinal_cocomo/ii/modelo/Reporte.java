/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_cocomo.ii.modelo;

/**
 *
 * @author xavie
 */
public class Reporte {
    private String nombre;
    private String tipo;
    private String modulo;
    private String pf;
    private String pfa;
    private String ksloc;
    private String esfuerzo;
    private String tDesarrollo;
    private String cPersonas;
    private String cTotal;
    
    public Reporte(){}

    public Reporte(String nombre, String tipo, String modulo, String pf, String pfa, String ksloc, String esfuerzo, String tDesarrollo, String cPersonas, String cTotal) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.modulo = modulo;
        this.pf = pf;
        this.pfa = pfa;
        this.ksloc = ksloc;
        this.esfuerzo = esfuerzo;
        this.tDesarrollo = tDesarrollo;
        this.cPersonas = cPersonas;
        this.cTotal = cTotal;
    }

    public Reporte(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getPf() {
        return pf;
    }

    public void setPf(String pf) {
        this.pf = pf;
    }

    public String getPfa() {
        return pfa;
    }

    public void setPfa(String pfa) {
        this.pfa = pfa;
    }

    public String getKsloc() {
        return ksloc;
    }

    public void setKsloc(String ksloc) {
        this.ksloc = ksloc;
    }

    public String getEsfuerzo() {
        return esfuerzo;
    }

    public void setEsfuerzo(String esfuerzo) {
        this.esfuerzo = esfuerzo;
    }

    public String gettDesarrollo() {
        return tDesarrollo;
    }

    public void settDesarrollo(String tDesarrollo) {
        this.tDesarrollo = tDesarrollo;
    }

    public String getcPersonas() {
        return cPersonas;
    }

    public void setcPersonas(String cPersonas) {
        this.cPersonas = cPersonas;
    }

    public String getcTotal() {
        return cTotal;
    }

    public void setcTotal(String cTotal) {
        this.cTotal = cTotal;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.paradigmas3.parcial2aldonahuelvegasanchezlsi714.objetos;

import java.util.Date;

/**
 *
 * @author al_na
 */
public class Curso {
    private Date fecha;
    private String catedra;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCatedra() {
        return catedra;
    }

    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }
    
}

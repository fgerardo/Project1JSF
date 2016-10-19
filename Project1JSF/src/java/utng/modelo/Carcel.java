/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Gerardo
 */
@Entity
@Table(name="carcel")
public class Carcel implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carcel")
    private Long idCarcel;
    @Column(length = 30)
    private String nombreCarcel;
    @Column(length =30)
    private String direccion;
    @Column(length = 15)
    private String nommbreD;
    

    

    
    
    
    public Carcel(){
        this.idCarcel=0L;
    }

    public Long getIdCarcel() {
        return idCarcel;
    }

    public void setIdCarcel(Long idCarcel) {
        this.idCarcel = idCarcel;
    }

    public String getNombreCarcel() {
        return nombreCarcel;
    }

    public void setNombreCarcel(String nombreCarcel) {
        this.nombreCarcel = nombreCarcel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNommbreD() {
        return nommbreD;
    }

    public void setNommbreD(String nommbreD) {
        this.nommbreD = nommbreD;
    }

    
    
    
    
    
}

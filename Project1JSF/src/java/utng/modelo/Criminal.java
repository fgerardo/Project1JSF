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
@Entity @Table (name="criminal")
public class Criminal implements Serializable {
      @Id
    @GeneratedValue(
            strategy =GenerationType.IDENTITY)
    
    @Column(name = "id_criminal")
    private Long idCriminal;
    @Column(name="nombre_criminal",length = 30)
    private String nombreCriminal;
    @Column(length = 30)
      private String tipo;
    @Column(length = 30)
    private String condena;
    
    @ManyToOne
    @JoinColumn(name="id_carcel")
    private Carcel carcel;
    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuario usuario;

    public Criminal(Long idCriminal, String nombreCriminal, String tipo, String condena, Carcel carcel, Usuario usuario) {
        super();
        this.idCriminal = idCriminal;
        this.nombreCriminal = nombreCriminal;
        this.tipo = tipo;
        this.condena = condena;
        this.carcel = carcel;
        this.usuario = usuario;
    }

   
    
    
    
    public Criminal(){
        this.idCriminal= 0L;
    }

    public Long getIdCriminal() {
        return idCriminal;
    }

    public void setIdCriminal(Long idCriminal) {
        this.idCriminal = idCriminal;
    }

    public void setNombreCriminal(String nombreCriminal) {
        this.nombreCriminal = nombreCriminal;
    }

    public String getNombreCriminal() {
        return nombreCriminal;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCondena() {
        return condena;
    }

    public void setCondena(String condena) {
        this.condena = condena;
    }

    public Carcel getCarcel() {
        return carcel;
    }

    public void setCarcel(Carcel carcel) {
        this.carcel = carcel;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    

    
}

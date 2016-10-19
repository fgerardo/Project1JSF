/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.CarcelDAO;
import utng.datos.CriminalDAO;
import utng.datos.UsuarioDAO;
import utng.modelo.Carcel;
import utng.modelo.Criminal;
import utng.modelo.Usuario;

/**
 *
 * @author Gerardo
 */
@ManagedBean(name="criminalBean") @SessionScoped
public class CriminalBean implements Serializable{
    private List<Criminal> criminales;
    private Criminal criminal;
    private List<Carcel> carceles;
    private List<Usuario> usuarios;
    
    public CriminalBean(){
        criminal=new Criminal();
        criminal.setCarcel(new Carcel());
        criminal.setUsuario(new Usuario());
    }
    

    public List<Criminal> getCriminales() {
        return criminales;
    }

    public void setCriminales(List<Criminal> criminales) {
        this.criminales = criminales;
    }

    public Criminal getCriminal() {
        return criminal;
    }

    public void setCriminal(Criminal criminal) {
        this.criminal = criminal;
    }

    public List<Carcel> getCarceles() {
        return carceles;
    }

    public void setCarceles(List<Carcel> carceles) {
        this.carceles = carceles;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    
    
    
    
    public String listar(){
        CriminalDAO dao = new CriminalDAO();
        try{
            criminales= dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Criminales";
    }
    
    public String eliminar(){
        CriminalDAO dao = new CriminalDAO();
        try{
            dao.delete(criminal);
            criminales = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return  "Eliminar";
        
        }
    
    public String iniciar(){
         criminal = new Criminal();
       criminal.setCarcel(new Carcel());
       criminal.setUsuario(new Usuario());
       try{
           carceles = new CarcelDAO().getAll();
           usuarios=new UsuarioDAO().getAll();
       }catch(Exception e){e.printStackTrace();}
       return "Iniciar";
       }
    
     public String guardar(){
        CriminalDAO dao = new CriminalDAO();
        try{
            if(criminal.getIdCriminal()!=0){
                dao.update(criminal);
            }else{
                dao.insert(criminal);}
            
            }catch(Exception e){
            e.printStackTrace();
            
        }
            criminales = dao.getAll();
        
          return "Guardar";
    }
     
      public String cancelar(){
        return "Cancelar";
    }
    public String editar(Criminal criminal){
            this.criminal = criminal;
        try{
            carceles = new CarcelDAO().getAll();
            usuarios= new UsuarioDAO().getAll();
        }catch (Exception e){e.printStackTrace();}
        return "Editar";
    }
}

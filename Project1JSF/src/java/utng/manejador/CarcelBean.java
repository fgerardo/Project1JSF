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
import utng.modelo.Carcel;
import utng.modelo.Criminal;

/**
 *
 * @author Gerardo
 */
@ManagedBean @SessionScoped
public class CarcelBean implements Serializable{
    private List<Carcel> carceles;
    private Carcel carcel;

    public CarcelBean() {
    }
 
    

    public List<Carcel> getCarceles() {
        return carceles;
    }

    public void setCarceles(List<Carcel> carceles) {
        this.carceles = carceles;
    }

    public Carcel getCarcel() {
        return carcel;
    }

    public void setCarcel(Carcel carcel) {
        this.carcel = carcel;
    }

    
     public String listar(){
        CarcelDAO dao = new CarcelDAO();
        try{
            carceles= dao.getAll();
        }catch(Exception e){ 
            e.printStackTrace();
        }
        return "Carceles";
        }
    public String eliminar(){
        CarcelDAO dao = new CarcelDAO();
        try{
            dao.delete(carcel);
            carceles = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Eliminar";
        }
    
     public String iniciar(){
        
       carcel = new Carcel();
       
       return "Iniciar";
       }
     
      public String guardar(){
        CarcelDAO dao = new CarcelDAO();
        try{ 
            if(carcel.getIdCarcel()!=0){
                dao.update(carcel);
        }else{ 
                dao.insert(carcel);
            }
            carceles = dao.getAll();
           
        }catch(Exception e){e.printStackTrace();
        } 
        
        return "Guardar";
    }
      
       public String cancelar(){ 
           return"Cancelar";
       }
    public String editar(Carcel carcel){
        this.carcel = carcel;
          return "Editar";
    }
    
}

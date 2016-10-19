/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Carcel;

/**
 *
 * @author Gerardo
 */
public class CarcelDAO extends DAO<Carcel>{
    
    public CarcelDAO() {
        super(new Carcel());
    }
     
    public Carcel getOneById(Carcel carcel)throws HibernateException{
        return super.getOneById(carcel.getIdCarcel());
    }
    
    
}

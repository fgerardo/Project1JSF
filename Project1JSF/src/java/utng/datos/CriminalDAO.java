/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Criminal;

/**
 *
 * @author Gerardo
 */
public class CriminalDAO extends DAO<Criminal> {
    
    public CriminalDAO() {
        super(new Criminal());
    }
    
    public Criminal getOneById(Criminal criminal)throws HibernateException{
        return super.getOneById(criminal.getIdCriminal());
    }
            
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbol;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Equipos;

/**
 *
 * @author josel
 */
public class Futbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
            Session s =futbol.accesoADatos.Conexion.getSessionFactory().openSession();
            Query query = s.createQuery("select e from Equipos e where nombre='River'");
           
           Equipos e=(Equipos)query.uniqueResult();
           System.out.println(e);
    }
    
}

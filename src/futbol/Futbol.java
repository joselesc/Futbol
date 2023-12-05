/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbol;

import futbol.accesoADatos.Conexion;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Equipos;
import vistas.FutbolVista;

/**
 *
 * @author josel
 */
public class Futbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
          Conexion.getSessionFactory();
          FutbolVista ingreso= new FutbolVista();
         ingreso.main(args);
    }
    
}

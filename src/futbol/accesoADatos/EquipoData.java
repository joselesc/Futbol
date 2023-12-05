/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbol.accesoADatos;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojos.Equipos;

/**
 *
 * @author josel
 */
public class EquipoData extends Liga {

    public EquipoData() {

    }

    public void crearEquipo(Equipos e) {

        try {

            Session s = futbol.accesoADatos.Conexion.getSessionFactory().openSession();
            Transaction tr = s.beginTransaction();
            s.save(e);
            tr.commit();
            s.close();
            tr = null;
            JOptionPane.showMessageDialog(null, "Equipo añadido");

        } catch (SessionException ex) {

            System.out.println("Error en la conexion" + ex.getMessage());
        }
    }

    public void modificarEquipo(Equipos e) {

        try {

            Session s = futbol.accesoADatos.Conexion.getSessionFactory().openSession();
            Transaction transaction = s.beginTransaction();
             Query query = s.createQuery("UPDATE Equipos e SET e.titulares = :condicion1, e.suplentes = :condicion2, e.dt = :condicion3," 
                    + " e.puntos = :condicion4, e.partidosJugados = :condicion5, e.ganados = :condicion6, e.empatados = :condicion7, e.perdidos = :condicion8 WHERE e.nombre = :condicion9"); 
            query.setParameter("condicion1", e.getTitulares());
            query.setParameter("condicion2", e.getSuplentes());
            query.setParameter("condicion3", e.getDt());
            query.setParameter("condicion4", e.getPuntos());
            query.setParameter("condicion5", e.getPartidosJugados());
            query.setParameter("condicion6", e.getGanados());
            query.setParameter("condicion7", e.getEmpatados());
            query.setParameter("condicion8", e.getPerdidos());
            query.setParameter("condicion9", e.getNombre());
            query.executeUpdate();
            transaction.commit();
            s.close();

            JOptionPane.showMessageDialog(null, "Equipo Actualizado");

        } catch (SessionException ex) {

            System.out.println("Error en la conexion" + ex.getMessage());
        }

    }
    
    public void borrarEquipo (Equipos e){
        
          try {

            Session s = futbol.accesoADatos.Conexion.getSessionFactory().openSession();
            Transaction transaction = s.beginTransaction();
             Query query = s.createQuery("DELETE FROM Equipos e WHERE nombre=:condicion1"); 
            query.setParameter("condicion1", e.getNombre());
            
            query.executeUpdate();
            transaction.commit();
            s.close();

            JOptionPane.showMessageDialog(null, "Equipo Borrado");

        } catch (SessionException ex) {

            System.out.println("Error en la conexion" + ex.getMessage());
        }

        
    }

    public Equipos buscarEquipo(String nombre) {

        Equipos e = null;
        try {

            Session s = futbol.accesoADatos.Conexion.getSessionFactory().openSession();
            Query query = s.createQuery("select e from Equipos e where nombre=(:condicion)");
            query.setParameter("condicion", nombre);
            e = (Equipos) query.uniqueResult();

        } catch (SessionException ex) {

            System.out.println("Error en la coanexion" + ex.getMessage());
        }

        System.out.println(e);
        return e;
    }

    public List<Equipos> listarEquipos(){
        
        Session s = futbol.accesoADatos.Conexion.getSessionFactory().openSession();
        Criteria c=s.createCriteria(pojos.Equipos.class);
        List<pojos.Equipos> eq=c.list();
        return eq;
        
    }

    @Override
    public void jugar(String a, String b) {
        
          int aux1=6;
          int aux2=6;
          int pos1;
          int pos2;
        listarEquipos();
        
        EquipoData ed = new EquipoData();
        for (Equipos eq : ed.listarEquipos()) {
             
            if (eq.getNombre()==a) {
               aux1=(int) (Math.random() * 5);
               
            }
             if (eq.getNombre()==b) {
               aux2=(int) (Math.random() * 5);
                 
            }
         }
        
        if (aux1==6 && aux2==6) {
            
           JOptionPane.showMessageDialog(null, "Error en los equipos ingresado");
           
        }else if (aux1> aux2){
            
            JOptionPane.showMessageDialog(null, "Gano "+ a);
                pos1=1;  
                pos2=2;        
            puntos(pos1,a);
            puntos(pos2,b);
        }else if (aux1< aux2){
            
            JOptionPane.showMessageDialog(null, "Gano "+ b);
            pos1 = 1;
            pos2 = 2;
            puntos(pos1, b);
            puntos(pos2, a);
        
        }else
             JOptionPane.showMessageDialog(null, "Hubo empate");
        
    }

    @Override
    public void puntos(int pos, String a) {
        
        try{
            if (pos==1) {
            Session s = futbol.accesoADatos.Conexion.getSessionFactory().openSession();
            Transaction transaction = s.beginTransaction();
             Query query = s.createQuery("UPDATE Equipos e SET  e.puntos = (e.puntos+3), e.partidosJugados = (e.partidosJugados+1), e.ganados =(e.ganados+1),"
                     + " where e.nombre = :condicion1"); 
            query.setParameter("condicion1", a);
          query.executeUpdate();
            transaction.commit();
            s.close();          
        }
         if (pos==2){
            
             Session s = futbol.accesoADatos.Conexion.getSessionFactory().openSession();
            Transaction transaction = s.beginTransaction();
             Query query = s.createQuery("UPDATE Equipos e SET  e.partidosJugados = (e.partidosJugados+1), e.perdidos =(e.perdidos+1),"
                     + " where e.nombre = :condicion1"); 
            query.setParameter("condicion1", a);
          query.executeUpdate();
            transaction.commit();
            s.close();         
        }
         
         
        
        } catch (SessionException ex) {

            System.out.println("Error en la conexion" + ex.getMessage());
        }
        
        
    }

}

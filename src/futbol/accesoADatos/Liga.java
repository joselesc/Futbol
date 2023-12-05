/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbol.accesoADatos;


import java.util.List;




/**
 *
 * @author josel
 */
public abstract class Liga {
    
    private String a;
    private String b;
    private int pos;
            
    public void campeonato(){
        this.jugar(a, b);
        this.puntos(pos,a);
    }
    
    public abstract void jugar(String a, String b);
    public abstract void puntos(int pos, String a);
   
    
   
    
}

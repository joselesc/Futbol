package pojos;
// Generated 03/12/2023 22:41:55 by Hibernate Tools 4.3.1

import javax.persistence.*;

@Entity
@Table(name="empleado")
public class Equipos  implements java.io.Serializable {

    @Id
    @Column(name="nombre")
     private String nombre;
     private int titulares;
     private int suplentes;
     private String dt;
     private Integer puntos;
     private Integer partidosJugados;
     private Integer ganados;
     private Integer empatados;
     private Integer perdidos;

    public Equipos() {
    }

	
    public Equipos(String nombre, int titulares, int suplentes, String dt) {
        this.nombre = nombre;
        this.titulares = titulares;
        this.suplentes = suplentes;
        this.dt = dt;
    }
    public Equipos(String nombre, int titulares, int suplentes, String dt, Integer puntos, Integer partidosJugados, Integer ganados, Integer empatados, Integer perdidos) {
       this.nombre = nombre;
       this.titulares = titulares;
       this.suplentes = suplentes;
       this.dt = dt;
       this.puntos = puntos;
       this.partidosJugados = partidosJugados;
       this.ganados = ganados;
       this.empatados = empatados;
       this.perdidos = perdidos;
    }
   
    public Equipos( int titulares, int suplentes, String dt, Integer puntos, Integer partidosJugados, Integer ganados, Integer empatados, Integer perdidos) {
       
       this.titulares = titulares;
       this.suplentes = suplentes;
       this.dt = dt;
       this.puntos = puntos;
       this.partidosJugados = partidosJugados;
       this.ganados = ganados;
       this.empatados = empatados;
       this.perdidos = perdidos;
    }
   
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTitulares() {
        return this.titulares;
    }
    
    public void setTitulares(int titulares) {
        this.titulares = titulares;
    }
    public int getSuplentes() {
        return this.suplentes;
    }
    
    public void setSuplentes(int suplentes) {
        this.suplentes = suplentes;
    }
    public String getDt() {
        return this.dt;
    }
    
    public void setDt(String dt) {
        this.dt = dt;
    }
    public Integer getPuntos() {
        return this.puntos;
    }
    
    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }
    public Integer getPartidosJugados() {
        return this.partidosJugados;
    }
    
    public void setPartidosJugados(Integer partidosJugados) {
        this.partidosJugados = partidosJugados;
    }
    public Integer getGanados() {
        return this.ganados;
    }
    
    public void setGanados(Integer ganados) {
        this.ganados = ganados;
    }
    public Integer getEmpatados() {
        return this.empatados;
    }
    
    public void setEmpatados(Integer empatados) {
        this.empatados = empatados;
    }
    public Integer getPerdidos() {
        return this.perdidos;
    }
    
    public void setPerdidos(Integer perdidos) {
        this.perdidos = perdidos;
    }




}



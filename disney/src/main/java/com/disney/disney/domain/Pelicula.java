
package com.disney.disney.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
//@Table(name="Pelicula")
public class Pelicula implements Serializable{
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String imagen;
    private String titulo;
    @DateTimeFormat(pattern = "dd-MM-YYYY")//evita el error del string que viene del form de thymeleaf
    private java.sql.Date fechaDeCreacion;
//    private java.sql.Date fechaDeCreacion;
    private int calificacion;
    
//    private   ArrayList <Personaje> personajesAsociaciados;
    
     @ManyToMany(mappedBy = "peliculas", fetch = FetchType.LAZY)
    private Set<Personaje> personajes = new HashSet<>();

    public Pelicula() {
    }

    public Pelicula(String imagen, String titulo, java.sql.Date fechaDeCreacion, int calificacion) {
        this.imagen = imagen;
        this.titulo = titulo;
        
        this.fechaDeCreacion = fechaDeCreacion;
        this.calificacion = calificacion;
    }

    public java.sql.Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(java.sql.Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }
     
     
     

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    
    
    
    
}

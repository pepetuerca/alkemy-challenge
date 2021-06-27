package com.disney.disney.repository;

import com.disney.disney.domain.Pelicula;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface PeliculaRepository extends JpaRepository<Pelicula, Integer> {

    @Query("from Pelicula p order by p.titulo")
    List<Pelicula> buscarTodos();

//    @Query("from Personaje p where p.pelicula.id =?1 order by p.nombre")
//    List<Pelicula> buscarPorPersonaje(int personajeId);
//@Query("from Pelicula p where p.nombre like %?1%")//lenguaje jpql
//    List<Pelicula>buscar(String consulta); 
    List<Pelicula> findByTituloContaining(String consulta);
    
    
    @Query("from Pelicula p where p.id =?1")
   Pelicula buscarPeliculaPorId(int id);

//    @Modifying(clearAutomatically = true)
    @Query("UPDATE Pelicula p SET p.titulo = ?1,p.imagen =?2, p.fechaDeCreacion =?3, p.calificacion =?4 WHERE p.id = ?5")
    void setPeliculaById(String titulo, String imagen, LocalDate fechaDeCreacion, int calificacion, int id);

}

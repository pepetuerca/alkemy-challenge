package com.disney.disney.repository;

import com.disney.disney.domain.Personaje;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//Personaje es la clase que va a interactuar con el repositorio e Integer es el tipo de dato del id de Personaje
public interface PersonajeRepository extends JpaRepository<Personaje, Integer> {

    @Query("from Personaje p order by p.nombre")
    List<Personaje> buscarTodos();

//    @Query("from Personaje p where p.pelicula.id =?1 order by p.nombre")
//    List<Personaje> buscarPorPelicula(int peliculaId);

@Query("from Personaje p where p.nombre like %?1%")//lenguaje jpql
    List<Personaje>buscar(String consulta); 
//    List<Personaje> findByNombreContaining(String consulta);//query methods en spring data

}

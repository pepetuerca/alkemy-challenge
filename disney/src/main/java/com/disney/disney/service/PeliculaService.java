
package com.disney.disney.service;

import com.disney.disney.domain.Pelicula;
import com.disney.disney.repository.PeliculaRepository;
import java.util.List;
import org.springframework.stereotype.Service;



@Service
public class PeliculaService {
    
     private final PeliculaRepository peliculaRepository;

    public PeliculaService(PeliculaRepository peliculaRepository) {
        this.peliculaRepository = peliculaRepository;
    }
    
    
    
     public List<Pelicula>buscarTodasPeliculas(){
       // hace un select * para llamar todos los datos da la bd
       return peliculaRepository.findAll();
     }
     
     public List<Pelicula>buscarPeliculaPorTitulo(String consulta){
        return peliculaRepository.findByTituloContaining(consulta);
    }
     
      public Pelicula guardar (Pelicula pelicula){
        return peliculaRepository.save(pelicula);
    }
      
      public void borrar (int id){
          peliculaRepository.deleteById(id);
      }
      
      public Pelicula buscarPeliculaPorId(int id){
          Pelicula peliculaParaModificar = new Pelicula();
           peliculaParaModificar = peliculaRepository.buscarPeliculaPorId(id);
          return peliculaParaModificar;
      }
      
      
      
    

  
    
}

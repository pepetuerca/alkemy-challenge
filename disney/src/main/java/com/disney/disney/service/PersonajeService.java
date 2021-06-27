
package com.disney.disney.service;

import com.disney.disney.domain.Personaje;
import com.disney.disney.repository.PersonajeRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PersonajeService {
    
    private final PersonajeRepository personajeRepository;

    public PersonajeService(PersonajeRepository personajeRepository) {
        this.personajeRepository = personajeRepository;
    }
    
    public List<Personaje>buscarTodosPersonajes(){
       // hace un select * para llamar todos los datos da la bd
       return personajeRepository.findAll();

    
    }
    
//      public List<Personaje>buscarPersonajePorPelicula(int peliculaId){
//
//         return personajeRepository.buscarPorPelicula(peliculaId);
//    }
      
    
     public List<Personaje>buscarPersonajePorNombre(String consulta){
        return personajeRepository.buscar(consulta);
//          return personajeRepository.findByNombreContaining(consulta);
    }
    
    
    
    
}
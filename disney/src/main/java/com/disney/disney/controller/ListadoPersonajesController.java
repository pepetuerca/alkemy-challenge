package com.disney.disney.controller;

import com.disney.disney.domain.Personaje;
import com.disney.disney.service.PersonajeService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ListadoPersonajesController {

//    inyeccion de dependencias
    private final PersonajeService personajeService;

    public ListadoPersonajesController(PersonajeService personajeService) {
        this.personajeService = personajeService;
    }

    @RequestMapping("/characters")//la url que devuelve el template de ese mismo nombre
    public String listarPersonajes(Model model) {

        List<Personaje> personajes = personajeService.buscarTodosPersonajes();
        model.addAttribute("personajes", personajes);//agrega los personajes a la vista
        return "characters";
    }

//    @RequestMapping("/personajesPorPelicula")
//    public String listarPersonajesPorPelicula(int peliculaId, Model model) {
//        List<Personaje> personajes = personajeService.buscarPersonajePorPelicula(peliculaId);
//        model.addAttribute("personajes", personajes);
//        return "characters";// ATENCION!!!!
//    }

    @RequestMapping("/buscar")
    public String buscarPersonajePorNombre(@RequestParam("q") String consulta, Model model) {  //@requestParam sirve para cambiar la palabra consulta de la barra por q
        List<Personaje> personajes = personajeService.buscarPersonajePorNombre(consulta);
            
        model.addAttribute("personajes", personajes);
        return "characters";//devuelve el template con ese nombre
    }

}

package com.disney.disney.controller;

import com.disney.disney.domain.Pelicula;
import com.disney.disney.service.PeliculaService;
import com.disney.disney.service.PersonajeService;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class PeliculaABMController {

    private final PeliculaService peliculaService;
//    private final PersonajeService personajeService;

//    public PeliculaABMController(PeliculaService peliculaService, PersonajeService personajeService) {
//        this.peliculaService = peliculaService;
//        this.personajeService = personajeService;
//    }
    public PeliculaABMController(PeliculaService peliculaService) {
        this.peliculaService = peliculaService;
    }

    @RequestMapping("/movies/create")
    public String mostrarFormAlta(Model model) {
//     model.addAttribute("personajes",personajeService.buscarTodos());

        model.addAttribute("peliculas", peliculaService.buscarTodasPeliculas());
        model.addAttribute("pelicula", new Pelicula());
        return "formPelicula";
    }
//    
//    
//

    @PostMapping("/movies/save")
    public String guardar(Pelicula pelicula) {
//        System.out.println(toString(pelicula.getFechaDeCreacion()));
        peliculaService.guardar(pelicula);

        return "redirect:/movies";
    }

    @PostMapping("/movies/delete")//la url que devuelve el template de ese mismo nombre
    
    public String listarPeliculasActualizadas(@RequestParam("idPelicula") String id, Model model){
       

    peliculaService.borrar(Integer.parseInt(id));
    model.addAttribute ("peliculas",peliculaService.buscarTodasPeliculas());

    return "redirect:/movies";

    
    }
    
    @PostMapping("/movies/update")
    
     public String buscarPeliculaPorId(@RequestParam("idPelicula") String id, Model model){
       
             
    
    model.addAttribute ("pelicula",peliculaService.buscarPeliculaPorId(Integer.parseInt(id)));

    return "updateMovie";
    
    
//      @RequestMapping("/buscarPelicula")
//    public String buscarPeliculaPorNombre(@RequestParam("q") String consulta, Model model) {  //@requestParam sirve para cambiar la palabra consulta de la barra por q
//        List<Pelicula> peliculas = peliculaService.buscarPeliculaPorTitulo(consulta);
//            
//        model.addAttribute("peliculas", peliculas);
//        return "movies";//devuelve el template con ese nombre
//    }
     }
}

package com.disney.disney.controller;

import com.disney.disney.domain.Pelicula;
import com.disney.disney.domain.Personaje;
import com.disney.disney.service.PeliculaService;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ListadoPeliculasController {

//    inyeccion de dependencias
    private final PeliculaService peliculaService;

    public ListadoPeliculasController(PeliculaService peliculaService) {
        this.peliculaService = peliculaService;
    }

//    @RequestMapping("/test")
//    public String test(Model model) {
//        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        String dateString = dateFormat.format(new Date());
//        model.addAttribute("myDate", dateString);
//        return "test";
//    }

    @RequestMapping("/movies")//la url que devuelve el template de ese mismo nombre
    public String listarPeliculas(Model model) {


        List<Pelicula> peliculas = peliculaService.buscarTodasPeliculas();
//        Pelicula p = new Pelicula();
//        p=peliculas.get(0);
//        System.out.println(p.getFechaDeCreacion());
        model.addAttribute("peliculas", peliculas);//agrega las peliculas a la vista
        return "movies";
    }

//    @RequestMapping("/personajesPorPelicula")
//    public String listarPersonajesPorPelicula(int peliculaId, Model model) {
//        List<Personaje> personajes = personajeService.buscarPersonajePorPelicula(peliculaId);
//        model.addAttribute("personajes", personajes);
//        return "characters";// ATENCION!!!!
//    }
    @RequestMapping("/buscarPelicula")
    public String buscarPeliculaPorNombre(@RequestParam("q") String consulta, Model model) {  //@requestParam sirve para cambiar la palabra consulta de la barra por q
        List<Pelicula> peliculas = peliculaService.buscarPeliculaPorTitulo(consulta);
            
        model.addAttribute("peliculas", peliculas);
        return "movies";//devuelve el template con ese nombre
    }
}

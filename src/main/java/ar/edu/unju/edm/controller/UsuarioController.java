package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Usuario;
import ar.edu.unju.edm.service.IUsuarioService;

import ch.qos.logback.core.model.Model;

@Controller
 
public class UsuarioController {
    @Autowired
    IUsuarioService usuarioService;
    
    @Autowired
    Usuario unUsuario; 

    @GetMapping("/usuario")
    public ModelAndView cargarUsuario() {
        ModelAndView cargaUsuario = new ModelAndView("formularioUsuario");
        cargaUsuario.addObject("nuevoUsuario", unUsuario);
        
        cargaUsuario.addObject("band", false);
        return cargaUsuario;
    }
    
    @PostMapping("/guardar")
    public String cargarUsuario(Usuario usuario, Model model) {
        usuarioService.cargarUsuario(usuario);
        return "redirect:/";
        
    }
    
    @PostMapping("/guardarUsuario")
    public ModelAndView guardarUsuario(@ModelAttribute("nuevoUsuario") Usuario unUsuario ) {
    	
    
            ModelAndView cargaUsuario = new ModelAndView("formularioUsuario");
            cargaUsuario.addObject("nuevoCuestionario", unUsuario);
            return cargaUsuario;
    }
}
   
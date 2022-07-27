/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.portfolioGonzalo.controller;

import com.example.portfolioGonzalo.model.Persona;
import com.example.portfolioGonzalo.interfaces.IPersonaService;
import java.time.Instant;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class PersonaController {
    @Autowired
    private IPersonaService interPersona;
  
    
    @GetMapping ("/personas/traer")
    public List<Persona> getPersonas(){
        return interPersona.getPersonas();
    }
    @GetMapping ("/personas/buscar/{id}")
    public Persona findPersonas(@PathVariable Long id){
        return interPersona.findPersona(id);
    }
  
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        interPersona.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    @PutMapping("/personas/editar/{id}")
     public String editPersona(@RequestBody Persona perso){
        interPersona.savePersona(perso);
        return "La persona fue editada correctamente";
    }
    /*public Persona editPersona (@PathVariable Long id,
                               @RequestParam ("nombre") String nuevoNombre,
                               @RequestParam ("apellido") String nuevoApellido,
                               @RequestParam ("edad") int nuevaEdad,
                               @RequestParam ("email") String nuevoEmail,
                               @RequestParam ("tel") Long nuevoTel,
                               @RequestParam ("provincia") String nuevoProvincia,
                               @RequestParam ("ciudad") String nuevoCiudad,
                               @RequestParam ("pais") String nuevoPais){       
      Persona perso= interPersona.findPersona(id);
        
        perso.setNombre(nuevoNombre);
        perso.setApellido(nuevoApellido);
        perso.setEdad(nuevaEdad);
        perso.setEmail(nuevoEmail);
        perso.setTel(nuevoTel);
        perso.setProvincia(nuevoProvincia);
        perso.setCiudad(nuevoCiudad);
        perso.setPais(nuevoPais);
        
        interPersona.savePersona(perso);
        return perso;
    }*/
    
         
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.portfolioGonzalo.controller;

import com.example.portfolioGonzalo.interfaces.IExperienciaService;
import com.example.portfolioGonzalo.model.Experiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ExperienciaController {
    @Autowired
    private IExperienciaService interExperiencia;
    @GetMapping ("/experiencia/traer")
    public List<Experiencia> getExperiencia() {
        return interExperiencia.getExperiencia();
    }
    @GetMapping ("/experiencia/buscar/{id}")
    public Experiencia findExperiencia(@PathVariable Long id) {
        return interExperiencia.findExperiencia(id);
    }
     @PostMapping ("/experiencia/crear")
    public String createExperiencia(@RequestBody Experiencia exper){
        interExperiencia.saveExperiencia(exper);
        return "La experiencia fue creada correctamente";
    }
    @DeleteMapping("/experiencia/borrar/{id}")
    public String deleteExperiencia(@PathVariable Long id){
        interExperiencia.deleteExperiencia(id);
        return "La Experiencia fue eliminada correctamente";
    }

    @PutMapping("/experiencia/editar/{id}")
     public String editExperiencia(@RequestBody Experiencia exper){
        interExperiencia.saveExperiencia(exper);
        return "La Experiencia fue editada correctamente";
    }
}

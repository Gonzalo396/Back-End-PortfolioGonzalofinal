/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.portfolioGonzalo.controller;

import com.example.portfolioGonzalo.interfaces.IEducacionService;
import com.example.portfolioGonzalo.model.Educacion;

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

/**
 *
 * @author gonza
 */
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class EducacionController {
    @Autowired
    private IEducacionService interEducacion;
    @GetMapping ("/educacion/traer")
    public List<Educacion> getEducacion() {
        return interEducacion.getEducacion();
    }
    @GetMapping ("/educacion/buscar/{id}")
    public Educacion findEducacion(@PathVariable Long id) {
        return interEducacion.findEducacion(id);
        
    }
     @PostMapping ("/educacion/crear")
    public String createStudent(@RequestBody Educacion edu){
        interEducacion.saveEducacion(edu);
        return "La Educacion fue creada correctamente";
    }
    @DeleteMapping("/educacion/borrar/{id}")
    public String deleteEducacion(@PathVariable Long id){
        interEducacion.deleteEducacion(id);
        return "La Educacion fue eliminada correctamente";
    }

    @PutMapping("/educacion/editar/{id}")
     public String editEducacion(@RequestBody Educacion edu){
        interEducacion.saveEducacion(edu);
        return "La Educacion fue editada correctamente";
    }
}



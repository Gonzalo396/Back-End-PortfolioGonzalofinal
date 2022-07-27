/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.portfolioGonzalo.controller;

import com.example.portfolioGonzalo.interfaces.IProyectosService;
import com.example.portfolioGonzalo.model.Proyectos;
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
public class ProyectosController {
    @Autowired
    private IProyectosService interProyectos;
    @GetMapping ("/proyectos/traer")
    public List<Proyectos> getProyectos() {
        return interProyectos.getProyectos();
    }
    @GetMapping ("/proyectos/buscar/{id}")
    public Proyectos findProyectos(@PathVariable Long id) {
        return interProyectos.findProyectos(id);
    }
    @PostMapping ("/proyectos/crear")
    public String createProyectos(@RequestBody Proyectos proyectos){
        interProyectos.saveProyectos(proyectos);
        return "El proyectos fue creado correctamente";
    }
    @DeleteMapping("/proyectos/borrar/{id}")
    public String deleteProyectos(@PathVariable Long id){
        interProyectos.deleteProyectos(id);
        return "El proyectos fue eliminado correctamente";
    }

    @PutMapping("/proyectos/editar/{id}")
     public String editProyectos(@RequestBody Proyectos proyectos){
        interProyectos.saveProyectos(proyectos);
        return "El proyectos fue editado correctamente";
    }
    
    
}

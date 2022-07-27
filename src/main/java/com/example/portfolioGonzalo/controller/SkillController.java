/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.portfolioGonzalo.controller;

import com.example.portfolioGonzalo.interfaces.ISkillService;
import com.example.portfolioGonzalo.model.Skill;
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
public class SkillController {
    @Autowired
    private ISkillService interSkill;
    @GetMapping ("/skill/traer")
    public List<Skill> getSkill() {
        return interSkill.getSkill();
    }
    @GetMapping ("/skill/buscar/{id}")
    public Skill findSkill(@PathVariable Long id) {
        return interSkill.findSkill(id);
    }
    @PostMapping ("/skill/crear")
    public String createSkill(@RequestBody Skill skill){
        interSkill.saveSkill(skill);
        return "El skill fue creado correctamente";
    }
    @DeleteMapping("/skill/borrar/{id}")
    public String deleteSkill(@PathVariable Long id){
        interSkill.deleteSkill(id);
        return "El skill fue eliminado correctamente";
    }

    @PutMapping("/skill/editar/{id}")
     public String editSkill(@RequestBody Skill skill){
        interSkill.saveSkill(skill);
        return "El skill fue editado correctamente";
    }
    
    
}

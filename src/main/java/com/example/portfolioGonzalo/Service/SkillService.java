/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.portfolioGonzalo.Service;

import com.example.portfolioGonzalo.Repocitory.SkillRepository;
import com.example.portfolioGonzalo.interfaces.ISkillService;
import com.example.portfolioGonzalo.model.Skill;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gonza
 */
@Service
public class SkillService implements ISkillService {
    @Autowired
    private SkillRepository skillRepository;
    @Override
    public List<Skill> getSkill() {
        List<Skill> listaSkill = skillRepository.findAll();
        return listaSkill;
    }

    @Override
    public void saveSkill(Skill skill) {
        skillRepository.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        skillRepository.deleteById(id);
    }

    @Override
    public Skill findSkill(Long id) {
      Skill skill = skillRepository.findById(id).orElse(null);
      return skill;
    }
    
}

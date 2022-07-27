/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.portfolioGonzalo.interfaces;

import com.example.portfolioGonzalo.model.Skill;
import java.util.List;

/**
 *
 * @author gonza
 */
public interface ISkillService {
    public List<Skill> getSkill();
    public void saveSkill(Skill skill);
    public void deleteSkill(Long id);
    public Skill findSkill(Long id);
    
}

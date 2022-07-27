/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.portfolioGonzalo.Repocitory;

import com.example.portfolioGonzalo.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gonza
 */
@Repository
public interface SkillRepository extends JpaRepository <Skill, Long> {
    
}

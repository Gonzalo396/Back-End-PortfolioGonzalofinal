/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.portfolioGonzalo.interfaces;

import com.example.portfolioGonzalo.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    public List<Experiencia> getExperiencia();
    public void saveExperiencia(Experiencia expe);
    public void deleteExperiencia(Long id);
    public Experiencia findExperiencia(Long id);
    
    
}
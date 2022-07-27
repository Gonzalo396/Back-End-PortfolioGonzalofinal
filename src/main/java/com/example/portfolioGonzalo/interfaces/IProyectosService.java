/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.portfolioGonzalo.interfaces;

import com.example.portfolioGonzalo.model.Proyectos;
import java.util.List;

/**
 *
 * @author gonza
 */
public interface IProyectosService {
    public List<Proyectos> getProyectos();
    public void saveProyectos(Proyectos proyectos);
    public void deleteProyectos(Long id);
    public Proyectos findProyectos(Long id);
    
}

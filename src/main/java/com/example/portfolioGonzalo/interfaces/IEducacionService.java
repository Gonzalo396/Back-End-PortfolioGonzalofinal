/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.portfolioGonzalo.interfaces;

import com.example.portfolioGonzalo.model.Educacion;
import java.util.List;

/**
 *
 * @author gonza
 */
public interface IEducacionService {
    public List<Educacion> getEducacion();
    public void saveEducacion(Educacion edu);
    public void deleteEducacion(Long id);
    public Educacion findEducacion(Long id);
    
}

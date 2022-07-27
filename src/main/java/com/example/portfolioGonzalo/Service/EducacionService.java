/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.portfolioGonzalo.Service;

import com.example.portfolioGonzalo.Repocitory.EducacionRepository;
import com.example.portfolioGonzalo.interfaces.IEducacionService;
import com.example.portfolioGonzalo.model.Educacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gonza
 */
@Service
public class EducacionService implements IEducacionService {
    @Autowired
    private EducacionRepository eduRepository;
    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> listaEducacion = eduRepository.findAll();
        return listaEducacion;
    }

    @Override
    public void saveEducacion(Educacion edu) {
        eduRepository.save(edu);
    }

    @Override
    public void deleteEducacion(Long id) {
       eduRepository.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
        Educacion edu = eduRepository.findById(id).orElse(null);
        return edu;
    }
    
    
}

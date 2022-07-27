/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.portfolioGonzalo.Service;

import com.example.portfolioGonzalo.Repocitory.ProyectosRepository;
import com.example.portfolioGonzalo.interfaces.IProyectosService;
import com.example.portfolioGonzalo.model.Proyectos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gonza
 */
@Service
public class ProyectosService implements IProyectosService {
    @Autowired
    private ProyectosRepository proyectosRepository;
    @Override
    public List<Proyectos> getProyectos() {
        List<Proyectos> listaProyectos = proyectosRepository.findAll();
        return listaProyectos;
    }

    @Override
    public void saveProyectos(Proyectos proyectos) {
        proyectosRepository.save(proyectos);
    }

    @Override
    public void deleteProyectos(Long id) {
        proyectosRepository.deleteById(id);
    }

    @Override
    public Proyectos findProyectos(Long id) {
        Proyectos proyectos = proyectosRepository.findById(id).orElse(null);
        return proyectos;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.portfolioGonzalo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

/**
 *
 * @author gonza
 */
@Getter
@Setter
@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @javax.persistence.Id
    private Long id;
    private String proyecto;
    private String descripcionProyecto;
    private String url;
    private String fecha;
    
    
}

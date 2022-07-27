/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.portfolioGonzalo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Entity
public class Experiencia implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @javax.persistence.Id
    private Long id;
    private String puesto;
    private String empresa;
    private String trabajoRealiza;
    private String tiempo;
    
}

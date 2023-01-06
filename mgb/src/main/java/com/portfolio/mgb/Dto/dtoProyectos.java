/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Dto;

import javax.validation.constraints.NotBlank;
import org.springframework.lang.Nullable;


public class dtoProyectos {
    
    @NotBlank
    private String nombrePro; 
    @NotBlank
    private String descripcionPro; 
    @NotBlank
    private String fechaPro; 
    
   @Nullable
    private String linkPro; 
    
    public dtoProyectos() {
    }

    public dtoProyectos(String nombrePro, String descripcionPro, String fechaPro, String linkPro) {
        this.nombrePro = nombrePro;
        this.descripcionPro = descripcionPro;
        this.fechaPro = fechaPro;
        this.linkPro = linkPro;
    }

  

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getDescripcionPro() {
        return descripcionPro;
    }

    public void setDescripcionPro(String descripcionPro) {
        this.descripcionPro = descripcionPro;
    }

    public String getFechaPro() {
        return fechaPro;
    }

    public void setFechaPro(String fechaPro) {
        this.fechaPro = fechaPro;
    }

    public String getLinkPro() {
        return linkPro;
    }

    public void setLinkpro(String linkPro) {
        this.linkPro = linkPro;
    }
    
    
    
    
}

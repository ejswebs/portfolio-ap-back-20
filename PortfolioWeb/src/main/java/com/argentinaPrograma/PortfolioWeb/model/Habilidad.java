package com.argentinaPrograma.PortfolioWeb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Habilidad {

    @Id
    private Long id;

    private String nombre_habilidad;
    private Float porcentaje;
    private String descripcion;
    
    private Long persona_dni;

    public Habilidad() {
    }

    public Habilidad(Long id,
            String nombre_habilidad,
            Float porcentaje,
            String descripcion,
            Long persona_dni) {
        this.id = id;
        this.nombre_habilidad = nombre_habilidad;
        this.porcentaje = porcentaje;
        this.descripcion = descripcion;
        this.persona_dni = persona_dni;
    }
}

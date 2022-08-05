package com.argentinaPrograma.PortfolioWeb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Tecnologia {

    @Id
    private Long id;

    private String nombre;
    private String url_logo;

    public Tecnologia() {
    }

    public Tecnologia(Long id,
            String nombre,
            String url_logo) {
        this.id = id;
        this.nombre = nombre;
        this.url_logo = url_logo;
    }
}

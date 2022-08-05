package com.argentinaPrograma.PortfolioWeb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Localidad {

    @Id
    private Long id;

    private String ciudad;
    private String provincia;
    private String pais;

    public Localidad() {
    }

    public Localidad(Long id,
            String ciudad,
            String provincia,
            String pais) {
        this.id = id;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
    }
}

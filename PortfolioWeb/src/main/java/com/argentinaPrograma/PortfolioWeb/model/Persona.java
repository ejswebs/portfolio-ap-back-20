package com.argentinaPrograma.PortfolioWeb.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Persona {

    @Id
    private Long dni;

    private String nombre;
    private String apellido;
    private String email;
    private Long telefono;
    private Date fecha_nac;
    private String url_foto;
    private String url_portada;

    public Persona() {
    }

    public Persona(Long dni,
            String nombre,
            String apellido,
            String email,
            Long telefono,
            Date fecha_nac,
            String url_foto,
            String url_portada) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.fecha_nac = fecha_nac;
        this.url_foto = url_foto;
        this.url_portada = url_portada;
    }
}

package com.argentinaPrograma.PortfolioWeb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Proyecto {

    @Id
    private Long id;

    private String titulo;
    private String descripcion;
    private String url_git;
    private String url_preview;
    private String url_img;
    private String tecnologia;
    private String url_logo;

    private Long persona_dni;

    public Proyecto() {
    }

    public Proyecto(
            Long id,
            String titulo,
            String descripcion,
            String url_git,
            String url_preview,
            String url_img,
            Long persona_dni,
            String tecnologia,
            String url_logo) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url_git = url_git;
        this.url_preview = url_preview;
        this.url_img = url_img;
        this.persona_dni = persona_dni;
        this.tecnologia = tecnologia;
        this.url_logo = url_logo;
    }
}

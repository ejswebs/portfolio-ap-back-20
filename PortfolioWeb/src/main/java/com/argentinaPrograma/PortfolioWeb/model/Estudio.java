package com.argentinaPrograma.PortfolioWeb.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Estudio {

    @Id
    private Integer id;

    private String titulo;
    private String tipo;
    private Float promedio;
    private Date fecha_inicio;
    private Date fecha_fin;
    private String url_logo;
    private String url_certificado;

    private Long persona_dni;
    private Long institucion_id;

    public Estudio() {
    }

    public Estudio(Integer id,
            String titulo,
            String tipo,
            Float promedio,
            Date fecha_inicio,
            Date fecha_fin,
            String url_logo,
            String url_certificado,
            Long persona_dni,
            Long institucion_id) {
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo;
        this.promedio = promedio;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.url_logo = url_logo;
        this.url_certificado = url_certificado;
        this.persona_dni = persona_dni;
        this.institucion_id = institucion_id;
    }
}

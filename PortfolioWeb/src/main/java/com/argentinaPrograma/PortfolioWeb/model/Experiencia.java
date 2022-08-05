
package com.argentinaPrograma.PortfolioWeb.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Experiencia {
    @Id
    private Long id;

    private String puesto;
    private String resumen;
    private String descripcion;
    private Date fecha_inicio;
    private Date fecha_fin;

    private Long persona_dni;
    private Long institucion_id;

    public Experiencia() {
    }

    public Experiencia(Long id,
            String puesto,
            String resumen,
            String descripcion,
            Date fecha_inicio,
            Date fecha_fin,
            Long persona_dni,
            Long institucion_id) {
        this.id = id;
        this.puesto = puesto;
        this.resumen = resumen;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.persona_dni = persona_dni;
        this.institucion_id = institucion_id;
    }
}

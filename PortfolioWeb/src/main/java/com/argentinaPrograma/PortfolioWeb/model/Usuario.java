package com.argentinaPrograma.PortfolioWeb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Usuario {

    @Id
    private String user;

    private String password;

    private Long persona_dni;

    public Usuario() {
    }

    public Usuario(String user,
            String password,
            Long persona_dni) {
        this.user = user;
        this.password = password;
        this.persona_dni = persona_dni;
    }
}

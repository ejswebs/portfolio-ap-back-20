package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Habilidad;
import java.util.List;

public interface IHabilidadService {

    public List<Habilidad> getHabs();

    public void addHab(Habilidad hab);

    public void delHab(Long id);

    public Habilidad findHab(Long id);

    public void editHab(Habilidad hab);
}

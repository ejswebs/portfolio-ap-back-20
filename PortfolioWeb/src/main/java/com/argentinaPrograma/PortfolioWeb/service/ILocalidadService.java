package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Localidad;
import java.util.List;

public interface ILocalidadService {

    public List<Localidad> getLocs();

    public void addLoc(Localidad loc);

    public void delLoc(Long id);

    public Localidad findLoc(Long id);

    public void editLoc(Localidad loc);
}

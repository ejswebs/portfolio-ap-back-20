package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Proyecto;
import java.util.List;

public interface IProyectoService {

    public List<Proyecto> getProys();

    public void addProy(Proyecto proy);

    public void delProy(Long id);

    public Proyecto findProy(Long id);

    public void editProy(Proyecto proy);

}

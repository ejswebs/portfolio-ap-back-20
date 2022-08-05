package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Experiencia;
import java.util.List;

public interface IExperienciaService {

    public List<Experiencia> getExps();

    public void addExp(Experiencia exp);

    public void delExp(Long id);

    public Experiencia findExp(Long id);

    public void editExp(Experiencia exp);
}

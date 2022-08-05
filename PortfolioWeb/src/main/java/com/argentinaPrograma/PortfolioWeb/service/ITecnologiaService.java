package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Tecnologia;
import java.util.List;

public interface ITecnologiaService {

    public List<Tecnologia> getTecs();

    public void addTec(Tecnologia tec);

    public void delTec(Long id);

    public Tecnologia findTec(Long id);

    public void editTec(Tecnologia tec);

}
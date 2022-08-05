package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Estudio;
import java.util.List;

public interface IEstudioService {
    public List<Estudio> getEsts();

    public void addEst(Estudio est);

    public void delEst(Long id);

    public Estudio findEst(Long id);

    public void editEst(Estudio est);
    
}

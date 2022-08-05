package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Institucion;
import java.util.List;

public interface IInstitucionService {
        public List<Institucion> getInsts();

    public void addInst(Institucion inst);

    public void delInst(Long id);

    public Institucion findInst(Long id);

    public void editInst(Institucion inst);
}

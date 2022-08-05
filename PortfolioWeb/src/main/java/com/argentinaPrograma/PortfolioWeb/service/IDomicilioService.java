package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Domicilio;
import java.util.List;

public interface IDomicilioService {

    public List<Domicilio> getDoms();

    public void addDom(Domicilio dom);

    public void delDom(Long id);

    public Domicilio findDom(Long id);

    public void editDom(Domicilio dom);

}

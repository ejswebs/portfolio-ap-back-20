package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Persona;
import java.util.List;

public interface IPersonService {

    public List<Persona> getPersons();

    public void addPerson(Persona pers);

    public void delPerson(Long id);

    public Persona findPerson(Long id);

    public void editPerson(Persona pers);

}

package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Persona;
import com.argentinaPrograma.PortfolioWeb.repository.PersonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService implements IPersonService {

    @Autowired
    public PersonRepository personRepo;

    @Override
    public List<Persona> getPersons() {
        return personRepo.findAll();
    }

    @Override
    public void addPerson(Persona person) {
        personRepo.save(person);
    }

    @Override
    public void delPerson(Long id) {
        personRepo.deleteById(id);
    }

    @Override
    public void editPerson(Persona person) {
        personRepo.save(person);
    }

    @Override
    public Persona findPerson(Long id) {
        return personRepo.findById(id).orElse(null);
    }

}

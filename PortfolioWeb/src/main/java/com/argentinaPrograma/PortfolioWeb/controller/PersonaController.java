package com.argentinaPrograma.PortfolioWeb.controller;

import com.argentinaPrograma.PortfolioWeb.model.Persona;
import com.argentinaPrograma.PortfolioWeb.service.IPersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    @Autowired
    private IPersonService personServ;

    @PostMapping("/api/add/person")
    public void addPerson(@RequestBody Persona person) {
        personServ.addPerson(person);
    }

    @GetMapping("/api/get/persons")
    @ResponseBody
    public List<Persona> getPersons() {
        return personServ.getPersons();
    }

    @GetMapping("/api/find/person/{id}")
    @ResponseBody
    public Persona findPerson(@PathVariable Long id) {
        return personServ.findPerson(id);
    }

    @DeleteMapping("/api/delete/person/{id}")
    public void delPerson(@PathVariable Long id) {
        personServ.delPerson(id);
    }

    @PutMapping("/api/edit/persons")
    public void editPerson(@RequestBody Persona person) {
        personServ.editPerson(person);
    }
}

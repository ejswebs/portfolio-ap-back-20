package com.argentinaPrograma.PortfolioWeb.controller;

import com.argentinaPrograma.PortfolioWeb.model.Experiencia;
import com.argentinaPrograma.PortfolioWeb.service.IExperienciaService;
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
public class ExperienciaController {

    @Autowired
    private IExperienciaService expServ;

    @PostMapping("/api/add/exp")
    public void addDom(@RequestBody Experiencia exp) {
        expServ.addExp(exp);
    }

    @GetMapping("/api/get/exps")
    @ResponseBody
    public List<Experiencia> getDoms() {
        return expServ.getExps();
    }

    @GetMapping("/api/find/exp/{id}")
    @ResponseBody
    public Experiencia findDom(@PathVariable Long id) {
        return expServ.findExp(id);
    }

    @DeleteMapping("/api/delete/exp/{id}")
    public void delDom(@PathVariable Long id) {
        expServ.delExp(id);
    }

    @PutMapping("/api/edit/exps")
    public void editPerson(@RequestBody Experiencia exp) {
        expServ.editExp(exp);
    }

}

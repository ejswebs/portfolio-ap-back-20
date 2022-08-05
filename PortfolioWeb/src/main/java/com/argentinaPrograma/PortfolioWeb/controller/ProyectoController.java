package com.argentinaPrograma.PortfolioWeb.controller;

import com.argentinaPrograma.PortfolioWeb.model.Proyecto;
import com.argentinaPrograma.PortfolioWeb.service.IProyectoService;
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
public class ProyectoController {

    @Autowired
    private IProyectoService proyServ;

    @PostMapping("/api/add/proy")
    public void addDom(@RequestBody Proyecto proy) {
        proyServ.addProy(proy);
    }

    @GetMapping("/api/get/proys")
    @ResponseBody
    public List<Proyecto> getDoms() {
        return proyServ.getProys();
    }

    @GetMapping("/api/find/proy/{id}")
    @ResponseBody
    public Proyecto findDom(@PathVariable Long id) {
        return proyServ.findProy(id);
    }

    @DeleteMapping("/api/delete/proy/{id}")
    public void delDom(@PathVariable Long id) {
        proyServ.delProy(id);
    }

    @PutMapping("/api/edit/proys")
    public void editPerson(@RequestBody Proyecto proy) {
        proyServ.editProy(proy);
    }

}

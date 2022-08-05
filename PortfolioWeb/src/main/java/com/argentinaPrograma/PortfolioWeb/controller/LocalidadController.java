package com.argentinaPrograma.PortfolioWeb.controller;

import com.argentinaPrograma.PortfolioWeb.model.Localidad;
import com.argentinaPrograma.PortfolioWeb.service.ILocalidadService;
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
public class LocalidadController {

    @Autowired
    private ILocalidadService locServ;

    @PostMapping("/api/add/loc")
    public void addDom(@RequestBody Localidad loc) {
        locServ.addLoc(loc);
    }

    @GetMapping("/api/get/locs")
    @ResponseBody
    public List<Localidad> getDoms() {
        return locServ.getLocs();
    }

    @GetMapping("/api/find/loc/{id}")
    @ResponseBody
    public Localidad findDom(@PathVariable Long id) {
        return locServ.findLoc(id);
    }

    @DeleteMapping("/api/delete/loc/{id}")
    public void delDom(@PathVariable Long id) {
        locServ.delLoc(id);
    }

    @PutMapping("/api/edit/locs")
    public void editPerson(@RequestBody Localidad loc) {
        locServ.editLoc(loc);
    }

}

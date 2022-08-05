package com.argentinaPrograma.PortfolioWeb.controller;

import com.argentinaPrograma.PortfolioWeb.model.Estudio;
import com.argentinaPrograma.PortfolioWeb.service.IEstudioService;
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
public class EstudioController {

    @Autowired
    private IEstudioService estServ;

    @PostMapping("/api/add/est")
    public void addDom(@RequestBody Estudio est) {
        estServ.addEst(est);
    }

    @GetMapping("/api/get/ests")
    @ResponseBody
    public List<Estudio> getDoms() {
        return estServ.getEsts();
    }

    @GetMapping("/api/find/est/{id}")
    @ResponseBody
    public Estudio findDom(@PathVariable Long id) {
        return estServ.findEst(id);
    }

    @DeleteMapping("/api/delete/est/{id}")
    public void delDom(@PathVariable Long id) {
        estServ.delEst(id);
    }

    @PutMapping("/api/edit/ests")
    public void editPerson(@RequestBody Estudio est) {
        estServ.editEst(est);
    }

}

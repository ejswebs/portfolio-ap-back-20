package com.argentinaPrograma.PortfolioWeb.controller;

import com.argentinaPrograma.PortfolioWeb.model.Habilidad;
import com.argentinaPrograma.PortfolioWeb.service.IHabilidadService;
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
public class HabilidadController {

    @Autowired
    private IHabilidadService habServ;

    @PostMapping("/api/add/hab")
    public void addDom(@RequestBody Habilidad hab) {
        habServ.addHab(hab);
    }

    @GetMapping("/api/get/habs")
    @ResponseBody
    public List<Habilidad> getHabs() {
        return habServ.getHabs();
    }

    @GetMapping("/api/find/hab/{id}")
    @ResponseBody
    public Habilidad findDom(@PathVariable Long id) {
        return habServ.findHab(id);
    }

    @DeleteMapping("/api/delete/hab/{id}")
    public void delDom(@PathVariable Long id) {
        habServ.delHab(id);
    }

    @PutMapping("/api/edit/habs")
    public void editPerson(@RequestBody Habilidad hab) {
        habServ.editHab(hab);
    }

}

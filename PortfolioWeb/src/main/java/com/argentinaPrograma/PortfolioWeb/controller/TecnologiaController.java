package com.argentinaPrograma.PortfolioWeb.controller;

import com.argentinaPrograma.PortfolioWeb.model.Tecnologia;
import com.argentinaPrograma.PortfolioWeb.service.ITecnologiaService;
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
public class TecnologiaController {

    @Autowired
    private ITecnologiaService tecServ;

    @PostMapping("/api/add/tec")
    public void addDom(@RequestBody Tecnologia tec) {
        tecServ.addTec(tec);
    }

    @GetMapping("/api/get/tecs")
    @ResponseBody
    public List<Tecnologia> getDoms() {
        return tecServ.getTecs();
    }

    @GetMapping("/api/find/tec/{id}")
    @ResponseBody
    public Tecnologia findDom(@PathVariable Long id) {
        return tecServ.findTec(id);
    }

    @DeleteMapping("/api/delete/tec/{id}")
    public void delDom(@PathVariable Long id) {
        tecServ.delTec(id);
    }

    @PutMapping("/api/edit/tecs")
    public void editPerson(@RequestBody Tecnologia tec) {
        tecServ.editTec(tec);
    }

}

package com.argentinaPrograma.PortfolioWeb.controller;

import com.argentinaPrograma.PortfolioWeb.model.Domicilio;
import com.argentinaPrograma.PortfolioWeb.service.IDomicilioService;
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
public class DomicilioController {

    @Autowired
    private IDomicilioService domServ;

    @PostMapping("/api/add/dom")
    public void addDom(@RequestBody Domicilio dom) {
        domServ.addDom(dom);
    }

    @GetMapping("/api/get/doms")
    @ResponseBody
    public List<Domicilio> getDoms() {
        return domServ.getDoms();
    }

    @GetMapping("/api/find/dom/{id}")
    @ResponseBody
    public Domicilio findDom(@PathVariable Long id) {
        return domServ.findDom(id);
    }

    @DeleteMapping("/api/delete/dom/{id}")
    public void delDom(@PathVariable Long id) {
        domServ.delDom(id);
    }

    @PutMapping("/api/edit/doms")
    public void editPerson(@RequestBody Domicilio dom) {
        domServ.editDom(dom);
    }

}

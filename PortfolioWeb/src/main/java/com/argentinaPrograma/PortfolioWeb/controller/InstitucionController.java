package com.argentinaPrograma.PortfolioWeb.controller;

import com.argentinaPrograma.PortfolioWeb.model.Institucion;
import com.argentinaPrograma.PortfolioWeb.service.IInstitucionService;
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
public class InstitucionController {

    @Autowired
    private IInstitucionService instServ;

    @PostMapping("/api/add/inst")
    public void addDom(@RequestBody Institucion inst) {
        instServ.addInst(inst);
    }

    @GetMapping("/api/get/insts")
    @ResponseBody
    public List<Institucion> getDoms() {
        return instServ.getInsts();
    }

    @GetMapping("/api/find/inst/{id}")
    @ResponseBody
    public Institucion findDom(@PathVariable Long id) {
        return instServ.findInst(id);
    }

    @DeleteMapping("/api/delete/inst/{id}")
    public void delDom(@PathVariable Long id) {
        instServ.delInst(id);
    }

    @PutMapping("/api/edit/insts")
    public void editPerson(@RequestBody Institucion inst) {
        instServ.editInst(inst);
    }

}

package com.argentinaPrograma.PortfolioWeb.controller;

import com.argentinaPrograma.PortfolioWeb.model.Usuario;
import com.argentinaPrograma.PortfolioWeb.service.IUsuarioService;
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
public class UsuarioController {

    @Autowired
    private IUsuarioService userServ;

    @PostMapping("/api/add/user")
    public void addDom(@RequestBody Usuario user) {
        userServ.addUser(user);
    }

    @GetMapping("/api/get/users")
    @ResponseBody
    public List<Usuario> getDoms() {
        return userServ.getUsers();
    }

    @GetMapping("/api/find/user/{id}")
    @ResponseBody
    public Usuario findDom(@PathVariable Long id) {
        return userServ.findUser(id);
    }

    @DeleteMapping("/api/delete/user/{id}")
    public void delDom(@PathVariable Long id) {
        userServ.delUser(id);
    }

    @PutMapping("/api/edit/users")
    public void editPerson(@RequestBody Usuario user) {
        userServ.editUser(user);
    }

}

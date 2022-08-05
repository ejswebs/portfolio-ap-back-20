package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Usuario;
import com.argentinaPrograma.PortfolioWeb.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    public UsuarioRepository userRepo;

    @Override
    public List<Usuario> getUsers() {
        return userRepo.findAll();
    }

    @Override
    public void addUser(Usuario user) {
        userRepo.save(user);
    }

    @Override
    public void delUser(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public Usuario findUser(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public void editUser(Usuario user) {
        userRepo.save(user);
    }

}

package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Usuario;
import java.util.List;

public interface IUsuarioService {

    public List<Usuario> getUsers();

    public void addUser(Usuario user);

    public void delUser(Long id);

    public Usuario findUser(Long id);

    public void editUser(Usuario user);

}
package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Proyecto;
import com.argentinaPrograma.PortfolioWeb.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {

    @Autowired
    public ProyectoRepository proyRepo;

    @Override
    public List<Proyecto> getProys() {
        return proyRepo.findAll();
    }

    @Override
    public void addProy(Proyecto proy) {
        proyRepo.save(proy);
    }

    @Override
    public void delProy(Long id) {
        proyRepo.deleteById(id);
    }

    @Override
    public Proyecto findProy(Long id) {
        return proyRepo.findById(id).orElse(null);
    }

    @Override
    public void editProy(Proyecto proy) {
        proyRepo.save(proy);
    }
}

package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Localidad;
import com.argentinaPrograma.PortfolioWeb.repository.LocalidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadService implements ILocalidadService {

    @Autowired
    public LocalidadRepository locRepo;

    @Override
    public List<Localidad> getLocs() {
        return locRepo.findAll();
    }

    @Override
    public void addLoc(Localidad loc) {
        locRepo.save(loc);
    }

    @Override
    public void delLoc(Long id) {
        locRepo.deleteById(id);
    }

    @Override
    public Localidad findLoc(Long id) {
        return locRepo.findById(id).orElse(null);
    }

    @Override
    public void editLoc(Localidad loc) {
        locRepo.save(loc);
    }

}

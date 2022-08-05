package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Habilidad;
import com.argentinaPrograma.PortfolioWeb.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService {

    @Autowired
    public HabilidadRepository habRepo;

    @Override
    public List<Habilidad> getHabs() {
        return habRepo.findAll();
    }

    @Override
    public void addHab(Habilidad hab) {
        habRepo.save(hab);
    }

    @Override
    public void delHab(Long id) {
        habRepo.deleteById(id);
    }

    @Override
    public Habilidad findHab(Long id) {
        return habRepo.findById(id).orElse(null);
    }

    @Override
    public void editHab(Habilidad hab) {
        habRepo.save(hab);
    }

}

package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Experiencia;
import com.argentinaPrograma.PortfolioWeb.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {

    @Autowired
    public ExperienciaRepository expRepo;

    @Override
    public List<Experiencia> getExps() {
        return expRepo.findAll();

    }

    @Override
    public void addExp(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void delExp(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experiencia findExp(Long id) {
        return expRepo.findById(id).orElse(null);
    }

    @Override
    public void editExp(Experiencia exp) {
        expRepo.save(exp);
    }

}

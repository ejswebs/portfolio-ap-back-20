package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Estudio;
import com.argentinaPrograma.PortfolioWeb.repository.EstudioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudioService implements IEstudioService {

    @Autowired
    public EstudioRepository estRepo;

    @Override
    public List<Estudio> getEsts() {
        return estRepo.findAll();
    }

    @Override
    public void addEst(Estudio est) {
        estRepo.save(est);
    }

    @Override
    public void delEst(Long id) {
        estRepo.deleteById(id);
    }

    @Override
    public Estudio findEst(Long id) {
        return estRepo.findById(id).orElse(null);
    }

    @Override
    public void editEst(Estudio est) {
        estRepo.save(est);
    }

}

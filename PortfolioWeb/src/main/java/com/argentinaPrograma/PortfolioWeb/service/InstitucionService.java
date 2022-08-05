package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Institucion;
import com.argentinaPrograma.PortfolioWeb.repository.InstitucionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstitucionService implements IInstitucionService {

    @Autowired
    public InstitucionRepository instRepo;

    @Override
    public List<Institucion> getInsts() {
        return instRepo.findAll();
    }

    @Override
    public void addInst(Institucion inst) {
        instRepo.save(inst);
    }

    @Override
    public void delInst(Long id) {
        instRepo.deleteById(id);
    }

    @Override
    public Institucion findInst(Long id) {
        return instRepo.findById(id).orElse(null);

    }

    @Override
    public void editInst(Institucion inst) {
        instRepo.save(inst);
    }
}

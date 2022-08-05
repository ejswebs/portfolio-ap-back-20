package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Tecnologia;
import com.argentinaPrograma.PortfolioWeb.repository.TecnologiaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiaService implements ITecnologiaService{
    
    @Autowired
    public TecnologiaRepository tecRepo; 

    @Override
    public List<Tecnologia> getTecs() {
               return tecRepo.findAll();
    }

    @Override
    public void addTec(Tecnologia tec) {
         tecRepo.save(tec);
    }

    @Override
    public void delTec(Long id) {
         tecRepo.deleteById(id);
    }

    @Override
    public Tecnologia findTec(Long id) {
        return tecRepo.findById(id).orElse(null);
    }

    @Override
    public void editTec(Tecnologia tec) {
         tecRepo.save(tec);
    }
}

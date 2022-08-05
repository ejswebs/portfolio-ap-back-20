package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Domicilio;
import com.argentinaPrograma.PortfolioWeb.repository.DomicilioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioService implements IDomicilioService {

    @Autowired
    public DomicilioRepository domRepo;

    @Override
    public List<Domicilio> getDoms() {
        return domRepo.findAll();
    }

    @Override
    public void addDom(Domicilio dom) {
        domRepo.save(dom);
    }

    @Override
    public void delDom(Long id) {
        domRepo.deleteById(id);
    }

    @Override
    public void editDom(Domicilio dom) {
        domRepo.save(dom);
    }

    @Override
    public Domicilio findDom(Long id) {
        return domRepo.findById(id).orElse(null);
    }

}

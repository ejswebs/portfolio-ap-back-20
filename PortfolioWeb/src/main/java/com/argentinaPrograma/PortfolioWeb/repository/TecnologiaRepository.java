package com.argentinaPrograma.PortfolioWeb.repository;

import com.argentinaPrograma.PortfolioWeb.model.Tecnologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiaRepository extends JpaRepository<Tecnologia, Long> {

}


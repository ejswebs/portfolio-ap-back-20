package com.argentinaPrograma.PortfolioWeb.repository;

import com.argentinaPrograma.PortfolioWeb.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long> {
    
}


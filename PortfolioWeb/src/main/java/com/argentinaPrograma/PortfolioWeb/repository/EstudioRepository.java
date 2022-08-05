package com.argentinaPrograma.PortfolioWeb.repository;

import com.argentinaPrograma.PortfolioWeb.model.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudioRepository extends JpaRepository<Estudio, Long> {
    
}

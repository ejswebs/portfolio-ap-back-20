package com.argentinaPrograma.PortfolioWeb.repository;

import com.argentinaPrograma.PortfolioWeb.model.Institucion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstitucionRepository extends JpaRepository<Institucion, Long> {

}

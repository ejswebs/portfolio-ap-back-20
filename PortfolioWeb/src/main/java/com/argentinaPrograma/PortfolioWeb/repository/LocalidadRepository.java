package com.argentinaPrograma.PortfolioWeb.repository;

import com.argentinaPrograma.PortfolioWeb.model.Localidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadRepository extends JpaRepository<Localidad, Long> {

}

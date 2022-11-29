package com.portfolio.mgb.Repository;

import com.portfolio.mgb.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository<Educacion, Integer>{
    public Optional<Educacion> FindByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);
}

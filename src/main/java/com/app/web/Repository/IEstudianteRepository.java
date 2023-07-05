package com.app.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.web.Model.Estudiante;


public interface IEstudianteRepository extends JpaRepository<Estudiante, Long>{
    
}

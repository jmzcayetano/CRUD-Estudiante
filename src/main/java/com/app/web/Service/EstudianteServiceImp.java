package com.app.web.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.Model.Estudiante;
import com.app.web.Repository.IEstudianteRepository;

@Service
public class EstudianteServiceImp implements IEstudianteService{

    @Autowired
    private IEstudianteRepository repositorio;
   
    @Override
    public List<Estudiante> ListarTodosLosEstudiante() {
       return repositorio.findAll();
    }

    @Override
    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return repositorio.save(estudiante);
    }

    @Override
    public Estudiante obtenerEstudiantePorId(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Estudiante actualizarEstudiante(Estudiante estudiante) {
       return repositorio.save(estudiante);
    }

    @Override
    public void eliminarEstudiante(Long id) {
        repositorio.deleteById(id);
    }
    
}

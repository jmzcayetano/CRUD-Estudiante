package com.app.web.Service;

import java.util.List;

import com.app.web.Model.Estudiante;

public interface IEstudianteService {
    public List<Estudiante> ListarTodosLosEstudiante();
    
    public Estudiante guardarEstudiante(Estudiante estudiante);

    public Estudiante obtenerEstudiantePorId(Long id);
    
    public Estudiante actualizarEstudiante(Estudiante estudiante);
    
    public void eliminarEstudiante(Long id);
        
    
}

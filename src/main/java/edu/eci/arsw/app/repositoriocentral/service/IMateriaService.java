package edu.eci.arsw.app.repositoriocentral.service;

import edu.eci.arsw.app.repositoriocentral.model.Materia;

import java.util.List;

public interface IMateriaService{

    void agregarMateria(Materia materia) throws UCordServicesException;

    void agregarPrerequisito(Materia prerequisito, Integer idMateria) throws UCordServicesException;

    List<Materia> getMaterias() throws UCordServicesException;

    List<Materia> getPrerequisitos(String siglas) throws UCordServicesException;

    List<Materia> getMateriasPorDecanatura(Integer idDecanatura) throws UCordServicesException;

    List<Materia> getMateriasPorCreditos( Integer creditos) throws UCordServicesException;

    List<Materia> getMateriaPorSiglas ( String siglas ) throws UCordServicesException;
}
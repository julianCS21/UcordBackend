package edu.eci.arsw.app.repositoriocentral.persistence;

import edu.eci.arsw.app.repositoriocentral.model.Materia;

import java.util.List;



public interface IMateriaPersistence {

    void agregarMateria(Materia materia) throws UcordPersistenceException;

    void agregarPreRequisito (Materia requisito, Integer idMateria) throws UcordPersistenceException;

    List<Materia> getMaterias () throws UcordPersistenceException;

    List<Materia> getMateriaPorCreditos (Integer creditos) throws UcordPersistenceException;

    List<Materia> getMateriaPorDecanatura (Integer idDecanatura) throws UcordPersistenceException;

    List<Materia> getMateriaPorSiglas (String siglas) throws UcordPersistenceException;

    List<Materia> getPreRequisitos (String siglas) throws UcordPersistenceException;


}

package edu.eci.arsw.app.repositoriocentral.service.impl;

import edu.eci.arsw.app.repositoriocentral.model.Materia;
import edu.eci.arsw.app.repositoriocentral.persistence.UcordPersistenceException;
import edu.eci.arsw.app.repositoriocentral.persistence.impl.MateriaPersistence;
import edu.eci.arsw.app.repositoriocentral.service.IMateriaService;
import edu.eci.arsw.app.repositoriocentral.service.UCordServicesException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaService implements IMateriaService {

    @Autowired
    MateriaPersistence persistence;

    @Override
    public List<Materia> getMaterias() throws UCordServicesException {
        try {
            return persistence.getMaterias();
        } catch (UcordPersistenceException e) {
            throw new UCordServicesException(e.getMessage());
        }
    }

    @Override
    public void agregarMateria(Materia materia) throws UCordServicesException {

    }

    @Override
    public void agregarPrerequisito(Materia prerequisito, Integer idMAteria) throws UCordServicesException {
        try{

        }catch(Exception e){
            System.out.println("El prerequisito no ha podido ser agregado.");
        }
    }

    @Override
    public List<Materia> getPrerequisitos(String siglas) throws UCordServicesException {
        return null;
    }

    @Override
    public List<Materia> getMateriasPorDecanatura(Integer idDecanatura) throws UCordServicesException {
        try {
            return persistence.getMateriaPorDecanatura(idDecanatura);
        } catch (UcordPersistenceException e) {
            throw new UCordServicesException(e.getMessage());
        }
    }

    @Override
    public List<Materia> getMateriasPorCreditos(Integer creditos) throws UCordServicesException {
        try {
            return persistence.getMateriaPorCreditos(creditos);
        } catch (UcordPersistenceException e) {
            throw new UCordServicesException(e.getMessage());
        }
    }

    @Override
    public List<Materia> getMateriaPorSiglas(String siglas) throws UCordServicesException {
        try{
            return persistence.getMateriaPorSiglas(siglas);
        }catch(UcordPersistenceException e){
            throw new UCordServicesException(e.getMessage());
        }
    }
}

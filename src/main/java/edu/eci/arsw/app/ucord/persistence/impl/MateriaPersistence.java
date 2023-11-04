package edu.eci.arsw.app.ucord.persistence.impl;

import edu.eci.arsw.app.ucord.model.Materia;
import edu.eci.arsw.app.ucord.persistence.IMateriaPersistence;
import edu.eci.arsw.app.ucord.persistence.UcordPersistenceException;
import edu.eci.arsw.app.ucord.persistence.repository.IMateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class MateriaPersistence implements IMateriaPersistence {

    @Autowired
    IMateriaRepository mr;

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void agregarMateria(Materia materia) throws UcordPersistenceException {
        try{
            mr.save(materia);
        }catch (Exception e){
            throw new UcordPersistenceException("Error al agregar materia.");
        }
    }

    @Override
    public void agregarPreRequisito(Materia requisito, Integer idMateria) throws UcordPersistenceException {

    }

    @Override
    public List<Materia> getMaterias() throws UcordPersistenceException {
        if (mr.count() == 0) throw new UcordPersistenceException("No se encontraron materias.");
        return mr.findAll();
    }

    @Override
    public List<Materia> getMateriaPorCreditos(Integer creditos) throws UcordPersistenceException {
        Query query = entityManager.createNativeQuery("select * from materias where creditos = ?", Materia.class);
        query.setParameter(1,creditos);
        if (query.getResultList().size() == 0){
            throw new UcordPersistenceException("No se encontraron materias.");
        }
        return query.getResultList();
    }

    @Override
    public List<Materia> getMateriaPorDecanatura(Integer idDecanatura) throws UcordPersistenceException {
        Query query = entityManager.createNativeQuery("select * from materias where id_decanatura = ?", Materia.class);
        query.setParameter(1,idDecanatura);
        if (query.getResultList().size() == 0){
            throw new UcordPersistenceException("No se encontraron materias.");
        }
        return query.getResultList();
    }

    @Override
    public List<Materia> getMateriaPorSiglas(String siglas) throws UcordPersistenceException {
        Query query = entityManager.createNativeQuery("select * from materias where sigla = ?", Materia.class);
        query.setParameter(1, siglas);
        if (query.getResultList().size() == 0){
            throw new UcordPersistenceException("No se encontraron materias con las siglas" + siglas + ".");
        }
        return query.getResultList();
    }

    @Override
    public List<Materia> getPreRequisitos(String siglas) throws UcordPersistenceException {
        return null;
    }
}

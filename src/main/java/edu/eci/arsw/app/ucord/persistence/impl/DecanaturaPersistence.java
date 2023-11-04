package edu.eci.arsw.app.ucord.persistence.impl;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.arsw.app.ucord.model.Decanatura;
import edu.eci.arsw.app.ucord.persistence.IDecanaturaPersistence;
import edu.eci.arsw.app.ucord.persistence.UcordPersistenceException;
import edu.eci.arsw.app.ucord.persistence.repository.IDecanaturaRepository;

@Service
public class DecanaturaPersistence implements IDecanaturaPersistence {

    @Autowired
    private IDecanaturaRepository decanaturaRepository; 

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void agregarDecanatura(Decanatura decanatura) throws UcordPersistenceException {
        try {
            decanaturaRepository.save(decanatura);
        } catch (Exception e) {
            throw new UcordPersistenceException("Error al agregar decanatura.");
        } 
    }

    @Override
    public List<Decanatura> getDecanaturas() throws UcordPersistenceException {
        if (decanaturaRepository.count()==0){
            throw new UcordPersistenceException("No se encontraron decanaturas.");
        }
        return decanaturaRepository.findAll();
    }

    @Override
    public List<Decanatura> getDecanaturaPorNombre(String nombreDecanatura) throws UcordPersistenceException {
        Query query = entityManager.createNativeQuery("select * from decanaturas where nombre = ?", Decanatura.class);
        query.setParameter(1,nombreDecanatura);
        if (query.getResultList().size() == 0){
            throw new UcordPersistenceException("No se encontraron Decanaturas.");
        }
        return query.getResultList();
        
    }

    @Override
    public List<Decanatura> getDecanaturaPorMateria(String nombreMateria) throws UcordPersistenceException {
        Query query = entityManager.createNativeQuery("select * from materias where sigla = ? join decanaturas on materias.id_decanatura = decanaturas.id_decanatura", Decanatura.class);
        query.setParameter(1,nombreMateria);
        if (query.getResultList().size() == 0){
            throw new UcordPersistenceException("No se encontró materia.");
        }
        return null;
    }

    @Override
    public List<Decanatura> getDecanaturaPorUsuario(Integer idUsuario) throws UcordPersistenceException {
        return null;
    }

    
    
}

package edu.eci.arsw.app.repositoriocentral.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.arsw.app.repositoriocentral.model.Decanatura;
import edu.eci.arsw.app.repositoriocentral.persistence.impl.DecanaturaPersistence;
import edu.eci.arsw.app.repositoriocentral.service.IDecanaturaService;
import edu.eci.arsw.app.repositoriocentral.service.UCordServicesException;

@Service 
public class DecanaturaService implements IDecanaturaService {

    public DecanaturaService(){}

    @Autowired
    DecanaturaPersistence persistence;

    @Override
    public void agregarDecanatura(Decanatura decanatura) throws UCordServicesException {
        
    }

    @Override
    public List<Decanatura> getDecanaturas() throws UCordServicesException {
        try {
            return persistence.getDecanaturas();
        } catch (Exception e) {
            throw new UCordServicesException(e.getMessage());
        }
    }

    @Override
    public List<Decanatura> getDecanaturaPorNombre(String nombreDecanatura) throws UCordServicesException {
        try {
            return persistence.getDecanaturaPorNombre(nombreDecanatura);
        } catch (Exception e) {
            throw new UCordServicesException(e.getMessage());
        }
    }

    @Override
    public List<Decanatura> getDecanaturaPorMateria(String nombreMateria) throws UCordServicesException {
        try {
            return persistence.getDecanaturaPorMateria(nombreMateria);
        } catch (Exception e) {
            throw new UCordServicesException(e.getMessage());
        }
    }

    @Override
    public List<Decanatura> getDecanaturaPorUsuario(Integer idUsuario) throws UCordServicesException {
        try {
            return persistence.getDecanaturaPorUsuario(idUsuario);
        } catch (Exception e) {
            throw new UCordServicesException(e.getMessage());
        }
    }



   
   
   
















    
}

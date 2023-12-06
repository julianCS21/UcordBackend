package edu.eci.arsw.app.repositoriocentral.service;

import java.util.List;
import edu.eci.arsw.app.repositoriocentral.model.Decanatura;

public interface IDecanaturaService {
    
    void agregarDecanatura (Decanatura decanatura) throws UCordServicesException;
    List<Decanatura> getDecanaturas() throws UCordServicesException;
    List<Decanatura> getDecanaturaPorNombre (String nombreDecanatura) throws UCordServicesException;
    List<Decanatura> getDecanaturaPorMateria(String nombreMateria) throws UCordServicesException;
    List<Decanatura> getDecanaturaPorUsuario(Integer idUsuario) throws UCordServicesException;
    
    


}

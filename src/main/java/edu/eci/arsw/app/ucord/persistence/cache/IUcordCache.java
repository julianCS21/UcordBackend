package edu.eci.arsw.app.ucord.persistence.cache;

import java.util.List;

import edu.eci.arsw.app.ucord.model.Decanatura;

public interface IUcordCache {

    Decanatura get(int idDecanatura) throws Exception;
    void put(Decanatura decantura);
    boolean exists(int idDecanatura);
    List<Decanatura> getDecanaturas() throws Exception;
    void delete(int idDecanatura) throws Exception; 

}

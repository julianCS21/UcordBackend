package edu.eci.arsw.app.ucord.service.impl;

import edu.eci.arsw.app.ucord.model.Usuario;
import edu.eci.arsw.app.ucord.persistence.IUsuarioPersistence;
import edu.eci.arsw.app.ucord.persistence.UcordPersistenceException;
import edu.eci.arsw.app.ucord.service.IUsuarioService;
import edu.eci.arsw.app.ucord.service.UCordServicesException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 9/28/2021
 */

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private IUsuarioPersistence persistence;

    @Override
    public void agregarUsuario(Usuario usuario) throws UCordServicesException {
        try {
            persistence.guardarUsuario( usuario );
        } catch (UcordPersistenceException e) {
            throw  new UCordServicesException( e.getMessage() );
        }
    }

    @Override
    public Usuario getUsuarioPorCorreo(String correo) throws UCordServicesException {
        try {
            return persistence.getUsuarioPorCorreo(correo);
        } catch (UcordPersistenceException e) {
            throw  new UCordServicesException( e.getMessage() );
        }
    }

    @Override
    public Usuario getUsuarioPorId(Integer id) throws UCordServicesException {
        try {
            return persistence.getUsuarioPorId(id);
        } catch (UcordPersistenceException e) {
            throw  new UCordServicesException( e.getMessage() );
        }
    }

    @Override
    public List<Usuario> getAllUsuarios() throws UCordServicesException {
        try {
            return persistence.getAllUsuarios();
        } catch (UcordPersistenceException e) {
            throw  new UCordServicesException( e.getMessage() );
        }
    }

    @Override
    public void actualizarFotoDeUsuario(String correo, String url) throws UCordServicesException {
        try {
            persistence.actualizarFotoDeUsuario(correo, url);
        } catch (UcordPersistenceException e) {
            throw new UCordServicesException( e.getMessage() );
        }
    }

    @Override
    public void actualizarContraseñaDeUsuario(String correo, String contraseña) throws UCordServicesException {
        try {
            persistence.actualizarContraseñaDeUsuario(correo, contraseña);
        } catch (UcordPersistenceException e) {
            throw new UCordServicesException( e.getMessage() );
        }
    }
}

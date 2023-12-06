package edu.eci.arsw.app.repositoriocentral.persistence.impl;

import edu.eci.arsw.app.repositoriocentral.model.Usuario;
import edu.eci.arsw.app.repositoriocentral.persistence.IUsuarioPersistence;
import edu.eci.arsw.app.repositoriocentral.persistence.UcordPersistenceException;
import edu.eci.arsw.app.repositoriocentral.persistence.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 9/28/2021
 */

@Service
public class UsuarioPersistence implements IUsuarioPersistence {
    @Autowired
    private IUsuarioRepository usuarioRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void guardarUsuario(Usuario usuario) throws UcordPersistenceException {
        try {
            if ( usuarioRepository.findByCorreo( usuario.getCorreo() ) != null ) throw new UcordPersistenceException(UcordPersistenceException.USER_ALREADY_EXISTS);

            usuarioRepository.save(usuario);
        }
        catch (UcordPersistenceException persistenceException ){
            throw persistenceException;
        }
        catch ( Exception exception ){
            throw new UcordPersistenceException(UcordPersistenceException.FAILED_CREATING+" The User");
        }

    }

    @Override
    public Usuario getUsuarioPorCorreo(String correo) throws UcordPersistenceException {
        Optional<Usuario> optionalUsuario = Optional.ofNullable(usuarioRepository.findByCorreo( correo ));
        optionalUsuario.orElseThrow( ()-> new UcordPersistenceException("The user with mail "+correo+" was "+UcordPersistenceException.NOT_FOUND));
        return optionalUsuario.get();
    }

    @Override
    public Usuario getUsuarioPorId(Integer id) throws UcordPersistenceException {
        Optional<Usuario>  optionalUsuario = usuarioRepository.findById(id);
        optionalUsuario.orElseThrow( ()-> new UcordPersistenceException(UcordPersistenceException.NOT_FOUND));
        return optionalUsuario.get();
    }

    @Override
    public List<Usuario> getAllUsuarios() throws UcordPersistenceException {
        List<Usuario> query = usuarioRepository.findAll();
        if ( query.size() == 0 ) throw new UcordPersistenceException(UcordPersistenceException.NOT_FOUND);
        return query;
    }

    @Override
    @Transactional
    public void actualizarFotoDeUsuario(String correo, String url) throws UcordPersistenceException{
        try{
            Query query = entityManager.createNativeQuery("UPDATE Usuarios SET url=? WHERE correo = ?");
            query.setParameter(1, url).setParameter(2, correo);
            query.executeUpdate();

        } catch ( Exception exception){
            exception.printStackTrace();
            throw new UcordPersistenceException(UcordPersistenceException.FAILED_UPDATING+" User "+correo);
        }
    }

    @Override
    @Transactional
    public void actualizarContraseñaDeUsuario(String correo, String contraseña) throws UcordPersistenceException{
        try{
            Query query = entityManager.createNativeQuery("UPDATE Usuarios SET password=? WHERE correo=?");
            query.setParameter(1, contraseña);
            query.setParameter(2, correo);
            query.executeUpdate();
        } catch ( Exception exception){
            exception.printStackTrace();
            throw new UcordPersistenceException(UcordPersistenceException.FAILED_UPDATING+" User "+correo);
        }
    }
}

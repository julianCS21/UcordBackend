package edu.eci.arsw.app.ucord.persistence;

import edu.eci.arsw.app.ucord.model.Usuario;
import java.util.List;


public interface IUsuarioPersistence {
    void guardarUsuario(Usuario usuario) throws UcordPersistenceException;

    Usuario getUsuarioPorCorreo( String correo ) throws UcordPersistenceException;

    Usuario getUsuarioPorId( Integer id ) throws UcordPersistenceException;

    List<Usuario> getAllUsuarios() throws UcordPersistenceException;

    void actualizarFotoDeUsuario( String correo, String url) throws UcordPersistenceException;

    void actualizarContraseñaDeUsuario( String correo, String contraseña ) throws UcordPersistenceException;
}

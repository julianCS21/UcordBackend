package edu.eci.arsw.app.ucord.service;

import edu.eci.arsw.app.ucord.model.Usuario;

import java.util.List;

/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 9/28/2021
 */


public interface IUsuarioService {
    //POST
    void agregarUsuario(Usuario usuario) throws UCordServicesException;

    //GET
    Usuario getUsuarioPorCorreo( String correo ) throws UCordServicesException;

    Usuario getUsuarioPorId( Integer id ) throws UCordServicesException;

    List<Usuario> getAllUsuarios() throws UCordServicesException;
    //PUT
    void actualizarFotoDeUsuario( String correo, String url) throws UCordServicesException;

    void actualizarContraseñaDeUsuario( String correo, String contraseña ) throws UCordServicesException;

}

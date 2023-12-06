package edu.eci.arsw.app.repositoriocentral.service;

/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 9/28/2021
 */
public class UCordServicesException extends Exception{
    public UCordServicesException(String message) {
        super(message);
    }

    public UCordServicesException(String message, Throwable cause) {
        super(message, cause);
    }
}

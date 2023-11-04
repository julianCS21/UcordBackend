package edu.eci.arsw.app.ucord.persistence;

public class UcordPersistenceException extends Exception {
    public static final String NOT_FOUND = "NOT_FOUND";
    public static final String FAILED_CREATING = "FAILED_CREATING";
    public static final String FAILED_UPDATING = "FAILED_UPDATING";
    public static final String USER_ALREADY_EXISTS = "THE_USER_ALREADY_EXISTS_ON_THE_DATABASE";
    public UcordPersistenceException(String message) {
        super(message);
    }

    public UcordPersistenceException(String message, Throwable cause) {
        super(message, cause);
    }
}

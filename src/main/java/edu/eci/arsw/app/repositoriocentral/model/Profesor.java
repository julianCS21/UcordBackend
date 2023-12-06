package edu.eci.arsw.app.repositoriocentral.model;

import javax.persistence.*;

@Entity
@Table(name = "profesores")
@PrimaryKeyJoinColumn( referencedColumnName = "idUsuario")
public class Profesor extends Usuario {

    @Column(name = "idUsuario")
    private Integer idUsuario;

    public Profesor(Integer idPersona, String correo, String nombreCompleto, String contraseña, String url, Integer idDecanatura) {
        super(idPersona, correo, nombreCompleto, contraseña, url, idDecanatura );
    }

    public Profesor() {
    }

    public Profesor(Integer idUsuario) {
        this.idUsuario = idUsuario;}

    public Integer getIdUsuario() {
        return this.idUsuario; }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;}



}

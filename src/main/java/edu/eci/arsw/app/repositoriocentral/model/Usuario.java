package edu.eci.arsw.app.repositoriocentral.model;

import javax.persistence.*;



@Entity
@Table(name = "usuarios")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {

    @Id     //Etiqueta necesaria para identificar la llave primaria de la tabla
    @Column (name="idUsuario", nullable = true)
    private Integer idUsuario;

    @Column (name="correo", nullable = false)
    private String correo;

    @Column (name="nombreCompleto", nullable = false)
    private String nombreCompleto;

    @Column (name="password", nullable = false)
    private String contraseña;

    @Column (name="url" )
    private String url;

    @Column(name="IdDecanatura", nullable = true)
    private Integer programa;

    public Usuario(){
    }

    public Usuario(Integer idUsuario, String correo, String nombreCompleto, String contraseña, String url, Integer idDecanatura ){
        this.idUsuario =  idUsuario;
        this.correo = correo;
        this.nombreCompleto = nombreCompleto;
        this.contraseña = contraseña;
        this.url = url;
        this.programa = idDecanatura;
    }

    public Integer getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getContraseña() {
        return this.contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPrograma() {
        return this.programa;
    }

    public void setPrograma(Integer programa) {
        this.programa = programa;
    }
 

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombreCompleto + ", contraseña=" + contraseña + ", correo=" + correo + ", idUsuario="
                + idUsuario + "decanatura="+ programa + "]";
    }
}


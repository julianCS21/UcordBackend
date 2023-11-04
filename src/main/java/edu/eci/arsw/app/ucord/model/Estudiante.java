package edu.eci.arsw.app.ucord.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "estudiantes")
@PrimaryKeyJoinColumn( referencedColumnName = "idUsuario")
public class Estudiante extends Usuario {

    @Column(name = "semestre")
    private Integer semestre;

    @Column(name ="idUsuario")
    private Integer idUsuario;


    public Estudiante(){
    }

    public Estudiante(Integer semestre){
            this.semestre = semestre;
}
    public Integer getSemestre() {return semestre;}
    public void setSemestre(Integer semestre) {this.semestre = semestre;}

}

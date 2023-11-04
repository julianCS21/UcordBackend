package edu.eci.arsw.app.ucord.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "decanaturas")
public class Decanatura {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idDecanatura;

    @Column (name="nombre", nullable = false)
    private String nombre;

    public Decanatura(){

    }

    public Decanatura( Integer idDecanatura, String nombre ) {
        this.idDecanatura = idDecanatura;
        this.nombre = nombre;
    }

    public Integer getId() {
        return idDecanatura;
    }

    public void setId(Integer idDecanatura) {
        this.idDecanatura = idDecanatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

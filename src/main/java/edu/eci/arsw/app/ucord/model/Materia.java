package edu.eci.arsw.app.ucord.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "materias")
public class Materia {

    @Id
    @Column (name="sigla", nullable = false)
    private String sigla;

    @Column (name="nombre", nullable = false)
    private String nombre;

    @Column (name="creditos", nullable = false)
    private Integer creditos;

    @Column (name="idDecanatura", nullable = true)
    private Integer decanaturaM;

    public Materia(){}

    public Materia(String sigla, String nombre, Integer creditos) {
        this.sigla = sigla;
        this.nombre = nombre;
        this.creditos = creditos;
    }


    public String getSigla() {
        return this.sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCreditos() {
        return this.creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public Integer getDecanaturaM() {
        return this.decanaturaM;
    }

    public void setDecanaturaM(Integer decanaturaM) {
        this.decanaturaM = decanaturaM;
    }
    
}

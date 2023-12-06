package edu.eci.arsw.app.repositoriocentral.model;

import javax.persistence.*;


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

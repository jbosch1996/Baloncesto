package com.bosch.domain;

/**
 * Created by 53298857Z on 14/10/2016.
 */
import javax.persistence.*;
import java.time.LocalDate;


@Entity
public class Jugadores {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private LocalDate nacimiento;
    private Integer canastas;
    private Integer asitencias;
    private Integer rebotes;
    private String posicion;

    public Jugadores(){

    }

    public Jugadores(String nombre, LocalDate nacimiento, Integer canastas, Integer asitencias, Integer rebotes, String posicion) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.canastas = canastas;
        this.asitencias = asitencias;
        this.rebotes = rebotes;
        this.posicion = posicion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getnacimiento() {
        return nacimiento;
    }

    public void setnacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Integer getCanastas() {
        return canastas;
    }

    public void setCanastas(Integer canastas) {
        this.canastas = canastas;
    }

    public Integer getAsitencias() {
        return asitencias;
    }

    public void setAsitencias(Integer asitencias) {
        this.asitencias = asitencias;
    }

    public Integer getRebotes() {
        return rebotes;
    }

    public void setRebotes(Integer rebotes) {
        this.rebotes = rebotes;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugadores{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha_nacimiento='" + nacimiento + '\'' +
                ", canastas=" + canastas +
                ", asitencias=" + asitencias +
                ", rebotes=" + rebotes +
                ", posicion='" + posicion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jugadores jugadores = (Jugadores) o;

        if (id != jugadores.id) return false;
        if (!nombre.equals(jugadores.nombre)) return false;
        if (!nacimiento.equals(jugadores.nacimiento)) return false;
        if (!canastas.equals(jugadores.canastas)) return false;
        if (!asitencias.equals(jugadores.asitencias)) return false;
        if (!rebotes.equals(jugadores.rebotes)) return false;
        return posicion.equals(jugadores.posicion);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + nombre.hashCode();
        result = 31 * result + nacimiento.hashCode();
        result = 31 * result + canastas.hashCode();
        result = 31 * result + asitencias.hashCode();
        result = 31 * result + rebotes.hashCode();
        result = 31 * result + posicion.hashCode();
        return result;
    }

}

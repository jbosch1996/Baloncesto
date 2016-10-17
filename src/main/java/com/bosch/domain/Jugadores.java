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
    private String apellido;
    private LocalDate nacimiento;
    private Integer canastas;
    private Integer asitencias;
    private Integer rebotes;
    private String posicion;

    public Jugadores(){

    }

    public Jugadores(String nombre, String apellido, LocalDate nacimiento, Integer canastas, Integer asitencias, Integer rebotes, String posicion) {
        this.nombre = nombre;
        this.apellido = apellido;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
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
                ", apellido='" + apellido + '\'' +
                ", nacimiento=" + nacimiento +
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

        if (id != null ? !id.equals(jugadores.id) : jugadores.id != null) return false;
        if (nombre != null ? !nombre.equals(jugadores.nombre) : jugadores.nombre != null) return false;
        if (apellido != null ? !apellido.equals(jugadores.apellido) : jugadores.apellido != null) return false;
        if (nacimiento != null ? !nacimiento.equals(jugadores.nacimiento) : jugadores.nacimiento != null) return false;
        if (canastas != null ? !canastas.equals(jugadores.canastas) : jugadores.canastas != null) return false;
        if (asitencias != null ? !asitencias.equals(jugadores.asitencias) : jugadores.asitencias != null) return false;
        if (rebotes != null ? !rebotes.equals(jugadores.rebotes) : jugadores.rebotes != null) return false;
        return posicion != null ? posicion.equals(jugadores.posicion) : jugadores.posicion == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        result = 31 * result + (nacimiento != null ? nacimiento.hashCode() : 0);
        result = 31 * result + (canastas != null ? canastas.hashCode() : 0);
        result = 31 * result + (asitencias != null ? asitencias.hashCode() : 0);
        result = 31 * result + (rebotes != null ? rebotes.hashCode() : 0);
        result = 31 * result + (posicion != null ? posicion.hashCode() : 0);
        return result;
    }
}

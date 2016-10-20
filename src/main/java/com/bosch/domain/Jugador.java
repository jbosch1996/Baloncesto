package com.bosch.domain;

/**
 * Created by 53298857Z on 14/10/2016.
 */
import javax.persistence.*;
import java.time.LocalDate;


@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private LocalDate nacimiento;
    private Integer canastas;
    private Integer asistencias;
    private Integer rebotes;
    private Posicion posicion;
    @ManyToOne
    private Equipo equipo;


    public Jugador(){

    }

    public Jugador(String nombre, String apellido, LocalDate nacimiento, Integer canastas, Integer asistencias, Integer rebotes, Posicion posicion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.canastas = canastas;
        this.asistencias = asistencias;
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

    public Integer getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(Integer asistencias) {
        this.asistencias = asistencias;
    }

    public Integer getRebotes() {
        return rebotes;
    }

    public void setRebotes(Integer rebotes) {
        this.rebotes = rebotes;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nacimiento=" + nacimiento +
                ", canastas=" + canastas +
                ", asistencias=" + asistencias +
                ", rebotes=" + rebotes +
                ", posicion=" + posicion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jugador jugador = (Jugador) o;

        if (id != null ? !id.equals(jugador.id) : jugador.id != null) return false;
        if (nombre != null ? !nombre.equals(jugador.nombre) : jugador.nombre != null) return false;
        if (apellido != null ? !apellido.equals(jugador.apellido) : jugador.apellido != null) return false;
        if (nacimiento != null ? !nacimiento.equals(jugador.nacimiento) : jugador.nacimiento != null) return false;
        if (canastas != null ? !canastas.equals(jugador.canastas) : jugador.canastas != null) return false;
        if (asistencias != null ? !asistencias.equals(jugador.asistencias) : jugador.asistencias != null)
            return false;
        if (rebotes != null ? !rebotes.equals(jugador.rebotes) : jugador.rebotes != null) return false;
        return posicion == jugador.posicion;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        result = 31 * result + (nacimiento != null ? nacimiento.hashCode() : 0);
        result = 31 * result + (canastas != null ? canastas.hashCode() : 0);
        result = 31 * result + (asistencias != null ? asistencias.hashCode() : 0);
        result = 31 * result + (rebotes != null ? rebotes.hashCode() : 0);
        result = 31 * result + (posicion != null ? posicion.hashCode() : 0);
        return result;
    }
}

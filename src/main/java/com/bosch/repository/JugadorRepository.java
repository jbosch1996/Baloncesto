package com.bosch.repository;

import com.bosch.domain.Equipo;
import com.bosch.domain.Jugador;
import com.bosch.domain.Posicion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by 53298857Z on 14/10/2016.
 */
public interface JugadorRepository extends JpaRepository<Jugador, Long> {

    List<Jugador> findBynombre(String nombre);
    List<Jugador> findBycanastasGreaterThanEqual(Integer canastas);
    List<Jugador> findByasistenciasBetween(Integer min, Integer max);
    List<Jugador> findByposicion(Posicion posicion);
    List<Jugador> findBynacimientoBefore(LocalDate nacimiento);
    List<Jugador>findByEquipoNombre(String nombre);
    List<Jugador>findByEquipoNombreAndPosicion(String nombre,Posicion posicion);



    @Query("SELECT jugador.posicion, AVG(jugador.canastas), AVG(jugador.asistencias), AVG(jugador.rebotes) " +
            "FROM Jugador jugador " +
            "GROUP BY jugador.posicion")
    List<Object[]> AvgJugadorposicion();

    @Query("SELECT jugador.posicion, AVG(jugador.canastas), AVG(jugador.asistencias), AVG(jugador.rebotes),MAX(jugador.canastas),MAX(jugador.asistencias),MAX(jugador.rebotes)" +
            ",MIN(jugador.canastas),MIN(jugador.asistencias),MIN(jugador.rebotes) " +
            "FROM Jugador jugador " +
            "GROUP BY jugador.posicion")
    List<Object[]> AvgJugadormaxmin();






}

package com.bosch.repository;

import com.bosch.domain.Jugadores;
import com.bosch.domain.Posicion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by 53298857Z on 14/10/2016.
 */
public interface JugadorRepository extends JpaRepository<Jugadores, Long> {

    List<Jugadores> findBynombre(String nombre);
    List<Jugadores> findBycanastasGreaterThanEqual(Integer canastas);
    List<Jugadores> findByasistenciasBetween(Integer min,Integer max);
    List<Jugadores> findByposicion(Posicion posicion);
    List<Jugadores> findBynacimientoBefore(LocalDate nacimiento);

    @Query("SELECT jugadores.posicion, AVG(jugadores.canastas), AVG(jugadores.asistencias), AVG(jugadores.rebotes) " +
            "FROM Jugadores jugadores " +
            "GROUP BY jugadores.posicion")
    List<Object[]> AvgJugadoresposicion();

    @Query("SELECT jugadores.posicion, AVG(jugadores.canastas), AVG(jugadores.asistencias), AVG(jugadores.rebotes),MAX(jugadores.canastas),MAX(jugadores.asistencias),MAX(jugadores.rebotes)" +
            ",MIN(jugadores.canastas),MIN(jugadores.asistencias),MIN(jugadores.rebotes) " +
            "FROM Jugadores jugadores " +
            "GROUP BY jugadores.posicion")
    List<Object[]> AvgJugadoresmaxmin();




}

package com.bosch.repository;

import com.bosch.domain.Jugadores;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 53298857Z on 14/10/2016.
 */
public interface JugadorRepository extends JpaRepository<Jugadores, Long> {

    List<Jugadores> findBynombre(String nombre);
    List<Jugadores> findBycanastasGreaterThanEqual(Integer canastas);
    List<Jugadores> findByasistenciasBetween(Integer min,Integer max);
    List<Jugadores> findByposicion(String posicion);


}

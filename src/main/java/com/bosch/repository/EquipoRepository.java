package com.bosch.repository;

import com.bosch.domain.Equipo;
import com.bosch.domain.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by 53298857Z on 20/10/2016.
 */
public interface EquipoRepository extends JpaRepository <Equipo, Long> {

    List<Equipo> findByLocalidad(String localidad);

    @Query("select e from Equipo e order by e.localidad")
    List<Equipo> equipoByLocalidad();




}

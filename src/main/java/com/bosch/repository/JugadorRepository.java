package com.bosch.repository;

import com.bosch.domain.Jugadores;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 53298857Z on 14/10/2016.
 */
public interface JugadorRepository extends JpaRepository<Jugadores, Long> {
}

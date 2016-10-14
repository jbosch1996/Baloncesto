package com.bosch.service;

import com.bosch.domain.Jugadores;
import com.bosch.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 53298857Z on 14/10/2016.
 */
@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    public void testJugadores(){
        Jugadores jug1 = new Jugadores("Jose",19-9-1991,120,30,30,"base");


        System.out.println("Buscar jugador por nombre:" );
        System.out.println(jugadorRepository.);
    }
}

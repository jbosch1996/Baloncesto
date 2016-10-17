package com.bosch.service;

import com.bosch.domain.Jugadores;
import com.bosch.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * Created by 53298857Z on 14/10/2016.
 */
@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    public void testJugadores(){
        Jugadores jug1 = new Jugadores("Jose","Maria", LocalDate.of(1992,10,2),120,30,30,"base");
        jugadorRepository.save(jug1);

        Jugadores jug2 = new Jugadores("Antonio","Garcia", LocalDate.of(1990,5,4),300,60,60,"pivot");
        jugadorRepository.save(jug2);

        Jugadores jug3 = new Jugadores("Juan","Jesus", LocalDate.of(1987,6,6),220,50,8,"escolta");
        jugadorRepository.save(jug3);

        Jugadores jug4 = new Jugadores("Romeo","Gonzalez", LocalDate.of(1992,10,02),400,10,9,"ala-pivot");
        jugadorRepository.save(jug4);

        Jugadores jug5 = new Jugadores("Leo","Messi", LocalDate.of(1992,10,02),300,40,20,"alero");
        jugadorRepository.save(jug5);

        System.out.println("Buscar jugador por nombre:" );
        System.out.println(jugadorRepository.findBynombre("Jose"));
        System.out.println("Buscar por numero de canastas :");
        System.out.println(jugadorRepository.findBycanastasGreaterThanEqual(250));




    }
}

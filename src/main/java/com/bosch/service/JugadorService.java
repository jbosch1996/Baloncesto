package com.bosch.service;

import com.bosch.domain.Equipo;
import com.bosch.domain.Jugador;
import com.bosch.repository.EquipoRepository;
import com.bosch.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

import static com.bosch.domain.Posicion.*;


/**
 * Created by 53298857Z on 14/10/2016.
 */
@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    public void testJugadores(){



        Jugador jug1 = new Jugador("Jose","Maria", LocalDate.of(1992,10,2),120,30,30,base);


        Equipo equipo1 = new Equipo("Bulls","Chicago",LocalDate.of(1966,10,2));
        equipoRepository.save(equipo1);
        jug1.setEquipo(equipo1);
        jugadorRepository.save(jug1);

        Jugador jug2 = new Jugador("Antonio","Garcia", LocalDate.of(1990,5,4),300,60,60,pivot);
        jugadorRepository.save(jug2);

        Jugador jug3 = new Jugador("Juan","Jesus", LocalDate.of(1987,6,6),220,50,8,escolta);
        jugadorRepository.save(jug3);

        Jugador jug4 = new Jugador("Romeo","Gonzalez", LocalDate.of(1992,10,2),400,10,9,alapivot);
        jugadorRepository.save(jug4);

        Jugador jug5 = new Jugador("Leo","Messi", LocalDate.of(1992,10,02),300,40,20,alero);
        jugadorRepository.save(jug5);

        Jugador jug6 = new Jugador("Rafa","Marquez", LocalDate.of(1994,1,6),200,50,10,pivot);
        jugadorRepository.save(jug6);


        System.out.println("Buscar jugador por nombre:" );
        System.out.println(jugadorRepository.findBynombre("Jose"));
        System.out.println("Buscar por numero de canastas :");
        System.out.println(jugadorRepository.findBycanastasGreaterThanEqual(250));
        System.out.println("Buscar por numero de asistencias 1 y 25 :");
        System.out.println(jugadorRepository.findByasistenciasBetween(1,25));
        System.out.println("Buscar jugador por posicion:" );
        System.out.println(jugadorRepository.findByposicion(base));
        System.out.println("Buscar jugador por nacimiento:" );
        System.out.println(jugadorRepository.findBynacimientoBefore(LocalDate.of(1990,10,10)));
        System.out.println("Buscar jugador por posicion:" );
       jugadorRepository.AvgJugadorposicion().forEach( posicion ->
                System.out.println("posicion =" + posicion[0] + "media canastas" + posicion[1] + "media asistencias" + posicion[2] + "media rebotes" + posicion [3]));

        System.out.println("Buscar jugador por posicion(Media,Max,Min):" );
        jugadorRepository.AvgJugadormaxmin().forEach( posicion ->
                System.out.println("posicion =" + posicion[0] + "media canastas" + posicion[1] + "media asistencias" + posicion[2] + "media rebotes" + posicion [3] + "max canastas" + posicion[4]
                + "max asistencias" + posicion[5] + "max rebotes" + posicion[6] + "min canastas" + posicion[7] + "min asistencias" + posicion[8] + "min rebotes" + posicion[9]));




    }
}

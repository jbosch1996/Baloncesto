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

        //EQUIPO 1

        Jugador jug1 = new Jugador("Jose","Maria", LocalDate.of(1992,10,2),120,30,30,base);
        Jugador jug2 = new Jugador("Antonio","Garcia", LocalDate.of(1990,5,4),300,60,60,pivot);
        Jugador jug3 = new Jugador("Juan","Jesus", LocalDate.of(1987,6,6),220,50,8,escolta);
        Jugador jug4 = new Jugador("Romeo","Gonzalez", LocalDate.of(1992,10,2),400,10,9,alapivot);
        Jugador jug5 = new Jugador("Leo","Messi", LocalDate.of(1992,10,02),300,40,20,alero);
        Equipo equipo1 = new Equipo("Bulls","Chicago",LocalDate.of(1966,10,2));
        equipoRepository.save(equipo1);
        jug1.setEquipo(equipo1);
        jug2.setEquipo(equipo1);
        jug3.setEquipo(equipo1);
        jug4.setEquipo(equipo1);
        jug5.setEquipo(equipo1);
        jugadorRepository.save(jug1);
        jugadorRepository.save(jug2);
        jugadorRepository.save(jug3);
        jugadorRepository.save(jug4);
        jugadorRepository.save(jug5);


        //EQUIPO 2

        Jugador jug6 = new Jugador("Rafa","Marquez", LocalDate.of(1994,1,6),200,50,10,base);
        Jugador jug7 = new Jugador("Lilian","Thuram", LocalDate.of(1990,10,9),300,30,5,escolta);
        Jugador jug8 = new Jugador("Juan","Carlos", LocalDate.of(1988,1,3),150,20,60,pivot);
        Jugador jug9 = new Jugador("Luis","Suarez", LocalDate.of(1989,3,10),100,20,10,alapivot);
        Jugador jug10 = new Jugador("Bomba","Navarro", LocalDate.of(1985,7,12),120,30,20,alero);
        Equipo equipo2 = new Equipo("FCBarcelona","Barcelona",LocalDate.of(1960,2,9));
        equipoRepository.save(equipo2);
        jug6.setEquipo(equipo2);
        jug7.setEquipo(equipo2);
        jug8.setEquipo(equipo2);
        jug9.setEquipo(equipo2);
        jug10.setEquipo(equipo2);
        jugadorRepository.save(jug6);
        jugadorRepository.save(jug7);
        jugadorRepository.save(jug8);
        jugadorRepository.save(jug9);
        jugadorRepository.save(jug10);

        //EQUIPO 3

        Jugador jug11 = new Jugador("Carlos","Manuel", LocalDate.of(1991,5,8),200,50,10,base);
        Jugador jug12 = new Jugador("Juan","Jose", LocalDate.of(1990,10,9),300,30,5,escolta);
        Jugador jug13 = new Jugador("Zlatan","Ibrahimovic", LocalDate.of(1988,1,3),150,20,60,pivot);
        Jugador jug14 = new Jugador("Pipas","Alcacer", LocalDate.of(1989,3,10),100,20,10,alapivot);
        Jugador jug15 = new Jugador("Luis","Nani", LocalDate.of(1985,7,12),120,30,20,alero);
        Equipo equipo3 = new Equipo("Los Lakers","Los Angeles",LocalDate.of(1960,1,5));
        equipoRepository.save(equipo3);
        jug11.setEquipo(equipo3);
        jug12.setEquipo(equipo3);
        jug13.setEquipo(equipo3);
        jug14.setEquipo(equipo3);
        jug15.setEquipo(equipo3);
        jugadorRepository.save(jug11);
        jugadorRepository.save(jug12);
        jugadorRepository.save(jug13);
        jugadorRepository.save(jug14);
        jugadorRepository.save(jug15);

        //EQUIPO 4

        Jugador jug16 = new Jugador("Moussa","Dembele", LocalDate.of(1991,10,3),210,30,15,base);
        Jugador jug17 = new Jugador("Thierry","Henery", LocalDate.of(1990,11,30),300,30,10,escolta);
        Jugador jug18 = new Jugador("Marco","VanBasten", LocalDate.of(1988,7,29),200,10,80,pivot);
        Jugador jug19 = new Jugador("Johan","Cruyff", LocalDate.of(1987,5,25),150,10,20,alapivot);
        Jugador jug20 = new Jugador("Aleix","Vidal", LocalDate.of(1984,7,21),180,70,5,alero);
        Equipo equipo4 = new Equipo("Real Madrid","Madrid",LocalDate.of(1879,11,27));
        equipoRepository.save(equipo4);
        jug16.setEquipo(equipo4);
        jug17.setEquipo(equipo4);
        jug18.setEquipo(equipo4);
        jug19.setEquipo(equipo4);
        jug20.setEquipo(equipo4);
        jugadorRepository.save(jug16);
        jugadorRepository.save(jug17);
        jugadorRepository.save(jug18);
        jugadorRepository.save(jug19);
        jugadorRepository.save(jug20);

        //EQUIPO 5

        Jugador jug21 = new Jugador("Sergi","Roberto", LocalDate.of(1990,11,25),200,40,30,base);
        Jugador jug22 = new Jugador("Marc","Bartra", LocalDate.of(1987,8,15),300,50,20,escolta);
        Jugador jug23 = new Jugador("Kobe","Bryant", LocalDate.of(1986,6,12),250,30,100,pivot);
        Jugador jug24 = new Jugador("Lebron","James", LocalDate.of(1985,6,12),300,20,30,alapivot);
        Jugador jug25 = new Jugador("Kevin","Durant", LocalDate.of(1988,4,19),250,50,20,alero);
        Equipo equipo5 = new Equipo("San Antonio Spurs","San Antonio",LocalDate.of(1899,12,19));
        equipoRepository.save(equipo5);
        jug21.setEquipo(equipo5);
        jug22.setEquipo(equipo5);
        jug23.setEquipo(equipo5);
        jug24.setEquipo(equipo5);
        jug25.setEquipo(equipo5);
        jugadorRepository.save(jug21);
        jugadorRepository.save(jug22);
        jugadorRepository.save(jug23);
        jugadorRepository.save(jug24);
        jugadorRepository.save(jug25);

        System.out.println("-----------------" );
        System.out.println("-----------------" );
        System.out.println("QUERYS JUGADORES:" );
        System.out.println("-----------------" );
        System.out.println("-----------------" );
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
        System.out.println("-----------------" );
        System.out.println("-----------------" );
        System.out.println("QUERYS EQUIPOS" );
        System.out.println("Buscar Equipo por Localidad");
        System.out.println(equipoRepository.findByLocalidad("Barcelona"));
        System.out.println("-----------------" );
        System.out.println("-----------------" );
        System.out.println("Buscar equipo por nombre");
        System.out.println(jugadorRepository.findByEquipoNombre("FCBarcelona"));
        System.out.println("-----------------" );
        System.out.println("-----------------" );
        System.out.println("Buscar equipo por posicion");
        System.out.println(jugadorRepository.findByEquipoNombreAndPosicion("FCBarcelona",alero));
        System.out.println("-----------------" );
        System.out.println("-----------------" );
        System.out.println("Buscar jugador con mas canastas de un equipo");


    }
}

package com.bosch.controller;

import com.bosch.domain.Jugador;
import com.bosch.domain.Posicion;
import com.bosch.repository.JugadorRepository;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by 53298857Z on 24/10/2016.
 */
@RestController
@RequestMapping("/jugadores")
public class JugadorController {
    @Autowired
    private JugadorRepository jugadorRepository;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Jugador createJugador(@RequestBody Jugador jugador){
        return jugadorRepository.save(jugador);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Jugador updateJugador(@RequestBody Jugador jugador) {
        return jugadorRepository.save(jugador);
    }
    @RequestMapping(method= RequestMethod.GET)
    public List<Jugador> findAll() {
        return jugadorRepository.findAll();
    }

    @RequestMapping(value = "/{id}",
            method = RequestMethod.GET)
    public Jugador findById(@PathVariable Long id){
        Jugador jugador =  jugadorRepository.findOne(id);
        return jugador;
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deletePlayer(@PathVariable Long id) {
        jugadorRepository.delete(id);
    }

    @RequestMapping(value = "/byCanastas/{canastas}",
            method = RequestMethod.GET)
    public List<Jugador> findByCanastasGreaterThan(@PathVariable Integer canastas){
        return jugadorRepository.findByCanastasGreaterThan(canastas);
    }
    @RequestMapping (value = "/byOrderCanastas",method = RequestMethod.GET)
    public List<Jugador> findByOrderByCanastasDesc(){
        return jugadorRepository.findByOrderByCanastasDesc();
    }
    @RequestMapping(value = "/byCanastasBetween/{min}/{max}",
            method = RequestMethod.GET)
    public List<Jugador> findByCanastasBetween(@PathVariable Integer min,@PathVariable Integer max){
        return jugadorRepository.findByCanastasBetween(min,max);
    }
    @GetMapping("/jugadoresByPosicionAndCanastas")
    public Map<Posicion, Collection<Jugador>> jugadorByPosicionCanastas(){
        List<Jugador> jugador = jugadorRepository.jugadorByPosicionCanastas();

        ListMultimap<Posicion, Jugador> jugadorMultiMap = ArrayListMultimap.create();

        for(Jugador p: jugador){
            jugadorMultiMap.put(p.getPosicion(), p);
        }+

        return jugadorMultiMap.asMap();
    }

    @GetMapping("/posicionAndMedia")
    public Map<Posicion, EstadisticasPosicion> findByPosicionAndMedia() {

        List<Object[]> estadisticasPosicions = jugadorRepository.findByPosicionAndMedia();

        Map<Posicion, EstadisticasPosicion> estadisticasPosicionMap = new HashMap<>();

        estadisticasPosicions.
                forEach(estadisticasPosicion -> {

                    EstadisticasPosicion aux = new EstadisticasPosicion();
                    aux.setPosicion((Posicion) estadisticasPosicion[0]);
                    aux.setMinCanastas((Integer) estadisticasPosicion[1]);
                    aux.setMaxCanastas((Integer) estadisticasPosicion[2]);
                    aux.setAvgCanastas((Double) estadisticasPosicion[3]);

                    estadisticasPosicionMap.put(aux.getPosicion(), aux);

                });
        return estadisticasPosicionMap;
    }


}

package com.bosch.controller;

import com.bosch.domain.Jugador;
import com.bosch.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

    @RequestMapping(method= RequestMethod.GET)
    public List<Jugador> findAll() {
       return jugadorRepository.findAll();
    }
}

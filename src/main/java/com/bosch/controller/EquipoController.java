package com.bosch.controller;

import com.bosch.domain.Equipo;
import com.bosch.repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 53298857Z on 03/11/2016.
 */
@RestController
@RequestMapping("/equipos")
public class EquipoController {
    @Autowired
    private EquipoRepository equipoRepository;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Equipo createEquipo(@RequestBody Equipo equipo){
        return equipoRepository.save(equipo);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Equipo updateEquipo(@RequestBody Equipo equipo) {
        return equipoRepository.save(equipo);
    }
    @RequestMapping(method= RequestMethod.GET)
    public List<Equipo> findAll() {
        return equipoRepository.findAll();
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deletePlayer(@PathVariable Long id) {
        equipoRepository.delete(id);
    }
}

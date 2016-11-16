package com.bosch.controller;

import com.bosch.domain.Equipo;
import com.bosch.repository.EquipoRepository;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;

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
    @GetMapping("/equiposByLocalidad")
    public Map<String, Collection<Equipo>> equipoByLocalidad(){
        List<Equipo> equipos = equipoRepository.equipoByLocalidad();

        ListMultimap<String,Equipo> equipoMultiMap = ArrayListMultimap.create();

        for(Equipo e: equipos){
            equipoMultiMap.put(e.getLocalidad(), e);
        }

        return equipoMultiMap.asMap();
    }
}

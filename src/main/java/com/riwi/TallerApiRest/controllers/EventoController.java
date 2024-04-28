package com.riwi.TallerApiRest.controllers;

import com.riwi.TallerApiRest.entites.Evento;
import com.riwi.TallerApiRest.repositories.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/events")

public class EventoController {

    @Autowired
    private EventoRepository eventoRepository;

    @GetMapping(name = "/obtener")
    public List<Evento> findAll() {
        return eventoRepository.findAll();
    }

    @PostMapping(name = "/crear ")
    public Evento add(@RequestBody Evento evento) {
        return eventoRepository.save(evento);
    }

    @GetMapping("{id}, name = ('/obtenerById')")
    public Optional<Evento> findById(@RequestParam Long id) {
        return eventoRepository.findById(id);
    }

}

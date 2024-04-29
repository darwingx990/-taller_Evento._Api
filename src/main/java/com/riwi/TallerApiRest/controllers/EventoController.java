package com.riwi.TallerApiRest.controllers;

import com.riwi.TallerApiRest.entites.Evento;
import com.riwi.TallerApiRest.services.IEventoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/events")
@AllArgsConstructor

public class EventoController {

    @Autowired
    private final IEventoService objEventoService;

    @GetMapping
    public ResponseEntity<List<Evento>> findAll() {
        return ResponseEntity.ok(this.objEventoService.getAllEventos());
    }

    @PostMapping
    public ResponseEntity<Evento> insert(@RequestBody Evento evento) {
        return ResponseEntity.ok(this.objEventoService.save(evento));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Evento> findById(@PathVariable Long id) {
        return ResponseEntity.ok(this.objEventoService.getById(id));
    }

    @PutMapping(path = "/id")
    public ResponseEntity<Evento> update(@RequestBody Evento objEvento, @PathVariable Long id) {
        objEvento.setId(id);
        return ResponseEntity.ok(this.objEventoService.update(objEvento));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.objEventoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

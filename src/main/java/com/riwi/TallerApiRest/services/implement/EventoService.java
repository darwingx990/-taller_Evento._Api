package com.riwi.TallerApiRest.services.implement;

import com.riwi.TallerApiRest.entites.Evento;
import com.riwi.TallerApiRest.repositories.EventoRepository;
import com.riwi.TallerApiRest.services.IEventoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EventoService implements IEventoService {
   @Autowired
   private final EventoRepository objEventoRepository;

    @Override
    public Evento save(Evento objEvento) {
        return objEventoRepository.save(objEvento);
    }

    @Override
    public List<Evento> getAllEventos() {
        return this.objEventoRepository.findAll();
    }

    @Override
    public Evento getById(Long id) {
        return this.objEventoRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(Long id) {
        this.objEventoRepository.deleteById(id);
    }

    @Override
    public Evento update(Evento objEvent) {
        return objEventoRepository.save(objEvent);
    }
}

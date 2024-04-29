package com.riwi.TallerApiRest.services;
import com.riwi.TallerApiRest.entites.Evento;

import java.util.List;
import java.util.Optional;

public interface IEventoService {
    public Evento save(Evento objevento);
    public List<Evento> getAllEventos();
    public Evento getById(Long id);
    public void delete(Long id);
    public Evento update(Evento objEvent);

}

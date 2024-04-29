package com.riwi.TallerApiRest.services;
import com.riwi.TallerApiRest.entites.Evento;

import java.util.List;

public interface IEventoService {
     Evento save(Evento objevento);
     List<Evento> getAllEventos();
     Evento getById(String id);
     void delete(String id);
     Evento update(Evento objEvent);

}

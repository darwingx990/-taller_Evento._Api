package com.riwi.TallerApiRest.repositories;

import com.riwi.TallerApiRest.entites.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {


}

package com.matchactivities.springbootbackend.repository;

import com.matchactivities.springbootbackend.model.Agenda;
import com.matchactivities.springbootbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Long> {

    List<Agenda>  findAllByCriadoPor(String list);
    Agenda findById(long id);
}

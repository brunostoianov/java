package br.com.isidrocorp.eventdash.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.isidrocorp.eventdash.model.Alarme;

public interface AlarmeDAO extends CrudRepository<Alarme, Integer> {
}

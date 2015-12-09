package br.com.RecTourist.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.RecTourist.entidade.PontosTuristicos;

@Repository
public interface IPontosTuristicosDao extends CrudRepository<PontosTuristicos, Long> {

}

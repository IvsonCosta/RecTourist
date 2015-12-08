package br.com.RecTourist.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.RecTourist.entidade.Usuario;

@Repository
public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

}

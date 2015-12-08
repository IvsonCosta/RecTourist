package br.com.RecTourist.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.RecTourist.dao.IUsuarioDao;
import br.com.RecTourist.entidade.Usuario;

@Service
public class UsuarioControler {

	@Autowired
	private IUsuarioDao usuarioDao;
	
	
	public void salvar(Usuario t){
		usuarioDao.save(t);
	}
	
	public List<Usuario> list() {
		return (List<Usuario>) usuarioDao.findAll();
	}
	
	public void excluir(Long id){
		usuarioDao.delete(id);
	}
	
}

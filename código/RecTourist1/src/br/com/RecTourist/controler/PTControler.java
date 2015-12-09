package br.com.RecTourist.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.RecTourist.dao.IPontosTuristicosDao;
import br.com.RecTourist.entidade.PontosTuristicos;

@Service
public class PTControler {
	@Autowired
	private IPontosTuristicosDao pontosTuristicosDao;

	public void salvar(PontosTuristicos t) {
		pontosTuristicosDao.save(t);
	}

	public void excluir(Long id) {
		pontosTuristicosDao.delete(id);

	}
	public List<PontosTuristicos> list(){
		return(List<PontosTuristicos>)pontosTuristicosDao.findAll();
	}
}

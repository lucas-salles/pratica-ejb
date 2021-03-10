package com.gugawag.pdist.ejbs;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.gugawag.pdist.model.Mensagem;

@Stateless(name = "mensagemService")
public class MensagemService {
	@EJB
	private MensagemDAO mensagemDao;
	
	public List<Mensagem> listar() {
		return mensagemDao.listar();
	}
	
	public void inserir(long id, String texto) {
		Mensagem novaMensagem = new Mensagem(id, texto);
		mensagemDao.inserir(novaMensagem);
	}
	
	public String pesquisarPorId(long id) {
		return mensagemDao.pesquisarPorId(id);
	}
}

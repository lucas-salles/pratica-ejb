package com.gugawag.pdist.ejbs;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.gugawag.pdist.model.Mensagem;

@Stateless
public class MensagemDAO {
	
	@PersistenceContext(unitName="default")
    private EntityManager em;
	
	public void inserir(Mensagem novaMensagem) {
		em.persist(novaMensagem);
	}
	
	public List<Mensagem> listar() {
		try {
			return em.createQuery("FROM Mensagem").getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}
	
	public String pesquisarPorId(long id) {
		try {
			Query q = em.createQuery("SELECT texto FROM Mensagem m WHERE m.id= :x");
			q.setParameter("x", id);
			return (String) q.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
}

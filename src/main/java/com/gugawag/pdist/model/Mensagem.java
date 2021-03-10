package com.gugawag.pdist.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mensagem implements Serializable {
	@Id
	private long id;
	private String texto;
	
	public Mensagem() {}

	public Mensagem(long id, String texto) {
		this.id = id;
		this.texto = texto;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
}

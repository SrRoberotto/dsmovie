package com.devsuperior.dsmovie.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//Classe para comportar a chave primaria composta
@Embeddable
public class ScorePK implements Serializable{
	private static final long serialVersionUID = 1L;//Versão do serializable

	@ManyToOne
	@JoinColumn (name="mobie_id")
	private Movie movie;
	
	
	@ManyToOne
	@JoinColumn (name="user_id")
	private User user;
	
	public ScorePK () {
		
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}


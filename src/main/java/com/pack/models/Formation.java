package com.pack.models;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Formation {
	private long id;
	private String nom;
	private String duree;
	private Formateur formateur;
	// private String formateur;

	public Formation() {

	}

	public Formation(String nom, String duree, Formateur formateur) {
		this.nom = nom;
		this.duree = duree;
		this.formateur = formateur;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_formateur", nullable = false)

	public Formateur getFormateur() {
		return formateur;
	}

	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}

	@Override
	public String toString() {
		return "Formation [id=" + id + ", nom=" + nom + ", duree=" + duree + ", formateur=" + formateur + "]";
	}

	
}

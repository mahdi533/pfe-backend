package com.pack.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evaluation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String moyensPedagogique;
	String supportCours;
	String evalFormateur;
	String extras;
	String pedagogee;
	/*
	 * @ManyToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "id_formation", null table = false) Formation formation;
	 */

	public Evaluation() {
	}

	public Evaluation(String moyensPedagogique, String supportCours, String evalFormateur, String extras,
			String pedagogee) {
		super();
		this.moyensPedagogique = moyensPedagogique;
		this.supportCours = supportCours;
		this.evalFormateur = evalFormateur;
		this.extras = extras;
		this.pedagogee = pedagogee;
		//this.formation = formation;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMoyensPedagogique() {
		return moyensPedagogique;
	}

	public void setMoyensPedagogique(String moyensPedagogique) {
		this.moyensPedagogique = moyensPedagogique;
	}

	public String getSupportCours() {
		return supportCours;
	}

	public void setSupportCours(String supportCours) {
		this.supportCours = supportCours;
	}

	public String getEvalFormateur() {
		return evalFormateur;
	}

	public void setEvalFormateur(String evalFormateur) {
		this.evalFormateur = evalFormateur;
	}

	public String getExtras() {
		return extras;
	}

	public void setExtras(String extras) {
		this.extras = extras;
	}

	public String getPedagogee() {
		return pedagogee;
	}

	public void setPedagogee(String pedagogee) {
		this.pedagogee = pedagogee;
	}

	@Override
	public String toString() {
		return "Evaluation [id=" + id + ", moyensPedagogique=" + moyensPedagogique + ", supportCours=" + supportCours
				+ ", evalFormateur=" + evalFormateur + ", extras=" + extras + ", pedagogee=" + pedagogee + "]";
	}
	
	
	
	/*
	 * public Formation getFormation() { return formation; }
	 * 
	 * public void setFormation(Formation formation) { this.formation = formation; }
	 */
	

	

}

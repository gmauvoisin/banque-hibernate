package fr.eni.formation.banque;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {

	private String nom = "";

	private String prenom = "";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // GenerationType.Identity
	private long idClient;

	public Client() {

	}

	public Client(String nom, String prenom) {
		super();
		setNom(nom);
		setPrenom(prenom);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public long getIdClient() {
		return idClient;
	}

	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}

	@Override
	public String toString() {
		return String.format("Client  = [nom= %s, prenom= %s]", getNom(), getPrenom());
	}

}

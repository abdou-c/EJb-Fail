package sn.metier.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

import sn.metier.entities.Village;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 50)
	private String nomComplet;
	
	@Column(nullable = false, length = 50)
	private String adresse;
	
	@Column(nullable = false, length = 50)
	private String numTelephone;
	
	@ManyToOne
	private Village village = new Village();
	
	public Village getVillage() {
		return village;
	}
	public void setVillage(Village village) {
		this.village = village;
	}
	public Client() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getNomComplet() {
		return this.nomComplet;
	}

	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}   
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}   
	public String getNumTelephone() {
		return this.numTelephone;
	}

	public void setNumTelephone(String numTelephone) {
		this.numTelephone = numTelephone;
	}
   
}

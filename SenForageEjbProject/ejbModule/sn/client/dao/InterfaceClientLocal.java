package sn.client.dao;

import java.util.List;

import javax.ejb.Local;

import sn.metier.entities.Client;
import sn.metier.entities.Village;

@Local
public interface InterfaceClientLocal {

	//methode pour ajouter client
	public int add(Client client);
	
	//methode lister CLient
	public List<Client> list();
	
	//methode lister Village
	public List<Village> listVillage();
	
	public Village getVillage(int id);

}

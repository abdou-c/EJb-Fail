package sn.client.dao;

import java.util.List;

import javax.ejb.Local;

import sn.metier.entities.Village;

@Local

public interface InterfaceVillageLocal {

	//methode pour ajouter village
	public int add(Village village);
	
	//methode lister village
	public List<Village> list();

	
	
}

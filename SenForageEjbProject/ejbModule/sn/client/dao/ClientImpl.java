package sn.client.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sn.metier.entities.Client;
import sn.metier.entities.Village;

import sn.client.dao.InterfaceClientLocal;

@Stateless
public abstract class ClientImpl implements InterfaceClientLocal{
	@PersistenceContext(unitName = "EJBSenForagePU")
	private EntityManager em;


	//add function
	@Override
	public int add(Client client) {	
		 try {
			em.getTransaction().begin();
			em.persist(client);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 1;
	}

	@Override
	public List<Client> list() {
		return em.createQuery("SELECT c FROM Client c").getResultList();
	}

	@Override
	public List<Village> listVillage() {

		return em.createQuery("SELECT c FROM Village c").getResultList();
	}
	
	@Override
	public Village getVillage(int id) {

		return em.find(Village.class, id);
	}

}

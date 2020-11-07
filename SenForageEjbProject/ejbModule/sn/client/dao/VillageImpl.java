package sn.client.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sn.metier.entities.Village;

@Stateless
public class VillageImpl implements InterfaceVillageLocal {
	
	@PersistenceContext(unitName = "EJBSenForagePU")
	private EntityManager em;

	@Override
	public int add(Village village) {
		try {
			em.getTransaction().begin();
			em.persist(village);
			em.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Village> list() {
		// TODO Auto-generated method stub
		return null;
	}
	

}

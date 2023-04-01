package dao;

import java.util.List;

import javax.persistence.*;

public class CatalogueDaoimp implements ICatalogueDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("UP_Prod");
	EntityManager em = emf.createEntityManager();
	public void addProduit(Produit p) {
		EntityTransaction t = em.getTransaction();
		try {
			t.begin();
			em.persist(p);
			t.commit();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			t.rollback();
		}
		
		
	}

	public List<Produit> listProduits() {
		Query q = em.createQuery("select P from Produit P");
		
		return q.getResultList();
	}

	
	public List<Produit> produitParMc(String mc) {
		Query q = em.createQuery("select P from Produit P where P.designation like :x");
		q.setParameter("x", "%"+mc+"%");
		return q.getResultList();
	}

	public Produit getProduit(Long idProduit) {
		Produit P= em.find(Produit.class, idProduit);
		return P;
	}

	public void updateProduit(Produit p) {
		EntityTransaction t = em.getTransaction();
		try {
			t.begin();
			em.merge(p);
			t.commit();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			t.rollback();
		}
		
		
		
	}
		
	

	public void deleteProduit(Long idP) {
		EntityTransaction t = em.getTransaction();

		
		try {
			t.begin();
			Produit P= em.find(Produit.class, idP);
			em.remove(P);
			t.commit();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			t.rollback();
		}
		
	}

}

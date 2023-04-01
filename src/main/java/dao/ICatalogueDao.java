package dao;

import java.util.*;

public interface ICatalogueDao {
	public void addProduit(Produit p);
	public List<Produit> listProduits();
	public List<Produit> produitParMc(String mc);
	public Produit getProduit(Long idProduit);
	public void updateProduit(Produit p);
	public void deleteProduit(Long idP);

}

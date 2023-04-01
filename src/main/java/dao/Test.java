package dao;

import java.util.ArrayList;
import java.util.*;

public class Test {
	public static void main(String [] args) {
		CatalogueDaoimp cdi = new CatalogueDaoimp();
		cdi.addProduit(new Produit("USB TOSHIBA", (double) 123, 10));
		cdi.addProduit(new Produit("USB SONY", (double) 134, 2));
		cdi.addProduit(new Produit("USB HP", (double) 120, 12));
		
		//affichage
		List<Produit> maListe = new ArrayList<Produit>();
		//maListe = cdi.listProduits();
		maListe = cdi.produitParMc("USB");
		for(Produit P:maListe) {
			System.out.println(P);
		}
		
		cdi.updateProduit(new Produit(2L,"USB SDD",30,20));
		cdi.deleteProduit(2L);
		System.out.println(cdi.getProduit(2L));
		
		
		
		
	}
}

package dao;

import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(name="Produits")
public class Produit implements Serializable{
	@Id 
	@Column(name="Id_Produit")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long reference;
	@Column(length=50)
	private String designation;
	private double prix;
	private int qte;
	public Produit(String designation, Double prix, int qte) {
		super();
		this.designation = designation;
		this.prix = prix;
		this.qte = qte;
	}
	
	
	
	
	
	
	
	public Produit(Long reference, String designation, double prix, int qte) {
		super();
		this.reference = reference;
		this.designation = designation;
		this.prix = prix;
		this.qte = qte;
	}







	public Produit() {
		super();
	}
	public Long getReference() {
		return reference;
	}
	public void setReference(Long reference) {
		this.reference = reference;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	@Override
	public String toString() {
		return "Produit [reference=" + reference + ", designation=" + designation + ", prix=" + prix + ", qte=" + qte
				+ "]";
	}
	
	
}

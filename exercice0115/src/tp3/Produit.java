package tp3;

public class Produit {
	private String nom;
	private int conditionnement;
	private int prix;
	
	@Override
	public String toString() {
		return "Produit [nom=" + nom + ", conditionnement=" + conditionnement
				+ ", prix=" + prix + "]";
	}
	
	public void affiche(){
		System.out.println(this);
	}


	
	
	static void main(String[] args) {
		Produit he1 = new Produit();
		he1.nom = "combawa BIO";
		he1.conditionnement = 5;
		he1.prix = 550;
		
		Produit he2 = new Produit();
		he2.nom = "lavande vraie";
		he2.conditionnement = 10;
		he2.prix = 450;
		
		he1.affiche();
		he2.affiche();
	}


}
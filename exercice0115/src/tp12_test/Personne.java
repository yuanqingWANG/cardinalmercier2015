package tp12_test;

public class Personne {
	
	private String nom;
	
	private String prenom;
	
	private Date datedeNaissance;
	
	public Personne(String nom, String prenom, int jour, int moi, int annee){
		
		this.nom = nom;
		
		this.prenom = prenom;
		
		datedeNaissance = new Date(jour,moi,annee);
		
	}
	
	public Date getdatedeNaissance(){
		return datedeNaissance;
	}
	
	public String toString(){
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", date=" + datedeNaissance.toString() + "]";
	}

}

package tp4;

public class Personne {
	private String nom;
	 
    private String prenom;
 
    private Date dateDeNaissance;
 
    

    public Personne(){
 
    }
 
    public Personne(String nom, String prenom, int jour, int mois, int annee){
 
       this.nom = nom;
 
       this.prenom = prenom;
 
       dateDeNaissance = new Date(jour,mois,annee);
 
    }
 
 
 
    public String toString() {
 
       return "Personne [nom=" + nom + ", prenom=" + prenom + 

              ", date="+ dateDeNaissance.toString()+"]";
 
    }
 
    public static void main(String[] args) {
 
       Personne p1 = new Personne("Vroman","Marie-Noël",30,12,1969);
 
       Personne p2 = new Personne("Toto","Dupont",1,3,1997);
 
       Personne p3 = new Personne();
 
       System.out.println(p1);
 
    }


}

package tp6_test;

public class Etudiant extends Personne {
	
	private int num;
	
	private static int nbEtu = 0;
	
	public Etudiant (String nom, String prenom, int j, int m, int a){
		
		super(nom,prenom,j,m,a);
		
		nbEtu++;
		
		num = nbEtu;
		
	}
	
	public String toString(){
		return "Etudiant [num = " + num + ", toString()=" + super.toString() + "]";
	}

}

package tp11;

import java.util.ArrayList;

public class Etudiant {
	private String nom;
	private int num;
	private static int nbEtu=0;
	
	public Etudiant(String nom){
		this.nom = nom;
		num = ++nbEtu;
	}
	
	public String toString(){
		return "nom : "+nom+" num : "+num;
	}
	
	public static void main(String[]args){
		ArrayList<Etudiant> listeEtu = new ArrayList<Etudiant>();
		listeEtu.add(new Etudiant("Toto"));
		listeEtu.add(new Etudiant("Toto1"));
		listeEtu.add(new Etudiant("Toto2"));
		listeEtu.add(new Etudiant("Toto3"));
		listeEtu.add(new Etudiant("Toto4"));
		System.out.println(listeEtu);
	
	}
}



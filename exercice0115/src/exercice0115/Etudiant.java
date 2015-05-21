package exercice0115;

import javax.swing.JOptionPane;

public class Etudiant {
	private String nom;
	private String prenom;
	private int nbExercicesTotal;
	private int nbExercicesReusis;
	

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public int getNbExercicesTotal() {
		return nbExercicesTotal;
	}


	public void setNbExercicesTotal(int nbExercicesTotal) {
		this.nbExercicesTotal = nbExercicesTotal;
	}


	public int getNbExercicesReusis() {
		return nbExercicesReusis;
	}


	public void setNbExercicesReusis(int nbExercicesReusis) {
		this.nbExercicesReusis = nbExercicesReusis;
	}


	public static void main(String[] args) {
		Etudiant et = new Etudiant();
		et.nom = JOptionPane.showInputDialog("Quel est ton nom?");
		et.prenom = JOptionPane.showInputDialog("Quel est ton prenom?");
		et.nbExercicesTotal = 0;
		et.nbExercicesReusis = 0;
		for (int i = 0; i < 10; i++){
			int a = (int)(Math.random()*100);
			int b = (int)(Math.random()*100);
			String reponseString = JOptionPane.showInputDialog(a+" + "+b);
			int reponseInt = Integer.parseInt(reponseString);
			if (reponseInt == a+b){
				et.nbExercicesReusis = et.nbExercicesReusis+1;
			}
			et.nbExercicesTotal = et.nbExercicesTotal+1;
		}
		JOptionPane.showMessageDialog(null, et.nom + ", tu as reussi "+et.nbExercicesReusis+"/"+et.nbExercicesTotal);
		

	}
}

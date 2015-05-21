package exercice0115;

import javax.swing.JOptionPane;

public class TestEtudient {

	public static void main(String[] args) {
		Etudiant et = new Etudiant();
		et.setNom (JOptionPane.showInputDialog("Quel est ton nom?"));
		et.setPrenom (JOptionPane.showInputDialog("Quel est ton prenom?"));
		et.setNbExercicesTotal (0);
		et.setNbExercicesReusis (0);
		for (int i = 0; i < 10; i++){
			int a = (int)(Math.random()*100);
			int b = (int)(Math.random()*100);
			String reponseString = JOptionPane.showInputDialog(a+" + "+b);
			int reponseInt = Integer.parseInt(reponseString);
			if (reponseInt == a+b){
				et.setNbExercicesReusis (et.getNbExercicesReusis()+1);
				JOptionPane.showMessageDialog(null, "Bravo");
			}
			else{
				JOptionPane.showMessageDialog(null, "Non, "+a+" + "+b+" = "+(a+b),"titre",0);
			}
			et.setNbExercicesTotal (et.getNbExercicesTotal()+1);
		}
		JOptionPane.showMessageDialog(null, et.getNom() + ", tu as reussi "+et.getNbExercicesReusis()+"/"+et.getNbExercicesTotal());

	}

}

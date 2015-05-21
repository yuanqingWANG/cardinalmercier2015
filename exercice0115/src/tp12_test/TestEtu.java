package tp12_test;

import java.util.Arrays;

public class TestEtu {

	public static void main(String[] args) {
		
		Personne p1 = new Personne("Nom1","Prenom1",23,04,1991);
		Personne p2 = new Personne("Nom2","Prenom2",22,04,1991);
		Personne p3 = new Personne("Nom3","Prenom3",23,04,1990);
		
		Date tabEtu[] = new Date[3];
		tabEtu[0] = p1.getdatedeNaissance();
		tabEtu[1] = p2.getdatedeNaissance();
		tabEtu[2] = p3.getdatedeNaissance();
		
		Arrays.sort(tabEtu);
		

	}

}

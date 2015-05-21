package tp7;

import java.util.Arrays;

public class Etudiant implements Comparable{
	
	private int num;
	public int compareTo(Object o){
		Etudiant autreEtu = (Etudiant) o;
		return this.num - autreEtu.num;
	}

}

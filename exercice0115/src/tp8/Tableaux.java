package tp8;

import tp7.Etudiant;

public class Tableaux {
	
	public static void main(String[] args){
		int tab[] = new int[5];
		try{
		System.out.println(tab[5]);
		}catch (ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		Etudiant tabEtu[] = new Etudiant[5];
		for (int i=0;i<5;i++){
			tabEtu[i]= new Etudiant();
		}
		System.out.println(tabEtu[5]);
	}

}

package tp4;

public class Etudiant extends Personne {
	private int num;
 
    

    private static int nbEtu = 0;
 
    

    public Etudiant(String nom, String prenom, int j, int m, int a){
 
       super(nom, prenom, j, m, a);
 
       nbEtu++;
 
       num = nbEtu;  

    }
 
 
 
    @Override
 
    public String toString() {
 
       return "Etudiant [num=" + num + ", toString()=" + super.toString()
 
              + "]";
 
    }
 
    public static void main(String args[]){
 
       Etudiant et1 = new Etudiant("V","MN",30,12,1969);
 
       System.out.println(et1);
 
    }

}

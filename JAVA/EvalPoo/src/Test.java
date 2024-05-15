import java.util.ArrayList;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Personne> personnes = new ArrayList<Personne>();
		Personne premierMembre = new Membre("Grand", "Marine",1, new Date(2024,05,15),"Premium");
		personnes.add(premierMembre);
		
		Personne premierEmploye = new Employe("Petit", "Thomas",1, "bibliothecaire",1000.00);
		personnes.add(premierEmploye);
		
		
		for (Personne personne:personnes) {
		personne.afficherDetails();
		}
		
		

	}

}

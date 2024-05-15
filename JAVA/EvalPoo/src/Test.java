import java.util.ArrayList;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Personne> personnes = new ArrayList<>();
		Membre premierMembre = new Membre("Grand", "Marine",1, new Date(2024,05,15),"Premium");
		personnes.add(premierMembre);
		
		Employe premierEmploye = new Employe("Petit", "Thomas",1, "bibliothecaire",1000.00);
		personnes.add(premierEmploye);
		
		
		for (Personne personne:personnes) {
			personne.afficherDetails();
		}
		
		
		Livre harryPotter = new Livre("Harry Potter 1", "Rowling", "AZ33Z", true);
		
		premierMembre.emprunter(harryPotter);
		
		harryPotter.afficherDetails();
		
		premierMembre.retourner(harryPotter);
		
		harryPotter.afficherDetails();

	}

}

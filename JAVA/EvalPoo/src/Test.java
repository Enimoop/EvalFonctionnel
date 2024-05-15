import java.util.ArrayList;
import java.util.Date;

public class Test {

	public static void main(String[] args) {

		ArrayList<Personne> personnes = new ArrayList<>();
		Membre premierMembre = new Membre("Grand", "Marine", 1, new Date(), "Premium");
		personnes.add(premierMembre);

		Employe premierEmploye = new Employe("Gros", "Leo", 2, "salarié", 800.00);
		personnes.add(premierEmploye);

		Bibliothecaire deuxiemeEmploye = new Bibliothecaire("Petit", "Thomas", 3, "bibliothecaire", 1000.00);
		personnes.add(deuxiemeEmploye);

		// affichage des personnes
		for (Personne personne : personnes) {
			personne.afficherDetails();
		}

		Livre harryPotter = new Livre("Harry Potter 1", "Rowling", "AZ33Z", true);
		Livre seigneurAnneaux = new Livre("Seigneur des Anneaux", "Tolkien", "HFEZM1", true);

		// emprunt de livre
		premierMembre.emprunter(harryPotter);

		premierMembre.emprunter(seigneurAnneaux);

		harryPotter.afficherDetails();

		// affiche les détails des livres de la liste
		premierMembre.afficherListe();

		// retour de livre
		if (premierMembre.retourner(harryPotter) == true) {
			premierMembre.notifierRetour(harryPotter);
			deuxiemeEmploye.notifierRetour(harryPotter);
		}

		premierMembre.afficherListe();

	}

}

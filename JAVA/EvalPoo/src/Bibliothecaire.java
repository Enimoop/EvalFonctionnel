
public class Bibliothecaire extends Employe implements Notifiable {

	public Bibliothecaire(String nom, String prenom, int id, String poste, double salaire) {
		super(nom, prenom, id, poste, salaire);

	}

	public void notifierRetour(Livre unLivre) {
		System.out.println("Chere biblioth�caire " + this.nom + " le livre " + unLivre.getTitre() + " a �t� rendu");
		System.out.println();
		unLivre.afficherDetails();
	}

}

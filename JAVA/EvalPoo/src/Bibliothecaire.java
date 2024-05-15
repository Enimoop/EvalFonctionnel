
public class Bibliothecaire extends Employe implements Notifiable {

	public Bibliothecaire(String nom, String prenom, int id, String poste, double salaire) {
		super(nom, prenom, id, poste, salaire);

	}

	public void notifierRetour(Livre unLivre) {
		System.out.println("Chere bibliothécaire " + this.nom + " le livre " + unLivre.getTitre() + " a été rendu");
		System.out.println();
		unLivre.afficherDetails();
	}

}

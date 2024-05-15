import java.util.ArrayList;
import java.util.Date;

public class Membre extends Personne implements Notifiable {

	private Date dateAdhesion;
	private String statut;

	public ArrayList<Livre> livres = new ArrayList<>();

	public Membre(String nom, String prenom, int id, Date dateAdhesion, String statut) {
		super(nom, prenom, id);
		this.dateAdhesion = dateAdhesion;
		this.statut = statut;
	}

	public void afficherDetails() {
		System.out.println("Détails du membre");
		System.out.println("nom : " + this.nom);
		System.out.println("prenom : " + this.prenom);
		System.out.println("id : " + this.id);
		System.out.println("date adhesion : " + this.dateAdhesion);
		System.out.println("statut : " + this.statut);
		System.out.println();
	}
	
	public void afficherListe() {
		System.out.println("La liste : ");
		for (Livre livre : livres) {
			System.out.println("===========");
			livre.afficherDetails();
		}
	}

	public void emprunter(Livre unLivre) {
		unLivre.emprunter();
		System.out.println(this.prenom + " " + this.nom + " Vous avez emprunté le livre " + unLivre.getTitre());
		livres.add(unLivre);
		System.out.println();
	}

	public void retourner(Livre unLivre) {
		unLivre.retourner();
		livres.remove(unLivre);
	}

	public void notifierRetour(Livre unLivre) {
		System.out.println(this.prenom + " " + this.nom + " Vous avez rendu le livre " + unLivre.getTitre());
		this.retourner(unLivre);
		System.out.println();
	}

	public Date getDateAdhesion() {
		return dateAdhesion;
	}

	public void setDateAdhesion(Date dateAdhesion) {
		this.dateAdhesion = dateAdhesion;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

}

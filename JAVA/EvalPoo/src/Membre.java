import java.util.ArrayList;
import java.util.Date;

public class Membre extends Personne{

	private Date dateAdhesion;
	private String statut;
	
	public ArrayList<Livre> livres = new ArrayList<>();
	
	public Membre(String nom, String prenom, int id, Date dateAdhesion, String statut) {
		super(nom, prenom, id);
		this.dateAdhesion = dateAdhesion;
		this.statut = statut;
	}


	public void afficherDetails() {
		System.out.println("nom : " + this.nom);
		System.out.println("prenom : " + this.prenom);
		System.out.println("id : " + this.id);
		System.out.println("date adhesion : " + this.dateAdhesion);
		System.out.println("statut : " + this.statut);
		System.out.println();
	}
	
	public void emprunter(Livre unLivre) {
		livres.add(unLivre);
		unLivre.emprunter();
	}
	
	public void retourner(Livre unLivre) {
		livres.remove(unLivre);
		unLivre.retourner();
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

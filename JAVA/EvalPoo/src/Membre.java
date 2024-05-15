import java.util.Date;

public class Membre extends Personne{

	public Date dateAdhesion;
	public String statut;
	
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

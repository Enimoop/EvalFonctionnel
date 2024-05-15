
public class Employe extends Personne {
	
	private String poste;
	private double salaire;
	
	public Employe(String nom, String prenom, int id, String poste, double salaire) {
		super(nom, prenom, id);
		this.poste = poste;
		this.salaire = salaire;
	}


	public void afficherDetails() {
		System.out.println("nom : " + this.nom);
		System.out.println("prenom : " + this.prenom);
		System.out.println("id : " + this.id);
		System.out.println("poste : " + this.poste);
		System.out.println("salaire : " + this.salaire);
		System.out.println();
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	
}

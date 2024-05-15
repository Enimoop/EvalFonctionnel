
abstract public class Personne {
	protected String nom;
	protected String prenom;
	protected int id;
	
	public Personne(String nom,String prenom, int id) {
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}
	
	abstract public void afficherDetails();
	
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}

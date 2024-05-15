
public class Livre implements Empruntable {
	public String titre;
	public String auteur;
	public String isbn;
	public boolean disponible;
	
	public Livre(String titre, String auteur, String isbn, boolean disponible) {
		this.titre = titre;
		this.auteur = auteur;
		this.isbn = isbn;
		this.disponible = disponible;
	}
	
	public void afficherDetails() {
		System.out.println("Titre : " + this.titre);
		System.out.println("Auteur : " + this.auteur);
		System.out.println("isbn : " + this.isbn);
		System.out.println("disponible : " + this.disponible);
	}

	public void emprunter() {
		this.disponible = false;
	}

	public void retourner() {
		this.disponible = true;
	}
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	
	
	
	
	
}

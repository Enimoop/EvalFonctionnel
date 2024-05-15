
public class Livre implements Empruntable {
	private String titre;
	private String auteur;
	private String isbn;
	private boolean disponible;
	
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
		System.out.println();
	}

	public void emprunter() {
		System.out.println("Vous avez emprunté le livre " + this.titre);
		this.disponible = false;
	}

	public void retourner() {
		System.out.println("Vous avez rendu le livre " + this.titre);
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

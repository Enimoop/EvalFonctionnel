
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
		System.out.println("D�tails du livre :");
		System.out.println("Titre : " + this.titre);
		System.out.println("Auteur : " + this.auteur);
		System.out.println("isbn : " + this.isbn);
		System.out.println("disponible : " + this.disponible);
		System.out.println();
	}

	public boolean emprunter() {
		if (this.disponible == false) {
		System.out.println("Le livre est d�j� emprunt�");
		return false;
		} else {
			this.disponible = false;
			return true;
		}
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

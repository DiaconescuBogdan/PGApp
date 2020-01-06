package PGApp;

public class CategorieProdus {
	private String numeCategorie;

	public CategorieProdus(String numeCategorie) {
		super();
		this.numeCategorie = numeCategorie;
	}

	public String getNumeCategorie() {
		return numeCategorie;
	}

	public void setNumeCategorie(String numeCategorie) {
		this.numeCategorie = numeCategorie;
	}

	@Override
	public String toString() {
		return "Categorie Produs: " + numeCategorie + "";
	}
}

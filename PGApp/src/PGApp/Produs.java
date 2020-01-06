package PGApp;

public class Produs {
	private int codProdus;
	private int pret;
	private String numeProdus;
	private int cantitate;
	private CategorieProdus categorieProdus;

	public Produs(int codProdus, int pret, String numeProdus, int cantitate, CategorieProdus categorieProdus) {
		super();
		this.codProdus = codProdus;
		this.pret = pret;
		this.numeProdus = numeProdus;
		this.cantitate = cantitate;
		this.categorieProdus = categorieProdus;
	}

	public int getCodProdus() {
		return codProdus;
	}

	public void setCodProdus(int codProdus) {
		this.codProdus = codProdus;
	}

	public int getPret() {
		return pret;
	}

	public void setPret(int pret) {
		this.pret = pret;
	}

	public String getNumeProdus() {
		return numeProdus;
	}

	public void setNumeProdus(String numeProdus) {
		this.numeProdus = numeProdus;
	}

	public int getCantitate() {
		return cantitate;
	}

	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}

	public CategorieProdus getCategorieProdus() {
		return categorieProdus;
	}

	public void setCategorieProdus(CategorieProdus categorieProdus) {
		this.categorieProdus = categorieProdus;
	}

	@Override
	public String toString() {
		return "Produs: " + codProdus + ", pret=" + pret + ", numeProdus=" + numeProdus + ", cantitate=" + cantitate
				+ ", categorieProdus=" + categorieProdus;
	}

}

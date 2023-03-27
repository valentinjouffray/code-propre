package ex2;

/** Représente un compte bancaire de type compte courante
 * @author DIGINAMIC
 */
public class CompteCourante {
	private double solde;
	private double decouvert;

	/**
	 * @param solde		Solde du compte
	 * @param decouvert	Découvert maximal du compte
	 */
	public CompteCourante(double solde, double decouvert) {
		this.solde = solde;
		this.decouvert = decouvert;
	}
	
	/** Ajoute un montant au solde
	 * @param montant Le montant à créditer
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Débite un montant au solde
	 * @param montant Le montant à retirer
	 */
	public void debiterMontant(double montant){
		if (this.solde - montant > decouvert){
			this.solde = solde - montant;
		}
	}
	
	public double getSolde() {
		return solde;
	}
	
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

}

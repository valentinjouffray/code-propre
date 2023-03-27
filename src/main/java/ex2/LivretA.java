package ex2;

/** Représente un compte bancaire de type livret A
 * @author DIGINAMIC
 */
public class LivretA extends CompteCourante {
	private double tauxRemuneration;
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * permet de calculer la rémunération du livret A
	 */
	public void appliquerRemunerationAnnuelle(){
		this.setSolde(getSolde() + getSolde() * getTauxRemuneration() / 100);
	}

	/**
	 * <p>Débiter un montant du livret A</p>
	 * <p>Le montant ne doit pas être inférieur à 0 si c'est un livret A</p>
	 * @param montant Le montant à retirer
	 */
	@Override
	public void debiterMontant(double montant) {
		if (this.getSolde() - montant > 0){
			this.setSolde(getSolde() - montant);
		}
	}

	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}

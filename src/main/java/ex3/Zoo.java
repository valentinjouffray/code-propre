package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private String nom;
	private List<Animal> animals = new ArrayList<>();

	public Zoo(String nom){
		this.nom = nom;
	}

	/**
	 * Ajoute un animal à la liste d'animaux
	 * @param animal Objet de type Animal
	 */
	public void addAnimal(Animal animal){
		animals.add(animal);
	}

	/**
	 * Affiche une liste entière des Animaux et de leurs attributs
	 */
	public void afficherListeAnimaux(){
		for (Animal animal : animals) {
			StringBuffer sb = new StringBuffer();
			System.out.println(sb.append(animal.getNom())
					.append(" ")
					.append(animal.getType())
					.append(" ")
					.append(animal.getComportement()));
		}
	}

	/**
	 * @return La taille de la liste d'animaux de type int
	 */
	public int taille() {
		return animals.size();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}

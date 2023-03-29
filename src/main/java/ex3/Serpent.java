package ex3;

public class Serpent extends Animal {
    public Serpent(String nom, String comportement) {
        super(nom);
        this.setType("SERPENT");
        this.setComportement(comportement);
    }
}

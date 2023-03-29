package ex3;

public class Mammifere extends Animal {
    public Mammifere(String nom, String comportement) {
        super(nom);
        this.setType("MAMMIFERE");
        this.setComportement(comportement);
    }
}

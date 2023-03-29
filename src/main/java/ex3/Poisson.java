package ex3;

public class Poisson extends Animal {
    public Poisson(String nom, String comportement) {
        super(nom);
        this.setType("POISSON");
        this.setComportement(comportement);
    }
}

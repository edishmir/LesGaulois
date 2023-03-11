package personnages;

public class Romain {
    private String nom;
    private int force;

    public Romain(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "<< " + texte + ">>");
    }

    private String prendreParole() {
        return "Le Romain " + nom + " : ";
    }

    public void recevoirCoup(int forceCoup) {
        assert force>0: "la force d'un Romain est positive";
        int force_avant = force;
        force -= forceCoup;
        if (force > 0) {
            parler("Aïe");
        } else {
            parler("J'abandonne...");
        }
        int force_apres = force;
        assert force_apres<force_avant: "la force d'un Romain a diminué";
    }

    public static void main(String[] args) {
        Romain minus = new Romain("Minus", -6);
        assert minus.force>0: "la force d'un Romain est toujours positive";
    }
}

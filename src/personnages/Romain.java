package personnages;

public class Romain {
    private String nom;
    private int force;
    private Equipement equipements[];
    private int nbEquipement=0;

    public Romain(String nom, int force) {
        this.nom = nom;
        this.force = force;
        this.equipements = new Equipement[2];
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

    public void sEquiper(Equipement equipement){
        switch (nbEquipement) {
            case 2:
                System.out.println("Le soldat " + nom + " est bien protégé !");
                break;
            case 1:
                if (equipements[nbEquipement-1]==equipement){
                    System.out.println("Le soldat " + nom + " possède déjà un " + equipement.getNom() + " !");
                } else {
                    extracted(equipement);
                }
                break;
            case 0:
                extracted(equipement);
        }
    }

    private void extracted(Equipement equipement) {
        System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement.getNom() + " .");
        equipements[nbEquipement] = equipement;
        nbEquipement += 1;
    }

    public static void main(String[] args) {
        //Romain cesar = new Romain("César", 8);
        //cesar.parler("Tu vas le regretter Astérix!");
        //cesar.recevoirCoup(7);
        Romain minus = new Romain("Minus", 6);
        //assert minus.force>0: "la force d'un Romain est toujours positive";
        Equipement casque = Equipement.CASQUE;
        Equipement bouclier = Equipement.BOUCLIER;
        //System.out.println(casque);
        //System.out.println(bouclier);
        minus.sEquiper(casque);
        minus.sEquiper(casque);
        minus.sEquiper(bouclier);
        minus.sEquiper(casque);
    }
}

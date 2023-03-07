package personnages;

public class Village {
    private String nom;
    private Chef chef;
    private Gaulois villageois[];
    private int nbVillageois = 0;


    public Village(String nom, int nbVillageoisMaximum) {
        this.nom = nom;
        this.villageois = new Gaulois [nbVillageoisMaximum];
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public String getNom() {
        return nom;
    }

    public void ajouterHabitant(Gaulois gaulois){
        villageois[nbVillageois] = gaulois;
        nbVillageois += 1;
    }

    public void trouverHabitant(int nbVillageois){
        System.out.println(villageois[nbVillageois]);
    }

    public void afficherVillageois(){
        System.out.println("Dans village du chef " + chef.getNom() + " vivent les légendaires gaulois :");
        for (int i=0; i<nbVillageois; i++){
            System.out.println("- " + villageois[i].getNom());
        }
    }

    public static void main(String[] args) {
        Village village = new Village("Village des irreductibles", 30);
        //Gaulois gaulois = village.trouverHabitant(30);  => On ne peut pas affecter void à un Gaulois
        Chef abraracourcix = new Chef("Abraracourcix", 6, village);
        village.setChef(abraracourcix);
        Gaulois asterix = new Gaulois("Astérix", 8);
        //Gaulois gaulois = village.trouverHabitant(1);  => On ne peut pas affecter void à un Gaulois
        //System.out.println(gaulois);  => On ne peut pas affecter void à un Gaulois
        Gaulois obelix = new Gaulois("Obélix", 25);
        village.ajouterHabitant(asterix);
        village.ajouterHabitant(obelix);
        village.afficherVillageois();
    }

}

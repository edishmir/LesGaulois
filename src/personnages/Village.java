package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois; 
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}
	
	public void trouverHabitant(int numVillageois) {
		System.out.println(villageois[numVillageois]);
	}
	
	public void afficherVillageois() {
		System.out.println("Dans village du chef " + chef.getNom() + " vivent les légendaires gaulois :");
		for (int i=0; i<nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des irréductibles", 30);
		// Gaulois gaulois = village.trouverHabitant(30); 
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: Type mismatch: cannot convert from void to Gaulois
		Chef abraracourcix = new Chef("Abraracourcix", 6, 0, village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterHabitant(asterix);
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: Type mismatch: cannot convert from void to Gaulois
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
}

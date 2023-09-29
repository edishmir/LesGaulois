package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert this.force > 0 : "la force d'un romain est toujours positive";
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert force > 0 : "la force d'un romain est positive";
		int forceAvant = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		int forceApres = force;
		assert forceApres < forceAvant : "la force d'un romain a diminué";
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;
		case 1:
			if (equipements[nbEquipement-1] == equipement) {
				System.out.println("Le soldat " + nom + " possède déjà un " + equipement.getNom() + " !");
			} else {
				extracted(equipement);
			}
			break;
		default: //case 0
			extracted(equipement);
		}
	}

	private void extracted(Equipement equipement) {
		equipements[nbEquipement] = equipement;
		System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement.getNom() + ".");
		nbEquipement ++;
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
//		minus.parler("Bonjour.");
//		minus.recevoirCoup(8);

//		System.out.println(Equipement.CASQUE);
//		System.out.println(Equipement.BOUCLIER);
		for (int i=0; i<2; i++) minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
}

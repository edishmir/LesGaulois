package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {
    public static void main(String[] args) {
        Druide panoramix = new Druide("Panoramix", 5, 10);
        panoramix.parler("Je vais aller préparer une petite potion...");
        panoramix.preparerPotion();
        Gaulois obelix = new Gaulois("Obélix", 50);
        panoramix.booster(obelix);
        obelix.parler("Par Bélénos, ce n'est pas juste !");
        Gaulois asterix = new Gaulois("Astérix", 6);
        asterix.boirePotion(6);
        asterix.parler("Bonjour");
        Romain minus = new Romain("Minus", 25);
        minus.parler("UN GAU... UN GAUGAU...");
        asterix.frapper(minus);
        asterix.frapper(minus);
        asterix.frapper(minus);
    }
}

import java.util.Random;

public class ConcreteRarityFactory implements RarityFactory {
    ConcreteRarityFactory() {};

    public int generateNum() {
        Random random = new Random();
        int rarity = random.nextInt(4);
        return rarity;
    }

    public String generateRarity(int rarity) {
        if(rarity == 0) return "Common";
		if(rarity == 1) return "Uncommon";
		if(rarity == 2) return "Rare";
		return "Epic"; 
    }
}

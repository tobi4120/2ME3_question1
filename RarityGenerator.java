import java.util.Random;

public class RarityGenerator {

    RarityGenerator() {};

    public String generateRarity(int rarity) {
        if(rarity == 0) return "Common";
		if(rarity == 1) return "Uncommon";
		if(rarity == 2) return "Rare";
		return "Epic"; 
    }
}

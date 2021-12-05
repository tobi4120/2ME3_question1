import java.util.Random;

public class BasicArmour extends Armour {
    public BasicArmour() {
        super();
        setGearSlot();
        setRarity();
    }

    public void setGearSlot() {
        GearGenerator my_generator = new GearGenerator();
        this.slot = my_generator.makeGear();
    }

    public String getGearSlot() {
        return this.slot;
    }

    public String getDescription() {
        return this.getRarityDescription() + " " + this.slot + ":\n";
    }

    public void setRarity() {
        Random random = new Random();
        this.rarity = random.nextInt(4);
    }

    public int getRarity() {
        return this.rarity;
    }

    public String getRarityDescription() {
		RarityGenerator rarity = new RarityGenerator();
        return rarity.generateRarity(this.rarity);
	}

    public int getModCount() {
        return 0;
    }
}

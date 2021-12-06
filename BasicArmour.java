import java.util.Random;

public class BasicArmour extends Armour {
    public BasicArmour() {
        super();
        setGearSlot();
        setRarity();
    }

    public void setGearSlot() {
        GearFactory my_generator = new ConcreteGearFactory();
        this.slot = my_generator.makeGear();
    }

    public String getGearSlot() {
        return this.slot;
    }

    public String getDescription() {
        return this.getRarityDescription() + " " + this.slot + ":\n";
    }

    public void setRarity() {
        RarityFactory rarity = new ConcreteRarityFactory();
        this.rarity = rarity.generateNum();
    }

    public int getRarity() {
        return this.rarity;
    }

    public String getRarityDescription() {
		RarityFactory rarity = new ConcreteRarityFactory();
        return rarity.generateRarity(this.rarity);
	}

    public int getModCount() {
        return 0;
    }
}

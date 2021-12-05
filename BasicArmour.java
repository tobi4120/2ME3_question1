import java.util.Random;

public class BasicArmour extends Armour {
    public BasicArmour() {
        super();
        setGearSlot();
        setRarity();
    }

    public void setGearSlot() {
        GearFactory my_factory = new GearFactory();
        this.slot = my_factory.makeGear();
    }

    public String getGearSlot() {
        return this.slot;
    }

    public String getDescription() {
        return getRarityDescription() + " " + this.slot + ":\n";
    }

    public void setRarity() {
        Random random = new Random();
        this.rarity = random.nextInt(4);
    }

    public int getRarity() {
        return this.rarity;
    }

    public int getModCount() {
        return 0;
    }
}

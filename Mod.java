public class Mod extends ArmourDecorator {

    public Mod(Armour newArmour) {
        super(newArmour);
    }

    public void setGearSlot() {};

    public String getGearSlot() {
        return newArmour.getGearSlot();
    }

    public String getDescription() {
        AttributeFactory myAttributeFactory = new AttributeFactory();
        String mod = myAttributeFactory.makeAttribute();

        if (newArmour.getModCount() < newArmour.getRarity()) {
            return newArmour.getDescription() + mod + "\n";
        }
        return newArmour.getDescription(); 
    }

    public void setRarity() {};

    public int getRarity() {
        return newArmour.getRarity();
    };

    public int getModCount() {
        return newArmour.getModCount() + 1;
    }
}

public abstract class ArmourDecorator extends Armour {
    protected Armour newArmour;

    ArmourDecorator(Armour newArmour) {
        super();
        this.newArmour = newArmour;
    }
}

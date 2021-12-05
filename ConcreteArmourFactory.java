public class ConcreteArmourFactory implements ArmourFactory {
    public Armour makeArmour(String armour_type) {

        if (armour_type == "basic") {
            Armour basic_armour = new BasicArmour();
            return basic_armour;
        } 
        return null;
    }
}
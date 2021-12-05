public class Q1_runner {
    public static void main(String args[]) {
        ArmourFactory my_armourFactory = new ConcreteArmourFactory(); 

        Armour my_armour = my_armourFactory.makeArmour("basic");
        my_armour = new Mod(my_armour);
        my_armour = new Mod(my_armour);
        my_armour = new Mod(my_armour); 
        
        System.out.println(my_armour.getDescription());
    }
}
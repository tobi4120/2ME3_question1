import java.util.Random;

public class AttributeFactory {
    public AttributeFactory() {};
    
    public String makeAttribute() {
        Random random = new Random(); 
        int r = random.nextInt(3);

		if(r == 0) return "Strength + 5"; 
		if(r == 1) return "Intelligence + 5"; 
		return "Dexterity + 5"; 
    }
}
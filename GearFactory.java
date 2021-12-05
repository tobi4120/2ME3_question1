import java.util.Random;

public class GearFactory {
    public GearFactory() {};
    
    public String makeGear() {
        Random random = new Random(); 
        int gearSlot = random.nextInt(4);

		if(gearSlot == 0) {
			return "Helm"; 
		}
		else if(gearSlot == 1) {
			return "Chest Piece";
		}
		else if(gearSlot == 2) {
			return "Gloves";
		}
		else if(gearSlot == 3) {
			return "Boots";
		}
        return null;
    }
}

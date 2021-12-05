public abstract class Armour {
    protected String slot;
    protected int rarity;

    public Armour() {};

    protected String getRarityDescription() {
		if(rarity == 0) return "Common";
		if(rarity == 1) return "Uncommon";
		if(rarity == 2) return "Rare";
		return "Epic"; 
	}

    public abstract void setGearSlot();
    public abstract String getDescription();
    public abstract void setRarity();
    public abstract int getRarity();
    public abstract int getModCount();
    public abstract String getGearSlot();
}
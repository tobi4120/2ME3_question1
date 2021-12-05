public abstract class Armour {
    protected String slot;
    protected int rarity;

    public Armour() {};

    public abstract String getRarityDescription();
    public abstract void setGearSlot();
    public abstract String getDescription();
    public abstract void setRarity();
    public abstract int getRarity();
    public abstract int getModCount();
    public abstract String getGearSlot();
}
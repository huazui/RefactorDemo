package gildedRose;

public abstract class SetQuality {
    public String name;

    public String getName() {
        return name;
    }
    public abstract int updateQuality(int quality, int sellIn);
    public abstract int updateSellIn(int sellInt);
}

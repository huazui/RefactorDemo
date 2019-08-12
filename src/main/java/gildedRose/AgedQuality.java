package gildedRose;

public class AgedQuality extends SetQuality {
    @Override
    public String getName(){
        return "Aged Brie";
    }

    public int updateQuality(int quality , int sellIn) {
        if (quality < 50) {
            quality = quality + 1;
        }
        sellIn = sellIn - 1;
        if (sellIn < 0 && quality < 50)
            quality = quality + 1;
        return quality;
    }
    public int updateSellIn(int sellIn){
        return sellIn - 1;
    }
}

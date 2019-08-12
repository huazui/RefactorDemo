package gildedRose;

public class OtherQuality extends SetQuality {

    public int updateQuality(int quality, int sellIn){
        if (quality > 0) {
            quality = quality - 1;
        }

        sellIn = sellIn - 1;

        if (quality > 0&&sellIn<0) {
            quality = quality - 1;
        }
        return quality;
    }
    public int updateSellIn(int sellIn){
        return sellIn-1;
    }
}

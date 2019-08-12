package gildedRose;

public class BackstageQuality extends SetQuality {
    @Override
    public String getName(){
        return "Backstage passes to a TAFKAL80ETC concert";
    }

    public int updateQuality(int quality , int sellIn){
        if (sellIn < 1) {
            quality = 0;
            return quality;
        }

        if (quality < 50) {
            if(sellIn < 6)
                quality += 3;
            else if (sellIn < 11)
                quality += 2;
            else quality++;
        }
        sellIn = sellIn - 1;
        return quality;
    }
    public int updateSellIn(int sellIn){
        return sellIn-1;
    }
}

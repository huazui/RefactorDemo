package gildedRose;

public class SulfurasQuality extends SetQuality {
    @Override
    public String getName(){
        return "Sulfuras, Hand of Ragnaros";
    }
   @Override
    public int updateQuality(int quality, int sellIn){
       return quality;
    }
}

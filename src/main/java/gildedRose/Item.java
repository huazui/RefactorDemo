package gildedRose;

public class Item {

    public String name;
    public int sellIn;
    public int quality;
    public SetQuality setQuality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void setSetQuality() {
        if (name == "Aged Brie") {
            setQuality = new AgedQuality();
            return;
        }

        if (name == "Backstage passes to a TAFKAL80ETC concert") {
            setQuality = new BackstageQuality();
            return;
        }

        if (name == "Sulfuras, Hand of Ragnaros") {
            setQuality = new SulfurasQuality();
            return;
        }
        setQuality = new OtherQuality();

    }

    public void myUpdateQuality(){
        this.setSetQuality();
         this.quality = setQuality.updateQuality(this.quality,this.sellIn);
         this.sellIn = setQuality.updateSellIn(this.sellIn);
    }






   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}

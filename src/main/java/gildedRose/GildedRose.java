package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateAged(Item item){

        if (item.quality < 50&&item.sellIn <0) {
            item.quality = item.quality + 2;
        }
        else if(item.quality <50)
            item.quality += 1;
    }
    public void updateBackstage(Item item){
        if(item.sellIn < 0) {
            item.quality = 0;
            return;
        }
        if(item.quality < 50){
            if(item.sellIn < 6){
                item.quality += 3;
            }
            else if(item.sellIn <11){
                item.quality += 2;
            }
            else item.quality += 1;
        }
        }



 public void updateItemQuality(Item item){
     if (!item.name.equals("Aged Brie")
             && !item.name.equals("Backstage passes to a TAFKAL80ETC concert"))   {
         if (item.quality > 0) {
             if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                 item.quality = item.quality - 1;
             }
         }
     }
     else {
         if (item.quality < 50) {
             item.quality = item.quality + 1;

             if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                 if (item.sellIn < 11) {
                     if (item.quality < 50) {
                         item.quality = item.quality + 1;
                     }
                 }

                 if (item.sellIn < 6) {
                     if (item.quality < 50) {
                         item.quality = item.quality + 1;
                     }
                 }
             }
         }
     }
     if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
         item.sellIn = item.sellIn - 1;
     }

     if (item.sellIn < 0) {
         if (!item.name.equals("Aged Brie")) {
             if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                 //D
                 if (item.quality > 0) {
                     if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                         item.quality = item.quality - 1;
                     }
                 }
             }

             else {
                 item.quality = item.quality - item.quality;
             }
         }

         else {
             if (item.quality < 50) {
                 item.quality = item.quality + 1;
             }
         }
     }

 }


    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {

            if(items[i].name == "Aged Brie") {
                updateAged(items[i]);
                break;
            }
            if (items[i].name == "Backstage passes to a TAFKAL80ETC concert")
            {
                updateBackstage(items[i]);
                break;
            }

            updateItemQuality(items[i]);


        }
    }
}
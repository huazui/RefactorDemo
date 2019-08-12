package MyTest;

import gildedRose.GildedRose;
import gildedRose.Item;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    @Test
    public void shouldGetOtherWhenNameItem1(){
        Item item1 = new Item("item1",5, 40);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(39,items[0].quality);

    }
    @Test
    public void shouldGetOtherWhenNameItem12(){
        Item item1 = new Item("item1",5, 70);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(69,items[0].quality);

    }
    @Test
    public void shouldGetOtherWhenNameItem13(){
        Item item1 = new Item("item1",15, 40);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(39,items[0].quality);

    }
    @Test
    public void shouldGetOtherWhenNameItem14(){
        Item item1 = new Item("item1",-3, 40);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(38,items[0].quality);

    }
    @Test
    public void shouldGetOtherWhenNameItem15(){
        Item item1 = new Item("item1",-10, 70);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(68,items[0].quality);

    }
    @Test
    public void testAged1(){
        Item item1 = new Item("Aged Brie",5, 70);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(70,items[0].quality);
    }
    @Test
    public void testAged2(){
        Item item1 = new Item("Aged Brie",5, 40);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(41,items[0].quality);
    }
    @Test
    public void testAged3(){
        Item item1 = new Item("Aged Brie",15, 70);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(70,items[0].quality);
    }
    @Test
    public void testAged4(){
        Item item1 = new Item("Aged Brie",-5, 30);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(32,items[0].quality);
    }
    @Test
    public void testAged5(){
        Item item1 = new Item("Aged Brie",-5, 60);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(60,items[0].quality);
    }

    @Test
    public void testBackstage1 (){
        Item item1 = new Item("Backstage passes to a TAFKAL80ETC concert",5, 40);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(43,items[0].quality);
    }
    @Test
    public void testBackstage2 (){
        Item item1 = new Item("Backstage passes to a TAFKAL80ETC concert",15, 70);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(70,items[0].quality);
    }
    @Test
    public void testBackstage3 (){
        Item item1 = new Item("Backstage passes to a TAFKAL80ETC concert",-5, 30);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(0,items[0].quality);
    }
    @Test
    public void testBackstage4 (){
        Item item1 = new Item("Backstage passes to a TAFKAL80ETC concert",-5, 60);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(0,items[0].quality);
    }
    @Test
    public void testSulfuras1 (){
        Item item1 = new Item("Sulfuras, Hand of Ragnaros",5, 40);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(40,items[0].quality);
    }
    @Test
    public void testSulfuras2 (){
        Item item1 = new Item("Sulfuras, Hand of Ragnaros",15, 70);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(70,items[0].quality);
    }
    @Test
    public void testSulfuras3 (){
        Item item1 = new Item("Sulfuras, Hand of Ragnaros",-5, 30);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(30,items[0].quality);
    }
    @Test
    public void testSulfuras4 (){
        Item item1 = new Item("Sulfuras, Hand of Ragnaros",-5, 60);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(60,items[0].quality);
    }

    @Test
    public void testSulfuras5 (){
        Item item1 = new Item("Sulfuras, Hand of Ragnaros",10, 70);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(70,items[0].quality);
    }
    @Test
    public void testSulfurasWhen0(){
        Item item1 = new Item("Sulfuras, Hand of Ragnaros",0, 70);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(70,items[0].quality);
    }
    @Test
    public void testAgedWhen0(){
        Item item1 = new Item("Aged Brie",0, 40);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(42,items[0].quality);
    }
    @Test
    public void testBackstageAWhen0(){
        Item item1 = new Item("Backstage passes to a TAFKAL80ETC concert",0, 40);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(0,items[0].quality);
    }
    @Test
    public void testOtherAWhen0(){
        Item item1 = new Item("Bt",0, 40);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(38,items[0].quality);
    }
}

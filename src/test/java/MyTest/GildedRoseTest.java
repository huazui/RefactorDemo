package MyTest;

import gildedRose.GildedRose;
import gildedRose.Item;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    @Test
    public void test1(){
        Item item1 = new Item("item1",5, 40);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(39,items[0].quality);

    }
    @Test
    public void test1_(){
        Item item1 = new Item("item1",5, 70);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(69,items[0].quality);

    }
    @Test
    public void test1_2(){
        Item item1 = new Item("item1",15, 40);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(39,items[0].quality);

    }
    @Test
    public void test1_3(){
        Item item1 = new Item("item1",-3, 40);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(38,items[0].quality);

    }
    @Test
    public void test2(){
        Item item1 = new Item("item1",-10, 70);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(68,items[0].quality);

    }
    @Test
    public void test3(){
        Item item1 = new Item("Aged Brie",5, 70);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(70,items[0].quality);
    }
    @Test
    public void test4(){
        Item item1 = new Item("Aged Brie",5, 40);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(41,items[0].quality);
    }
    @Test
    public void test5(){
        Item item1 = new Item("Aged Brie",15, 70);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(70,items[0].quality);
    }
    @Test
    public void test6(){
        Item item1 = new Item("Aged Brie",-5, 30);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(32,items[0].quality);
    }
    @Test
    public void test7(){
        Item item1 = new Item("Aged Brie",-5, 60);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(60,items[0].quality);
    }

    @Test
    public void test8(){
        Item item1 = new Item("Backstage passes to a TAFKAL80ETC concert",5, 40);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(43,items[0].quality);
    }
    @Test
    public void test9(){
        Item item1 = new Item("Backstage passes to a TAFKAL80ETC concert",15, 70);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(70,items[0].quality);
    }
    @Test
    public void test10(){
        Item item1 = new Item("Backstage passes to a TAFKAL80ETC concert",-5, 30);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(0,items[0].quality);
    }
    @Test
    public void test11(){
        Item item1 = new Item("Backstage passes to a TAFKAL80ETC concert",-5, 60);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(0,items[0].quality);
    }
    @Test
    public void test12(){
        Item item1 = new Item("Sulfuras, Hand of Ragnaros",5, 40);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(40,items[0].quality);
    }
    @Test
    public void test13(){
        Item item1 = new Item("Sulfuras, Hand of Ragnaros",15, 70);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(70,items[0].quality);
    }
    @Test
    public void test14(){
        Item item1 = new Item("Sulfuras, Hand of Ragnaros",-5, 30);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(30,items[0].quality);
    }
    @Test
    public void test15(){
        Item item1 = new Item("Sulfuras, Hand of Ragnaros",-5, 60);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(60,items[0].quality);
    }

    @Test
    public void test16(){
        Item item1 = new Item("Sulfuras, Hand of Ragnaros",10, 70);
        Item[] items = new Item[1];
        items[0]= item1;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(70,items[0].quality);
    }


}

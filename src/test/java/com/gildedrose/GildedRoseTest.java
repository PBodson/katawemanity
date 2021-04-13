package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void afterTenDayTest() {
        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                new Item("Conjured Mana Cake", 14, 19),
                new Item("Conjured Mana Cake", 14, 21),
                new Item("Conjured Mana Cake", 6, 60),
                new Item("Aged Brie", 2, 35),
                new Item("Backstage passes to a TAFKAL80ETC concert", 13, 20)};
        GildedRose app = new GildedRose(items);

        for (int i = 0; i < 10; i++) {
            app.updateQuality();
        }

        assertEquals(0, items[0].sellIn);
        assertEquals(10, items[0].quality);

        assertEquals(-8, items[1].sellIn);
        assertEquals(18, items[1].quality);

        assertEquals(-5, items[2].sellIn);
        assertEquals(0, items[2].quality);

        assertEquals(0, items[3].sellIn);
        assertEquals(80, items[3].quality);

        assertEquals(-1, items[4].sellIn);
        assertEquals(80, items[4].quality);

        assertEquals(5, items[5].sellIn);
        assertEquals(35, items[5].quality);

        assertEquals(0, items[6].sellIn);
        assertEquals(50, items[6].quality);

        assertEquals(-5, items[7].sellIn);
        assertEquals(0, items[7].quality);

        assertEquals(4, items[8].sellIn);
        assertEquals(0, items[8].quality);

        assertEquals(4, items[9].sellIn);
        assertEquals(1, items[9].quality);

        assertEquals(-4, items[10].sellIn);
        assertEquals(32, items[10].quality);

        assertEquals(-8, items[11].sellIn);
        assertEquals(50, items[11].quality);

        assertEquals(3, items[12].sellIn);
        assertEquals(39, items[12].quality);
    }
}

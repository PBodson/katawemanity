package com.gildedrose;

class GildedRose {
    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            //Sulfuras - no update
            if ("Sulfuras, Hand of Ragnaros".equals(item.name)) {
                continue;
            }

            //Update sellIn
            item.sellIn = item.sellIn - 1;

            //Aged Brie
            if ("Aged Brie".equals(item.name)) {

                //No update to maxed quality
                if (item.quality == 50) {
                    continue;
                }

                if (item.sellIn < 0 && item.quality != 49) {
                    item.quality = item.quality + 2;
                }

                else {
                    item.quality = item.quality + 1;
                }
            }

            //Backstage
            else if ("Backstage passes to a TAFKAL80ETC concert".equals(item.name)) {
                //Date is passed, quality is then 0
                if (item.sellIn < 0) {
                    item.quality = 0;
                    continue;
                }

                //No update to maxed quality
                if (item.quality == 50) {
                    continue;
                }

                //Update quality according to sellIn
                item.quality = item.quality + 1;

                if (item.sellIn < 10 && item.quality != 50) {
                    item.quality = item.quality + 1;
                }

                if (item.sellIn < 5 && item.quality != 50) {
                    item.quality = item.quality + 1;
                }
            }

            //Conjured
            else if ("Conjured Mana Cake".equals(item.name)) {
                if (item.quality > 0) {
                    item.quality = item.quality - 1;
                }

                if (item.quality > 0) {
                    item.quality = item.quality - 1;
                }

                if (item.quality > 0 && item.sellIn < 0) {
                    item.quality = item.quality - 1;
                }

                if (item.quality > 0 && item.sellIn < 0) {
                    item.quality = item.quality - 1;
                }

            }

            //Other items
            else {
                if (item.quality > 0) {
                    item.quality = item.quality - 1;
                }

                if (item.quality > 0 && item.sellIn < 0) {
                    item.quality = item.quality - 1;
                }
            }
        }
    }
}
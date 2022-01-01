package com.ayush;

import java.util.Map;

public class Main {
    private static final StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

//        for (String s : stockList.Items().keySet()) {
//            System.out.println(s);
//        }

        Basket basket = new Basket("Ayush");
        sellItem(basket, "car", 1);
        System.out.println(basket);

        sellItem(basket, "car", 1);

        if (sellItem(basket, "car", 1) != 1) {
            System.out.println("There are no more cars in the stock");
        }
        sellItem(basket, "spanner", 5);
        System.out.println(basket);

        sellItem(basket, "juice", 4);
        sellItem(basket, "cup", 12);
        sellItem(basket, "bread", 1);
        System.out.println(basket);

        System.out.println(stockList);

//        temp = new StockItem("pen",1.12);
//        stockList.Items().put(temp.getName(),temp);           unsupportedOperation Exception because trying to modify unmodifiable map

        stockList.Items().get("car").adjustStock(2000);
        stockList.get("car").adjustStock(-1000);        // we can modify item in collection though
        System.out.println(stockList);

        for (Map.Entry<String, Double> price : stockList.PriceList().entrySet()) {  // unmodifiable completely because every entry is unmodifiable
            System.out.println(price.getKey() + " costs " + price.getValue());
        }
    }

    public static int sellItem(Basket basket, String item, int quantitiy) {
        // retrieve the item from stock
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.sellStock(stockItem, quantitiy) != 0) {
            basket.addToBasket(stockItem, quantitiy);
            return quantitiy;
        }
        return 0;
    }


}

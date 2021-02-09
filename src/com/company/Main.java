package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of products");
        int no = sc.nextInt();
        String[] names = new String[no];
        int[] quantities = new int[no];
        float[] prices = new float[no];
        System.out.println("Enter product names:");
        for (int i=0; i<no; i++){
            names[i] = sc.next();
        }
        System.out.println("Enter the price of each product:");
        for (int i=0; i<no; i++){
            prices[i] = sc.nextFloat();
        }
        System.out.println("Enter the quantity of each product:");
        for (int i=0; i<no; i++){
            quantities[i] = sc.nextInt();
        }

        Shop shop = new Shop(names, quantities, prices);

        System.out.println("Enter the product price to be searched:");
        float price = sc.nextFloat();
        System.out.println("Enter the product quantity to be searched:");
        int quantity = sc.nextInt();

        System.out.println("Search based on price");
        String[] v = shop.search(price);
        for(int i=0; i<v.length; i++)
        System.out.println(v[i]);

        System.out.println("Search based on quantity");
        String[] z = shop.search(quantity);
        for(int i=0; i<z.length; i++)
        System.out.println(z[i]);

        System.out.println("Products below re-ordered level");
        String[] k = shop.search();
        for(int i=0; i<k.length; i++)
            System.out.println(k[i]);
    }
}

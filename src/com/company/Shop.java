package com.company;

import java.util.ArrayList;

public class Shop {
    private String[] productName;
    private int[] productQuantity;
    private float[] productPrice;

    public String[] search(int a){
        ArrayList<String> ans = new ArrayList<>();
        int j = -1;
        for (int i=0; i<productName.length; i++){
            if(productQuantity[i]==a){
                ans.add(productName[i]+":"+productPrice[i]);
            }
        }
        String[] an = new String[ans.size()];
        for(String b : ans)
            an[++j] = b;
        return an;
    }

    public String[] search(float b){
        ArrayList<String> ans = new ArrayList<>();
        int j = -1;
        for (int i=0; i<productName.length; i++){
            if(productPrice[i]==b){
                ans.add(productName[i]+":"+productQuantity[i]);
            }
        }
        String[] an = new String[ans.size()];
        for(String a : ans)
         an[++j] = a;
        return an;
    }

    public String[] search(){
        ArrayList<String> ans = new ArrayList<>();
        int j = -1;
        for(int i=0; i<productName.length; i++){
            if(productQuantity[i]<11){
                ans.add(productName[i]);
            }
        }
        String[] an = new String[ans.size()];
        for(String a : ans)
            an[++j] = a;
        return an;
    }

    public Shop(String[] productName, int[] productQuantity, float[] productPrice) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
    }
}

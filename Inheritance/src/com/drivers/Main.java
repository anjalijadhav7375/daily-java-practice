package com.drivers;

import com.mercedcz.Mercedcz600;
import maruti.Alto;

public class Main {
    public static void main(String[] args) {
        Alto alto = new Alto(1000,4,"white",false,0);
        System.out.println(alto);
        Mercedcz600 mercedcz600 = new Mercedcz600(2000,4,"Black",true,true);
        System.out.println(mercedcz600);
    }


}

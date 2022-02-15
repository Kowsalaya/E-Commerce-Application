package com.example.MyCloudyStoreApplication.global;

import com.example.MyCloudyStoreApplication.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {
    public static List<Product> cart;

    static {
        cart = new ArrayList<>();
    }

}
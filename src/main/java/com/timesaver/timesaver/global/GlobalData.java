package com.timesaver.timesaver.global;

import com.timesaver.timesaver.domain.Products;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {
    public static List<Products> cart;
    static {
        cart = new ArrayList<Products>();
    }
}

package com.timesaver.timesaver.global;

import com.timesaver.timesaver.domain.Trip;

import java.util.ArrayList;
import java.util.List;

public class GlobalTrips {
    public static List<Trip> cart;
    static {
        cart = new ArrayList<Trip>();
    }
}

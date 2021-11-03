package org.tyaa.demo.java.se.basics.functional.interfaces.impl;

import java.util.Comparator;

public class IntComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return b - a;
    }
}

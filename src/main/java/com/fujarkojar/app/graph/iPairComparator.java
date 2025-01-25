package com.fujarkojar.app.graph;

import java.util.Comparator;

public class iPairComparator implements Comparator<iPair> {

    // Overriding compare()method of Comparator
    @Override
    public int compare(iPair o1, iPair o2) {
        return o1.second - o2.second;
    }
}

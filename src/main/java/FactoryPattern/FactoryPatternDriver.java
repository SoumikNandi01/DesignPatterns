package FactoryPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactoryPatternDriver {
    public static void main (String args[]) throws Exception {
        List lst = new ArrayList(Arrays.asList("ally", "Soumik"));
        SortingAlgorithmFactory sortingAlgorithmFactory = new SortingAlgorithmFactory();
        //Sort Using Bubble Sort
        System.out.println(sortingAlgorithmFactory.getSortingAlgorithm(SortingAlgorithmType.BUBBLE).sort(lst).toString());
    }
}

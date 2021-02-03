package FactoryPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactoryPatternDriver {
    public static void main (String args[]) throws Exception {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(8, 6, 8, 1, 2));
        List<String> list2 = new ArrayList<>(Arrays.asList("Ally", "Soumik", "Kumar"));
        List<Double> list3 = new ArrayList<>(Arrays.asList(1.6,7.0,4.0,2.3));
        List<Character> list4 = new ArrayList<>(Arrays.asList('a','y','d','a','s','h'));
        //Producing Bubble Sort From Factory
        SortingAlgorithmFactory sortingAlgorithmFactory = new SortingAlgorithmFactory();

        //Sort Using Bubble Sort
        SortingAlgorithm bubbleSort = sortingAlgorithmFactory.getSortingAlgorithm(SortingAlgorithmType.BUBBLE);
        System.out.println(bubbleSort.sort(list1).toString());
        System.out.println(bubbleSort.sort(list2).toString());
        System.out.println(bubbleSort.sort(list3).toString());
        System.out.println(bubbleSort.sort(list4).toString());
    }
}

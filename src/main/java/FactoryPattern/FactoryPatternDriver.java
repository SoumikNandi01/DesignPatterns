package FactoryPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactoryPatternDriver {
    public static void main (String args[]){
        List lst = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        SortingAlgorithmFactory sortingAlgorithmFactory = new SortingAlgorithmFactory();
        //Sort Using Quick Sort
        System.out.println(sortingAlgorithmFactory.getSortingAlgorithm(SortingAlgorithmType.BUBBLE).sort(lst).toString());

        //Sort Using Merge Sort
        System.out.println(sortingAlgorithmFactory.getSortingAlgorithm(SortingAlgorithmType.MERGE).sort(lst).toString());

        //Sort Using Bubble Sort
        System.out.println(sortingAlgorithmFactory.getSortingAlgorithm(SortingAlgorithmType.QUICK).sort(lst).toString());
    }
}

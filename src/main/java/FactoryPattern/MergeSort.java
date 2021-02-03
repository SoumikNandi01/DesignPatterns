package FactoryPattern;

import java.util.List;

public class MergeSort implements SortingAlgorithm {
    @Override
    public void describe() {
        System.out.println("Applying MergeSort");
    }

    @Override
    public <T> List sort(List<T> lst) {
        //TODO : Write MergeSort Algorithm
        return lst;
    }
}

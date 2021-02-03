package FactoryPattern;

public class SortingAlgorithmFactory {
    public SortingAlgorithm getSortingAlgorithm(SortingAlgorithmType sortingAlgorithmType){
        return switch (sortingAlgorithmType){
            case BUBBLE -> new BubbleSort();
            case QUICK -> new QuickSort();
            case MERGE -> new MergeSort();
        };
    }
}

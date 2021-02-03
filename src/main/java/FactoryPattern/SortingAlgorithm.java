package FactoryPattern;

import java.util.List;

public interface SortingAlgorithm {
    void describe();
    <T> List sort(List<T> lst) throws Exception;


}

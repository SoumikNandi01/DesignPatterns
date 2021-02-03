package FactoryPattern;
import java.util.List;

public class BubbleSort implements SortingAlgorithm {
    @Override
    public void describe() {
        System.out.println("Applying BubbleSort");
    }

    @Override
    public <T> List sort(List<T> last) throws Exception{
        //TODO : Write BubbleSort Algorithm
        int n = last.size();
        if(n == 0)
            return last;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-i-1; j++){
                if((Utils.compare(last.get(j),last.get(j+1)) > 0)){
                    Utils.swap(last, j, j+1);
                }
            }
        }
        return last;
    }



}

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
        boolean number = false;
        boolean string = false;
        if(n == 0)
            return last;
        if (!(last.get(0) instanceof String) && !(last.get(0) instanceof Number)){
            throw new Exception("Invalid Type Comparison");
        }
        if (last.get(0) instanceof String)
            string = true;
        if (last.get(0) instanceof Number)
            number = true;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-i-1; j++){
                if (number){
                    Number a = (Number) last.get(j);
                    Number b = (Number) last.get(j+1);
                    T temp = null;
                    if(a.doubleValue() > b.doubleValue()){
                        temp = last.get(j);
                        last.set(j, last.get(j+1));
                        last.set(j+1, temp);
                    }
                }
                if (string){
                    String a = (String) last.get(j);
                    String b = (String) last.get(j+1);
                    T temp = null;
                    if (a.compareTo(b) > 0){
                        temp = last.get(j);
                        last.set(j, last.get(j+1));
                        last.set(j+1, temp);
                    }
                }
            }
        }
        return last;
    }



}

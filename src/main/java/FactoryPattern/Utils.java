package FactoryPattern;

import java.util.List;

public class Utils {
    public static int compare(Object u, Object v) throws Exception {
        if (u instanceof String) {
            return ((String) u).compareTo((String) v);
        }
        else if (u instanceof Character) {
            return ((Character) u).compareTo((Character) v);
        }
        else if (u instanceof Number) {
            if (((Number) u).doubleValue() > ((Number) v).doubleValue())
                return -1;
        }
        else {
            throw new Exception("Invalid DataTypes For Comparison");
        }
        return -2;
    }

    public static void swap(List list, int u, int v){
        Object temp = list.get(u);
        list.set(u,list.get(v));
        list.set(v,temp);
    }
}

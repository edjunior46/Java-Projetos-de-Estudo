package services;

import java.util.List;

public class CalculationService {
    
    public static <T extends Comparable<T>> T max(List<T> list) {
        T higher = list.get(0);

        for (T item : list) {
            if (item.compareTo(higher) > 0) {
                higher = item;
            }
        }

        return higher;
    }

}

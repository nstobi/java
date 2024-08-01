package cw;

import java.util.ArrayList;

public class SortUtil {
    public static void insertionSort(ArrayList<Product> products) {
        for (int i = 1; i < products.size(); i++) {
            Product key = products.get(i);
            int j = i - 1;
            while (j >= 0 && products.get(j).getName().compareTo(key.getName()) > 0) {
                products.set(j + 1, products.get(j));
                j = j - 1;
            }
            products.set(j + 1, key);
        }
    }
}

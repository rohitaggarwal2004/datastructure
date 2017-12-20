/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roaggarw
 */
public class InsertionSort<T> implements Sort<Comparable> {

    private final List<Comparable> list = new ArrayList<>();

    public void add(Comparable comparable) {
        list.add(comparable);
    }

    @Override
    public void sort() {
        for (int i = 0; i < list.size(); i++) {
            int hole = i;
            Comparable v = list.get(i);
            while (hole > 0 && (list.get(hole - 1).compareTo(v)) > 0) {
                list.set(hole, list.get(hole - 1));
                hole--;
            }
            list.set(hole, v);

        }
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.add(4);
        insertionSort.add(2);
        insertionSort.add(3);

        insertionSort.add(1);
        System.out.println(insertionSort.list);
        insertionSort.sort();
        System.out.println(insertionSort.list);

    }
}

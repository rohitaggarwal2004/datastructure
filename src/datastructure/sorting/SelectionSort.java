/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roaggarw
 * find min at each iteration, and put at first place at end of each iteration.
 */
public class SelectionSort<T> implements Sort<Comparable> {

    private final List<Comparable> list = new ArrayList<>();

    public void add(Comparable comparable) {
        list.add(comparable);
    }

    @Override
    public void sort() {
        for (int i = 0; i < list.size(); i++) {
            int swapped = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(swapped).compareTo(list.get(j)) > 0) {
                    swapped = j;
                }
            }
            swap(i,swapped);
        }

    }

    private void swap(int i1, int i2) {
        System.out.println(i1 + " ," + i2);
        Comparable c1 = list.get(i1);
        list.set(i1, list.get(i2));
        list.set(i2, c1);
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.add(4);
        selectionSort.add(3);
        selectionSort.add(2);
        selectionSort.add(1);
        System.out.println(selectionSort.list);
        selectionSort.sort();
        System.out.println(selectionSort.list);

    }
}

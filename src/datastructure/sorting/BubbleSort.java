/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.sorting;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort implements Sort<Comparable> {

    private final List<Comparable> list = new ArrayList<>();

    public void add(Comparable comparable) {
        list.add(comparable);
    }

    @Override
    public void sort() {
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    swap(j, j + 1);
                    System.out.println(i + ", sorted= " + list);
                }
            }
        }
    }

    private void swap(int i1, int i2) {
        Comparable c1 = list.get(i1);
        list.set(i1, list.get(i2));
        list.set(i2, c1);
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.add(1);
        bubbleSort.add(2);
        bubbleSort.add(3);
        bubbleSort.add(4);
        System.out.println(bubbleSort.list);
        bubbleSort.sort();
        System.out.println(bubbleSort.list);

    }
}

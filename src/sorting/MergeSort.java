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
public class MergeSort<T> implements Sort<Comparable> {

    private final List<Comparable> list = new ArrayList<>();

    public void add(Comparable comparable) {
        list.add(comparable);
    }

    @Override
    public void sort() {
        mergeSort(list, "");
    }

    private void mergeSort(List<Comparable> newList, String pos) {
        if (newList.size() > 1) {
            int mid = newList.size() / 2;
            List<Comparable> left = new ArrayList<>(newList.subList(0, mid));
            List<Comparable> right = new ArrayList<>(newList.subList(mid, newList.size()));
            mergeSort(left, "left");
            mergeSort(right, "right");
            merge(newList, left, right);
        }
    }

    private void merge(List<Comparable> newList, List<Comparable> left, List<Comparable> right) {
        int li = 0;
        int ri = 0;
        int i = 0;
        while (li < left.size() && ri < right.size()) {
            int value = left.get(li).compareTo(right.get(ri));
            if (value <= 0) {
                newList.set(i, left.get(li));
                li++;
            } else {
                newList.set(i, right.get(ri));
                ri++;
            }
            i++;
        }
        while (li < left.size()) {
            newList.set(i, left.get(li));
            li++;
            i++;
        }
        while (ri < right.size()) {
            newList.set(i, right.get(ri));
            ri++;
            i++;
        }
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        mergeSort.add(4);
        mergeSort.add(2);
        mergeSort.add(3);
        mergeSort.add(1);
        System.out.println(mergeSort.list);
        mergeSort.sort();
        System.out.println(mergeSort.list);

    }
}

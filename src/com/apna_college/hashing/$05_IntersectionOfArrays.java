package com.apna_college.hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created By Mohammad Shakir - 26/02/2023
 */
public class $05_IntersectionOfArrays {


  public static void getIntersectionWithSet(int[] a1, int[] a2) {
    Set<Integer> set = new HashSet<>();
    List<Integer> list = new ArrayList<>();
    for (int e : a1) {
      set.add(e);
    }

    for (int e : a2) {
      if (set.contains(e)) {
        list.add(e);
        set.remove(e);
      }
    }
    System.out.println(list);
  }

  // without using set by sorting array O(NlogN) to sort array if array is not sorted
  public static void getIntersection(int[] a1, int[] a2) {

    int i = 0;
    int j = 0;
    List<Integer> list = new ArrayList<>();
    while (i < a1.length && j < a2.length) {

      if (a1[i] == a2[j]) {
        list.add(a1[i]);
        i++;
        j++;
      } else if (a1[i] < a2[j]) {
        i++;
      } else if (a1[i] > a2[j]) {
        j++;
      }
    }
    System.out.println(list);
  }

  public static void main(String[] args) {
    int a1[] = {0, 2, 3, 4, 5};
    int a2[] = {2, 2, 3, 3, 4, 4, 5, 5};
    getIntersection(a1, a2);
    getIntersectionWithSet(a1, a2);
  }
}

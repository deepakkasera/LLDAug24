package org.example.Collections;

import com.sun.source.tree.Tree;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new LinkedList<>();
        List<Integer> l3 = new Vector<>();
        List<Integer> l4 = new Stack<>();


        Queue<Integer> q1 = new PriorityQueue<>();

        q1.add(10);
        q1.add(5);
        q1.add(1);
        q1.add(20);
        q1.add(15);
        q1.add(7);

        //System.out.println(q1);

        // Unique elements. Using HashTable internally to implement HashSet.
        // Doesn't guarantee the order of elements
        Set<Integer> set1 = new HashSet<>();

        // Balanced BST (Self Balancing - Red Black Tree / AVL Tree)
        // O(logN)
        // Stores the data in [naturally] sorted format.
        Set<Integer> set2 = new TreeSet<>();

        // Maintains the order same as insertion order.
        // HashMap + DLL
        Set<Integer> set3 = new LinkedHashSet<>();

        set1.add(5);
        set1.add(1);
        set1.add(10);
        set1.add(2);
        set1.add(7);
        set1.add(20);

        System.out.println(set1);

        set2.add(5);
        set2.add(1);
        set2.add(10);
        set2.add(2);
        set2.add(7);
        set2.add(20);

        System.out.println(set2);

        set3.add(5);
        set3.add(1);
        set3.add(10);
        set3.add(2);
        set3.add(7);
        set3.add(20);

        System.out.println(set3);

        Map<String, Integer> map1 = new HashMap<>();  // HashSet
        Map<String, Integer> map3 = new LinkedHashMap<>(); // LinkedHashSet
        Map<String, Integer> map4 = new TreeMap<>(); // TreeSet
    }
}

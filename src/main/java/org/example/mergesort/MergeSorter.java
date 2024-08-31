package org.example.mergesort;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    private List<Integer> listToSort;
    private ExecutorService executorService;

    MergeSorter(List<Integer> listToSort, ExecutorService executorService) {
        this.listToSort = listToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        //Merge Sort Algorithm.
        if (listToSort.size() <= 1) {
            return listToSort;
        }

        int mid = listToSort.size() / 2;
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();

        for (int i = 0; i < mid; i++) {
            leftList.add(listToSort.get(i));
        }

        for (int i = mid; i < listToSort.size(); i++) {
            rightList.add(listToSort.get(i));
        }

        //We need to sort both leftList and rightList separately in different threads.
        //1. Task to sort leftList.
        MergeSorter leftMergeSorter = new MergeSorter(leftList, executorService);

        //2. Task to sort rightList.
        MergeSorter rightMergeSorter = new MergeSorter(rightList, executorService);

        //Create Executor Service
//        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<List<Integer>> sortedLeftListFuture = executorService.submit(leftMergeSorter);
        Future<List<Integer>> sortedRightListFuture = executorService.submit(rightMergeSorter);

        //Merge Left and Right sorted parts.
        List<Integer> sortedList = new ArrayList<>();

        int i = 0;
        int j = 0;

        List<Integer> sortedLeftList = sortedLeftListFuture.get(); // Might be a blocking call.
        List<Integer> sortedRightList = sortedRightListFuture.get(); // Might be a blocking call.

        while (i < sortedLeftList.size() && j < sortedRightList.size()) {
            if (sortedLeftList.get(i) <= sortedRightList.get(j)) {
                sortedList.add(sortedLeftList.get(i));
                i++;
            } else {
                sortedList.add(sortedRightList.get(j));
                j++;
            }
        }

        while (i < sortedLeftList.size()) {
            sortedList.add(sortedLeftList.get(i));
            i++;
        }

        while (j < sortedRightList.size()) {
            sortedList.add(sortedRightList.get(j));
            j++;
        }

        return sortedList;
    }
}

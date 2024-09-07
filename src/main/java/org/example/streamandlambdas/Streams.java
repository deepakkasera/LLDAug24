package org.example.streamandlambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 5, 2, 9, 7, 10, 8, 6, 4, 3);

//        List<Integer> oddNumbers = new ArrayList<>();
//        //Filter
//        for (Integer number : numbers) {
//            if (number % 2 == 1) oddNumbers.add(number);
//        }

        //Streams
        Stream<Integer> stream = numbers.stream();
        List<Integer> oddNumbers = stream.filter((x) -> x%2 == 1).toList(); // Intermediate method.
//        System.out.println(oddNumbers);

        Stream<Integer> stream1 = numbers.stream();
        List<Integer> output =
                stream1
                        .filter((x) -> x%2==1)
                        .map((x) -> x*x)
                        .toList();

//        System.out.println(output);

        Optional<Integer> optionalI =
                numbers.stream()
                        .filter((x) -> {
                            System.out.println("Filtering: " + x);
                            return x%2 == 1;
                        })
                        .map((x) -> {
                            System.out.println("Mapping: " + x);
                            return x*x;
                        })
                        .findFirst();

        if (optionalI.isPresent()) {
            System.out.println(optionalI.get());
        }
//        System.out.println(output1);


    }
}

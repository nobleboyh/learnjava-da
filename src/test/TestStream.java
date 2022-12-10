package test;

import java.util.*;
import java.util.stream.*;

public class TestStream {
    public static void main(String[] args) {
        //Primitive Stream
        //Can be used with any primitive type
        List<Integer> integerList = Stream.of(new Integer[]{1, 2, 3, 4}).filter(value->value % 2 == 0).collect(Collectors.toList());
        printList(integerList);
        LongStream.range(1, 2).filter(a -> a > 50).forEach(System.out::println);

        //Can convert from data structure to others
        Set<String> languages =  Stream.of("Java", "C#", "C++", "PHP", "Javascript").collect(Collectors.toSet());

        //Intermediate operations: return new stream
        //filter(), map(), sort(), skip(), limit()
        System.out.println("Test sort");
        Arrays.asList(1,2,3,4,5).parallelStream().sorted((a,b)-> b-a).forEachOrdered(System.out::println);

        //Terminal Operations: end the stream
        //forEach(), collect(), count(), anyMatch(), noneMatch(), allMatch(), min(), max(), summaryStatistics(), reduce()


    }


    public static <T> void printList(Collection<T> tCollection) {
        tCollection.forEach(System.out::println);
    }
}

package org.sbp.qa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyList {

    public MyList()
    {
    }

//    public void demo1()
//    {
//        List<Integer> integerList = new ArrayList<>();
//        List<Number> numberList = integerList;
//    }

    /*
    public void demo2()
    {
        List<Integer> integerList = new ArrayList<>();
        Collection<Integer> integercCollection = integerList;
    }
*/

    /*
    public <T> T[] demo3(T element, int count) {
//        T[] arr = new T[count];
        T[] arr = new Integer[count];
        for (int i = 0; i < count; ++i) {
            arr[i] = element;
        }
        return arr;
    }
*/

    /*
    public void  demo4() {

        List<Integer> list = Arrays.asList(5, 3, 2, 1, 4);
        list.stream()
                .forEach(System.out::print)
                .sorted()
                .forEach(System.out::print);

    }
*/

    public void demo5(){

        List<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));

        Stream<String> fruitsStream = fruits.stream().map(String::toUpperCase);

        fruits.add("mango");
        System.out.println(fruitsStream.collect(Collectors.joining(",")));


    }

    /*
    The map operation is a lazy operation that returns a new stream and does not run until the
    stream is terminated by a terminal operation (such as foreach or collect).
    Since this stream doesn't have a terminal operation, the code passed into the map never runs.
     */





}

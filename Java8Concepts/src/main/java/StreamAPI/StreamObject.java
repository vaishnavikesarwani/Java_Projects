package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //Stream API - collection process
        //collection / group of object

        //1 - blank
        System.out.println("Empty Stream");
        Stream<Object> emptyStream=Stream.empty();
        emptyStream.forEach(e->{
            System.out.println(e);
        });
        System.out.println("\n");
        //2-array,object,collection
        String name[]={"Durgesh","Uttam","Ankit"};
        Stream<String> stream1=Stream.of(name);
        stream1.forEach(e->{
            System.out.print(e+" ");
        });
        System.out.println("\n");
        //3 by using builder pattern
        Stream<Object> streamBuilder=Stream.builder().build();

        //4
        IntStream stream= Arrays.stream(new int[]{2,4,6,5,8});
        stream.forEach(e->{
            System.out.print(e+" ");
        });

        System.out.println("\n");

        //5. List,Set
        List<Integer> list=Arrays.asList(10,20,30,40);
        list.stream().forEach(e->{
            System.out.print(e+" ");
        });
    }
}

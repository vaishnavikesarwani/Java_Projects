package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamOperations {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Aman","Ankit","Durgesh","Amit");

        //map(function)
        /*
            each element operation
         */
        System.out.println(list.stream().map(e->e.length()).sorted().collect(Collectors.toUnmodifiableList()));
        list.stream().forEach(System.out::print);
        System.out.println("\n");
        //filer(Predicate)
            //boolean value function
            //e->{ e>10}
        System.out.println(list.stream().filter(e->e.startsWith("A")).sorted().collect(Collectors.toUnmodifiableList()));


        List<Integer> sqr=Arrays.asList(10,20,30,40,50);
        System.out.println(sqr.stream().map(i->i*i).collect(Collectors.toList()));
        int num=sqr.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(num);
    }
}

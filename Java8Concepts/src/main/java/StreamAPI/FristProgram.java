package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FristProgram {
    public static void main(String[] args) {
        //create a list and filter all the even number from the list
        List<Integer> list= Arrays.asList(10,20,35,45,40,50);
       // Stream<Integer> stream=list.stream();
        List<Integer> res1=list.stream().filter(i->i%2==0).collect(Collectors.toUnmodifiableList());
        System.out.println(res1);
        list.stream().filter(i->i>50).collect(Collectors.toUnmodifiableList()).forEach(System.out::println);
        //System.out.println(res2);



    }
}

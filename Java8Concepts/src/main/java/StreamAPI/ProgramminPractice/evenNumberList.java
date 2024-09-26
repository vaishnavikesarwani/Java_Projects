package StreamAPI.ProgramminPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class evenNumberList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,15,8,49,25,98,32);
        Stream<Integer> stream=list.stream();
        List<Integer> res=stream.filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(res);
       //stream.filter(e->e%2==0).forEach(System.out::println);
    }
}

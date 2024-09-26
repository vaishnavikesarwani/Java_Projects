package StreamAPI.ProgramminPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class duplicateElements {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,15,8,98,15,98,32);
        HashSet<Integer> set=new HashSet<>();
        //print duplicate elements
        List<Integer> res=list.stream().filter(e->!set.add(e)).collect(Collectors.toUnmodifiableList());
        System.out.println(res);
        //remove duplicate numbers from list
        list.stream().distinct().forEach(System.out::println);
        System.out.println("\n");
        //print unique elements
        Set<Integer> setRes=new HashSet<>(list);
        set.stream().forEach(System.out::println);

    }
}

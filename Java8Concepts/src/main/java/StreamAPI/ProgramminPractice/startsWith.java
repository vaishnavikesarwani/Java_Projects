package StreamAPI.ProgramminPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class startsWith {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,15,8,49,25,98,32);
        List<String> res=list.stream().
                                map(s->s+" ").filter(s->s.startsWith("1"))
                .collect(Collectors.toUnmodifiableList());
        System.out.println(res);

    }
}

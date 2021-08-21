import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class streamAPI1 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println("stream() : ");
        list.stream().forEach(System.out::println);
        System.out.println();

        // distinct()
        System.out.println("stream()_distinct() : ");
        list.stream().distinct().forEach(System.out::println);

        // limit()
        System.out.println("stream()_limit() : ");
        list.stream().limit(4).forEach(System.out::println);

        // filter skip
        System.out.println("stream()_skip() : ");
        list.stream().skip(4).forEach(System.out::println);

        // map()
        System.out.println("stream()_map() : ");
        list.stream().map(i->i*i).forEach(System.out::println);
        System.out.println();

        // string operations
        System.out.println("string_operations : ");
        List<String> stringList = Arrays.asList("Hello","Stream","Learning");
        stringList.stream().map(str->str.length()).forEach(System.out::println);
        System.out.println();

        // reduce()
        System.out.println("stream()_reduce() : ");
        List<Integer> array = Arrays.asList(-2,0,4,6,8);
        Optional<Integer> sum = array.stream().reduce((element1,element2)->element1+element2);
        System.out.println(sum);
        if(sum.isPresent()){
            System.out.println("The sum of all elements : " + sum.get());
        }
    }
}

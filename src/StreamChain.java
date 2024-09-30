import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamChain {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(8, 7, 3, 10, 15, 5, 3);

        Stream<Integer> integerStream = nums.stream();
        Stream<Integer> evenNumStm = integerStream.filter(n -> n%2==1);
        Stream<Integer> sortedNumStm = evenNumStm.sorted();

        sortedNumStm.forEach(System.out::println);


    }
}

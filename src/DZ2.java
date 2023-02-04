import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class DZ2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(50);
        list1.add(2);
        list1.add(40);
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 18;
            }
        };
        list1.removeIf(predicate);
        System.out.println(list1);
    }
}

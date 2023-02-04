import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(50);
        list.add(25);
        list.add(1);
        list.add(10);
        Stream <Integer> integerStream = list.stream();
        findMInMax(integerStream,Comparator.comparing(i -> i),(max,min)-> System.out.println("Максимаольное значение "+ max + "минимальное значение "+ min));


    }

    public static <T> void findMInMax (
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer
    ){
        List <T> arrayList;
        T min = null;
        T max = null;
        arrayList = stream.collect(Collectors.toList());
        Optional <T> minvalue = arrayList.stream().min(order);
        Optional<T> maxValue = arrayList.stream().max(order);

        if (arrayList.size() > 0){
            min=minvalue.get();
            max=maxValue.get();
        }
        minMaxConsumer.accept(min,max);
    }

}

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class UseOfLambdasAndStreams {

    public static void populateList (List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            list.add(random.nextInt());
        }
    }

    public static void main(String[] args) {
        // Create the list
        List<Integer> list = new ArrayList<>();

        // calling the populateList() method
        populateList(list);

        // Filter the list
        List<Integer> filteredList = list.stream().filter(e -> e%2 == 0 && e > 0).collect(Collectors.toList());

        // Display the elements of the list
        //filteredList.forEach(e -> System.out.println(e));
        filteredList.forEach(System.out::println);

    }
}

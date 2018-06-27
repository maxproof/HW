import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ShuffleMergeListMap {

    public static void main(String[] args) {

        //first list
        List<String> dataList1 = new ArrayList<String>();
        dataList1.add("EEEEEE");
        dataList1.add("FFFFFF");
        dataList1.add("WWWWWW");
        dataList1.add("KKKKKK");
        dataList1.add("OOOOOO");
        dataList1.add("SSSSSS");
        dataList1.add("AAAAAA");

        //shuffled list
        List<String> shuffledList1 = new ArrayList<String>(dataList1);
        //System.out.println("Printing result before any Operation: \t" + dataList1);
        // Randomly permutes the specified list using a default source of randomness.
        Collections.shuffle(dataList1);
        //System.out.println("Printing result after shuffle(): \t" + dataList1);

        //second list
        List<String> dataList2 = new ArrayList<String>();
        dataList2.add("QQQQQQ");
        dataList2.add("DDDDDD");
        dataList2.add("NNNNNN");
        dataList2.add("XXXXXX");
        dataList2.add("YYYYYY");
        dataList2.add("TTTTTT");
        dataList2.add("LLLLLL");

        //shuffled list
        List<String> shuffledList2 = new ArrayList<String>(dataList2);
        //System.out.println("Printing result before any Operation: \t" + dataList2);
        Collections.shuffle(dataList2);
        //System.out.println("Printing result after shuffle(): \t" + dataList2);

        //map from two lists
        Map<String, String> map12 = IntStream.range(0, dataList1.size())
                .boxed()
                .collect(Collectors.toMap(i -> dataList1.get(i), i -> dataList2.get(i)));

        //map12.forEach((k, v) -> System.out.println("key " + k + " value " + v));
        //System.out.println("------------------------------------------");
        map12.forEach((k, v) -> System.out.println("[ " + k + ", " + v + " ]"));

    }

}

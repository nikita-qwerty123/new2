package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataProvider {
    static List<String> stringList = new ArrayList<>();
    static List<Integer> integerList= new ArrayList<>();


    static {
        stringList.add("Nikita");
        stringList.add("Kate");
        stringList.add("Boris");
        stringList.add("Valera");
        stringList.add("Elise");
        integerList.add(380000001);
        integerList.add(380000002);
        integerList.add(380000003);
        integerList.add(380000004);
        integerList.add(380000005);
    }
    public static String getRandomStr() {
        return stringList.get(new Random().nextInt(stringList.size()));
    }
    public static Integer getRandomInt() {
        return integerList.get(new Random().nextInt(integerList.size()));
    }

}

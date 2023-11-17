import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Write a Java Program to iterate through all elements in an array list using iterator.
 */
public class Programme_5_ArrayListWithIterator {

    public static void main(String[] args) {

        ArrayList<String> fruitList = new ArrayList<String>();
        fruitList.add("APPLE");
        fruitList.add("BANANA");
        fruitList.add("GRAPE");
        fruitList.add("MANGO");
        fruitList.add("KIWI");
        fruitList.add("PINEAPPLE");
        fruitList.add("ORANGE");
        fruitList.add("BLACKBERRY");
        fruitList.add("STRAWBERRY");
        fruitList.add("CHERRY");
        fruitList.add("LICHI");

        ListIterator<String> iterate = fruitList.listIterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next() + " , ");
        }
    }
}

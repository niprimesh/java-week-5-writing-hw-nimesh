import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a java program to retrieve an element (At a Specified index)
 * from a given array list
 */
public class Programme_6_RetrieveArrayListAtGivenIndex {

    public static void main(String[] args) {

        ArrayList<String> vegetableList = new ArrayList<String>();
        vegetableList.add("CUCUMBER");
        vegetableList.add("POTATO");
        vegetableList.add("CAULIFLOWER");
        vegetableList.add("BRINGLE");
        vegetableList.add("ONION");
        vegetableList.add("BEETROOT");
        vegetableList.add("MUSHROOM");
        vegetableList.add("BITTER_GROUND");
        vegetableList.add("GREEN-BEANS");
        System.out.println(vegetableList);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an index number : ");
        int index = scanner.nextInt();
        if (index < vegetableList.size()) {
            System.out.println(vegetableList.get(index));
        } else {
            System.out.println("Invalid Number !!");
        }
        scanner.close();
    }
}

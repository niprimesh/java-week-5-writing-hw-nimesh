import java.util.ArrayList;

/**
 * Write a java program to create a new array list, add some colours (String)
 * and Printout the collections using for each loop.
 */
public class Programme_4_ColoursArrayList {

    public static void main(String[] args) {

        ArrayList<String> colourList = new ArrayList<String>();
        colourList.add("RED");
        colourList.add("BLUE");
        colourList.add("GREEN");
        colourList.add("YELLOW");
        colourList.add("BLACK");
        colourList.add("WHITE");
        colourList.add("ORANGE");
        colourList.add("PURPLE");
        colourList.add("CYAN");
        colourList.add("PINK");

        for (String colorList : colourList) {
            System.out.println(colorList + ", ");
        }
    }
}

package CodingQuestions;

import java.util.ArrayList;
//Done by Theresa
public class RemoveAllDuplicatesArrayList {
    public static void main(String[] args) {
        //Create an ArrayList
        ArrayList<String> food = new ArrayList<>();

        //Add values
        food.add("Pizza");
        food.add("Chicken");
        food.add("Taco");
        food.add("Taco");//duplicate
        food.add("Soup");
        food.add("Chicken");//duplicate

        ArrayList<String> foodList = new ArrayList<>(); //Empty list to put non duplicates

        //Create for loop to iterate through the array
        //Use if statement to remove duplicates
        for (String item : food ) {
            if (!foodList.contains(item)){//Check if the item has been added to the foodList
                foodList.add(item); //if it hasn't been added it will be added
            }
        }

        //print list with removed duplicates
        System.out.println("Refined List: "+ foodList);
        //foodList was the empty list

    }
}

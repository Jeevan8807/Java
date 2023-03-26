import java.util.ArrayList;
import java.util.Collections;



public class labarray {

    public static void main(String args[]) {

        ArrayList <String> Fruit = new ArrayList<>();
        Fruit.add("Apple");
        Fruit.add("Watermeloan");
        ArrayList <String> NewFruits = new ArrayList<>();
        NewFruits.add("Banana");
        NewFruits.add("Orange");
        NewFruits.add("RamFruit");
        
        NewFruits.addAll(Fruit);
        System.out.println(NewFruits);

     //  remove fruit
        NewFruits.remove("Banana");
        System.out.println(NewFruits);

      // add fruit at mid
        int middleIndex= NewFruits.size()/2;
        NewFruits.add(middleIndex, "Grapes");
        System.out.println(NewFruits);

    // swapping element  
        Collections.swap(NewFruits, 1,2);
        System.out.println("List after swapping: "+ NewFruits);



        
    }
    
}

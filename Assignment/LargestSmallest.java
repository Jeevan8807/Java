public class LargestSmallest {

        public static void main(String[] args) {
    
            int arr[] = new int[]{10,3,96,5,57,4}; //declear array
    
            int smallest = arr[0];
            int largest = arr[0];
    
            for (int i =1; i <arr.length; i++){ //length of array
                if (arr[i] > largest)
                largest = arr[i];
                else if (arr[i] < smallest)
                smallest = arr[i];
            }
             System.out.println("Largest no: " +largest); // print the numbers.
             System.out.println("Smallest no: " +smallest);
             
            
        }
        
    }
    
    

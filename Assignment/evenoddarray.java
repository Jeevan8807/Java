public class evenoddarray {

    public static void main(String []args) {

        int[] arr = new int [] {8,5,3,12,15};

        System.out.println("Elements of given array present on odd position: ");
                     
        for (int i = 0; i<arr.length; i++)
        if (i%2==0)
        System.out.println(arr [i]);
        System.out.println("Elements of given array present on even position: ");

        for (int i = 1; i<arr.length; i++)
        if (i%2!=0)
        System.out.println(arr [i]);  
    }    
}

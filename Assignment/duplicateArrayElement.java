public class duplicateArrayElement {

    public void display() {
		
		int array1[] = {1,2,3,4,5,6,7,8,8,9,9,10,11,11};
		for(int i=0; i<array1.length;i++) 
        {
			for(int j=i+1;j<array1.length;j++) 
            {
				if(array1[i] == array1[j]) 
                {
					System.out.println(array1[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		
		duplicateArrayElement d = new duplicateArrayElement();
		d.display();
	}
}
    


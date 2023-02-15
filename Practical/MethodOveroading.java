public class MethodOveroading {//class with main()

	public void multiply(int a,int b)// add () with 2 int
	{
		System.out.println(a*b);
	}
	public void multiply(int a,int b, int c)// add() 3 int
	{
		System.out.println(a*b*c);
	}
	public void multiply(float a,float b) // add 2 float
	{
		System.out.println(a*b);
	}
	public void multiply(double a, double b) // add 2 double
	{
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		
		MethodOveroading obj= new  MethodOveroading();// creating object obj of class MethodOveroading
//		calling all methods
		obj.multiply(1, 3);
		obj.multiply(1.2f, 2.3f);
		obj.multiply(2, 2, 2);
		obj.multiply(22.2, 22.2);
	}
}
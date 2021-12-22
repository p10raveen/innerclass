package innerclass;

public class InnerClassExample1 {
	
	int a = 100;
	
	class B
	{
		void show()
		{
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) 
	{
		InnerClassExample1 obj1 = new InnerClassExample1();
		InnerClassExample1.B obj2 = obj1.new B();
		
		obj2.show();
	}

}

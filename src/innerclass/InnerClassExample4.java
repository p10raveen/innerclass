package innerclass;

public class InnerClassExample4 {
	int a = 100;
	
	void show()
	{
		class B
		{
			void display()
			{
				System.out.println("Inner class Method and  "+a);
			}
		}
		
		B b = new B();
		b.display();
	}
	
	public static void main(String[] args) {
		InnerClassExample4 obj = new InnerClassExample4();
		obj.show();

	}

}

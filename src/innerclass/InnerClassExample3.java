package innerclass;

public class InnerClassExample3 extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Anonymous Inner class
		Employee e = new Employee()
				{
					void show()
					{
						System.out.println("Employee Show");
					}
				};
		e.show();
	}

	

}

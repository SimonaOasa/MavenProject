package curs18;

public class TestAnnotation {

	public static void main(String[] args) {

		Tester tester = new Tester();
		Developer dev =  new Developer();
		
		if(dev.getClass().isAnnotationPresent(MostImportant.class)) {
			
			System.out.println("This employee is very important!");
			
		}else {
			
			System.out.println("This employee is NOT very important!");

		}
		
		
		
		
	}

}

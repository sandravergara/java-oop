package exercises;

public class ExerciseTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program that calculate the Tax
		// up-to 15k = 10%
		//15k to 40k = 20%
		//above 40k = 30%
		//Salary = 20000
		
		double salary = 20000;
		double tax = 0.0;
		
		if (salary <= 15000) {
			tax = salary * .10;
		}else if(salary <= 40000) {
			tax = salary * .20;
		}else {
			tax = salary * .30;
		}
		System.out.println("Tax = "+ tax);

		

	}

}

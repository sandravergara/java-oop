package hi;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ARRAY
		
		int[] a = {10, 20, 30, 40, 50};
		System.out.println(a[2] + " " + a[4]);
		
		//enhanced for
		
		for(int temp : a) {
			System.out.println(temp);
		}
		
		System.out.println("-----");
		int[] x = new int[5];
		
		x[3] = 25;
		x[0] = 12;
		
		for (int temp2 : x) {
			System.out.println(temp2);
		}
		
		//Creating array using String
		System.out.println("-----");
		String[] str = {"One", "Two", "Three"};
		
		for(String temp : str) {
			System.out.println(temp);
		}
	
	}

}

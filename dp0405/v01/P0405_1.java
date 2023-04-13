package dp0405.v01;

public class P0405_1 {

	public static void main(String[] args) {
		String birthday = "2023/04/05";
		String year = birthday.substring(0, 4);
		String month = birthday.substring(5, 7);
		String day = birthday.substring(8);
		
		//null
		
		//If a dot(.) is present, it means it belongs to it
		
		System.out.println("Birth year: "+ year);
		System.out.println("Birth year: "+ month);
		System.out.println("Birth year: "+ day);
		

	}

}

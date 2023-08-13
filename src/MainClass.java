import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		TemperatureConverter tc = new TemperatureConverter();
		PallandromChecker pp = new PallandromChecker();
		StudentGrade st = new StudentGrade();
		PasswordGenerator ps = new PasswordGenerator();
		
		System.out.println("=============================================");
		System.out.println();
        System.out.println("Welcome to Level-1 Cognifyz java Internship");
		System.out.println();
		System.out.println("=============================================");
		
		while(true)
		{
			System.out.println("===============================");
			System.out.println();
			System.out.println("select tasks");
			System.out.println("1 for TemperatureConverter");
			System.out.println("2 for PalindromChecker");
			System.out.println("3 for StudentGrade");
			System.out.println("4 for PasswordGenerator");
			System.out.println();
			System.out.println("================================");
			
			Scanner sc = new Scanner(System.in);
			
			int task = sc.nextInt();
			
			switch (task) {
			case 1:
				tc.temperature();
				break;
				
			case 2:
				pp.palindrom();
				break;
				
			case 3:
				st.grade();
				break;
				
			case 4:
				ps.generate();
				break;
			

			default:
				System.out.println("Please enter valid number mention in above");
				break;
			}
			
			
			
			
		}

	}

}

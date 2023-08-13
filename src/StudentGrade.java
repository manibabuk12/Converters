import java.util.Scanner;

public class StudentGrade {

	public void grade(){
		
		float grades,grade,length;
		float totalgrade = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("=======================");
		System.out.println("");
		System.out.println("Enter number of grades");
		System.out.println("");
		System.out.println("=======================");

		grades = sc.nextFloat();
		System.out.println("");

		for(int i=1;i<grades+1;i++)
		{
			System.out.println("Enter grade"+i);
			System.out.println("");
			grade = sc.nextFloat();
			totalgrade = totalgrade + grade; 
		}
		float avarage = totalgrade/grades;
		System.out.println("=======================================");
		System.out.println("");
		System.out.println("Avarage grade of student: "+avarage+"%");
		System.out.println("");
		System.out.println("=======================================");
	
	}

}

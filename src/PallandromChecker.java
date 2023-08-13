import java.util.Scanner;

public class PallandromChecker {

	public void palindrom() {
		System.out.println("Enter the word");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		int a = name.length();
		String str = "";
		for(int i=a-1;i>=0;i--)
		{
			str = str+name.charAt(i);
		}
		System.out.println("==============================");
		System.out.println();
		if(name.equals(str))
		{
			System.out.println(str  + " Yes It is Palindrom");
		}
		else
		{
			System.out.println(str + " No It is not Palindrom");
		}
		System.out.println();

	}

}

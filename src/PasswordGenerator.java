import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public void generate() {
    	
       String upper = "ABCDEFGHIJHLMNOPQRSTUVWXYZ";
       String lower = "abcdefghijklmnopqrstuvwxyz";
       String num = "0123456789";
       String specialchar = "<>,.?/}]{[+-_)(*&^%$#@!=";
       String combination = upper + lower + num + specialchar;
       
       Scanner sc = new Scanner(System.in);
       System.out.println("========================================");
       System.out.println();
       System.out.println("Please enter the length of the Password");
       System.out.println();
       int len = sc.nextInt();
       
       char[] password = new char[len];
       Random r = new Random();
       
       for(int i=0;i<len;i++)
       {
    	   password[i] = combination.charAt(r.nextInt(combination.length()));
       }
       System.out.println("========================================");
       System.out.println();
       System.out.println("Generated password is : "+new String(password));
       System.out.println();
       System.out.println("========================================");
    }
}

import java.util.Scanner;

public class UserCheck{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		String trueuser = "Patrick";
		String truepass = "1234";
		System.out.println("Please enter your username:");
		String user = sc.next();
		System.out.println("Please enter your password:");
		String pass = sc.next();
		if (user.equals(trueuser) && pass.equals(truepass)){
			System.out.println("Welcome "+user+".");
		} else{
			System.out.println("Invalid Username or Password!");
		}
	}
}
package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Input Name");
			
			String name= sc.nextLine();
			if(name!="Mia") {
				throw new BadNameException();
				}
			else {
				System.out.println("Great Name!");
			}
			
		}
		catch(BadNameException e) {
			e.printStackTrace();
		}
	}

}

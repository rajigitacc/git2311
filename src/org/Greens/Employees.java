package org.Greens;

import java.util.Scanner;

public class Employees { 	

	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Employee name:");

    String empName=sc.nextLine();
    System.out.println("the emp name:" +empName );	
    
    System.out.println("Enter the Employee email:");
<<<<<<< HEAD
    System.out.println("Enter the Employee name1:");
    System.out.println("Enter the Employee name2:");
=======
    System.out.println("Enter the Employee email address:");

>>>>>>> 12c0b6bc3b95061730bf43dcc23546a863028e18
    String empEmail=sc.nextLine();
    System.out.println("the emp email:" +empEmail);
	
	System.out.println("Enter the Employee Id:");
     
    byte empid=sc.nextByte();
    System.out.println("the emp id is:" +empid);
    
    System.out.println("Enter the Phone Id:");
    
    long phoneNo=sc.nextLong();
    System.out.println("the emp phone number is:" +phoneNo);
  
}

}

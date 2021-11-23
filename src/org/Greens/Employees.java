package org.Greens;

import java.util.Scanner;

public class Employees { 	

	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Employee name:");

    String empName=sc.nextLine();
    System.out.println("the emp name:" +empName );	
    
    System.out.println("Enter the Employee email:");
    System.out.println("Enter the Employee name:");

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

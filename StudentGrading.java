package com.project.lab.practice;

import java.util.Scanner;

public class StudentGrading {
     public static void main(String args[])
     {   
    	// int studentmarks;
    	 int marks = 100;
    	 Scanner sc = new Scanner(System.in);
    	 
    	 for (int i =1;i<=10;i++) 
    	 {
    		 System.out.println("Enter student name for student"+i);
    		 String name = sc.nextLine();
    		 
    		 System.out.println("Enter student marks "+i);
    		 int studentmarks = sc.nextInt();
    		 
    	 }
    	 
    	 System.out.println("Enter your choice(1-5):");
    	 int choice = sc.nextInt();
    	 
    	 switch(choice)
    	 {
    	   case 1:
			//int marks = 100;
			if(marks >= 80) 
    		       {
    		    	   System.out.println("A grade");
    		       }
    		       break;
    	   case 2:
    		   //int marks =100;
    		   if(marks <=84 || marks<=75)
    		   {
    			 System.out.println("B grade");

    		   }
    		   break;
    		   
    	   case 3:
    		   if(marks <=74 || marks<= 65)
    		   {
    			   System.out.println("C Grade");
    		   }
    		   break;
    		   
    	   case 4:
    		   if (marks<= 64 || marks<= 55)
    		   {
    			   System.out.println("D grade");
    		   }
    		   break;
    		   
    	   case 5:
    		   if( marks <40)
    		   {
    			   System.out.println("E grade");
    		   } 
    		   
    		default:
    			System.out.println("Invalid choice");
    			
    	 }
    sc.close(); 
     }
}

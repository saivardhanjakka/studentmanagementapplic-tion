package studentManagementApp;

import java.util.Scanner;

/* This class contains the main method where the student management application starts.
It displays a menu for the user to choose various operations such as adding a student, displaying student records, deleting a student, or exiting the application.
Based on the user's choice, it invokes the corresponding methods from */

public class Start 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("welcome to student management app");
			System.out.println("Enter 1 to add student");
			System.out.println("Enter 2 to Display student");
			System.out.println("Enter 3 to Delete student");
			System.out.println("Enter 4 to exit");
			System.out.println("enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:{
					//add
					System.out.println("Enter Student Name");
					String sName = sc.next();
					System.out.println("Enter Student Branch");
					String sBranch = sc.next();
					System.out.println("Enter Student Address");
					String sAddress = sc.next();
					Student student = new Student(sName, sBranch, sAddress);
					boolean res = DataBaseOperations.insertIntoDB(student);
					if(res)
					{
						System.out.println("Student Data Inserted Successfully");
						System.out.println("_________________________________________");
					}
					else
					{
						System.err.println("Something went Wrong try again…");
					}
					break;
				}
				case 2:{
					//display
					System.out.println("Students List in the DataBase");
					System.out.println("---------------------------------");
					DataBaseOperations.display();
					break;
				}
				case 3:{
					//delete
					System.out.println("Enter RollNo to Delete");
					int rollNo = sc.nextInt();
					boolean res = DataBaseOperations.deleteStudent(rollNo);
					if(res)
					{
						System.out.println("Student Data Deleted Successfully");
						System.out.println("_________________________________________");
					}
					else
					{
						System.out.println("Entered RollNo is Not Present");
						System.out.println("Please Try Again.");
					}
					break;
				}
				case 4:{
					//exit
					break;
				}
				default:
				{
					System.out.println("Please Enter a Valid Choice");
				}
				}
			}
		while(choice!=4);
			System.out.println("*********** Thanks for Using StudentManagement Application ************");
			
			
			
		}
		
	
			}
		

package com.training;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
public class UserService {
	static private User user;
	static Scanner sc=new Scanner(System.in);
 static	ArrayList arrayList=new ArrayList();
	public static void addEmployee()
	{
	System.out.println("Enter Employee Id");
	int empId=sc.nextInt();
	System.out.println("Enter Employee Name");
	String empName=sc.next();
	System.out.println("Enter Employee email");
	String empEmail=sc.next();
	user=new User(empId,empName,empEmail);
	arrayList.add(user);
	}
	public static void delEmployee()
	{
	System.out.println("Enter the Employee id to remove");
	int id=sc.nextInt();
	if(id==user.getEmpId())
	{
	arrayList.remove(user);
	System.out.println("Record Deleted");
	}
	}
	public static void displayAllEmployees()
	{
	if(arrayList.isEmpty()) {
	System.out.println("No Employees in list");
	}
	else {
	ListIterator itr = arrayList.listIterator();
	while(itr.hasNext()) {
	System.out.println((User)itr.next());
	}
	}
	}
	public static void main(String[] args)
	{
		int choice;
		
		do {
			System.out.println("1 for add Employee");
			System.out.println("2 for display all");
			System.out.println("3 for delete employee");
			System.out.println("0 for exit");
			System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		addEmployee();
		break;
		case 2:
		displayAllEmployees();
		break;
		case 3:
			delEmployee();break;
		case 0:
			System.out.println("Application terminated"); break;
			default:
				System.out.println("Invalid choice......");
		}
		}while(choice!=0);
	}
}

package Anudip.hibernate.EmployeeManagementSystem.usecases;

import java.util.Scanner;

import Anudip.hibernate.EmployeeManagementSystem.model.Employee;
import Anudip.hibernate.EmployeeManagementSystem.service.EmpService;
import Anudip.hibernate.EmployeeManagementSystem.serviceImpl.EmpServiceImpl;

public class AllOperation {
   public static Scanner sc = new Scanner(System.in);
   public static EmpService es = new EmpServiceImpl();
   
   public static Employee inputFromEmployee() {
//	   System.out.print("Enter Employee id : ");
//	   int id = sc.nextInt();
	   
	   System.out.print("Enter Employee name : ");
	   String name = sc.next();
	   
	   System.out.print("Enter Employee username : ");
	   String username = sc.next();
	   
	   Employee ee = new Employee(0 , name , username);
	   return ee;
   }
   
   
   
   public static void main(String[] args) {
	   
	   
	   while(true) {
		   System.out.println("Welcome to Employee Management System \n" 
				   + "press 1 for creating Account \n"
				   + "press 2 for delete Account \n"
				   + "press 3 for update Account \n"
				   + "press 4 for find Account \n"
		           + "press 5 for exit Account \n");

		   
		   int choice = sc.nextInt();
		   
		   switch(choice) {
		       
		   case 1 :
			   System.out.println("Ok, you want to insert data!");
               Employee newEmp = inputFromEmployee();
               boolean isCreated = es.createEmpAccount(newEmp);

               if (isCreated) {
                   System.out.println("Employee created successfully!");
               } else {
                   System.out.println("Failed to create employee. Please try again.");
               }
               break;
			   
		   case 5 :
			   return;
		   }
			   

	   }		   
	   
   }
}

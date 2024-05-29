package EmpManagementSystem;

import java.util.Scanner;

import model.Employee;

public class EmployeeDetails {

	

	public static void main(String args[]) {
		String name;
		String lastName;
		String mobileNo;
		float salary;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1: Search for Employee ");
			System.out.println("2: Update Employee details");
			System.out.println("3: Delete the Employee details");
			System.out.println("4: Enter Your choice: ");

			int emp = sc.nextInt();

			switch (emp) {

			case 1:
				System.out.println("Enter the following details to Add list:\n");

				System.out.println("Enter name: ");
				name = sc.next();
				System.out.println("Enter lastName:");
				lastName = sc.next();
				System.out.println("Enter MobileNO: ");
				mobileNo = sc.next();
				System.out.println("Enter Salary: ");
				salary = sc.nextFloat();

				break;
			default:
				System.out.println("");

			}

		} while (true);

	}
}

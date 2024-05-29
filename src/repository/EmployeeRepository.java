package repository;

import model.Employee;

public class EmployeeRepository {

	static Employee[] empArray = new Employee[100];

	public static void insert(Employee emp) {

		int index = empArray.length == 0 ? 0 : empArray.length;
		empArray[index] = emp;
	}

	public static void update(Employee emp) {
		
		for (int i = 0; i < empArray.length; i++) {
			emp = empArray[i];
			if (emp.getEmployeeId() == i) {
				 
			}
		}
		 

	}

	public static void delete(String emailId) {

	}

	public static Employee search(String emailId) {
		Employee e = new Employee();
		return e;

	} 

	public static Employee select(int employeeId) {
		Employee e = null;
		for (int i = 0; i < empArray.length; i++) {
			e = empArray[i];
			if (e.getEmployeeId() == employeeId) {
				return e;
			}
		}
		return e;

	}

}

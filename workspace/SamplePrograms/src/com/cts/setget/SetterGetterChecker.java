package com.cts.setget;

import java.util.Date;

public class SetterGetterChecker {
		
		//private static Employee employee;

		/*public Employee getEmployee() {
			return employee;
		}

		public void setEmployee(Employee employee) {
			this.employee = employee;
		}*/

		public static void main(String[] args) {
			SetterGetterChecker setterGetterChecker = new SetterGetterChecker();
			
			Employee emp = new Employee();
			emp.setName("Prafulla");
			emp.setDoj(new Date());
			emp.setSalary(40000.0);
			
			setterGetterChecker.validateEmployee(emp);
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
		}

		private void validateEmployee(Employee employee) {
			//Employee employee = null;
			//System.out.println(employee.getName());
			employee.setName("Jadhav");
			employee.setSalary(50000.0);
		}
		
}

package com.company.Lab_1_1;

public class EmployeeTest {

    public void test() {
        Employee employee = new Employee("Bob", "some department", Employee.Position.SELLER);
        System.out.println("Employee test:\n" + employee.think() + '\n' + employee.getName() + '\n' + employee.getPosition().toString() + '\n' + employee.getDepartment());
    }

}

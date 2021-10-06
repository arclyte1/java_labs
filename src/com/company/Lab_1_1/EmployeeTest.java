package com.company.Lab_1_1;

public class EmployeeTest {

    public void test() {
        Employee employee = new Employee(new MyString("Bob".toCharArray()), 25, Employee.Position.SELLER);
        System.out.println("Employee test:\n" + employee.think() + '\n' + employee.getName().toString() + '\n' + employee.getPosition().toString() + '\n' + employee.getAge());
    }

}

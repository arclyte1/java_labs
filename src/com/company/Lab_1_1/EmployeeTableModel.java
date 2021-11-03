package com.company.Lab_1_1;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class EmployeeTableModel extends AbstractTableModel {

    private ArrayList<Employee> data;
    private String[] colNames = {"Id", "Name", "Department", "Age", "Phone", "Position", "Gender"};

    public void setData(ArrayList<Employee> data) {
        this.data = data;
    }

    public void addEmployee(Employee employee) {
        data.add(employee);
    }

    public void deleteEmployee(Employee employee) {
        data.remove(employee);
    }

    public String getColumnName(int i) {
        return colNames[i];
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Employee employee = data.get(rowIndex);
        switch (columnIndex) {
            case 0: return employee.getId();
            case 1: return employee.getName();
            case 2: return employee.getDepartment();
            case 3: return employee.getAge();
            case 4: return employee.getPhone();
            case 5: return employee.getPosition();
            case 6: return employee.getGender();
        }
        return null;
    }
}

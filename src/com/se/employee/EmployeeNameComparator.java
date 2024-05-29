package com.se.employee;

public class EmployeeNameComparator {
    public int compare(Object o1,Object o2){
        Employee e1=(Employee)o1;
        Employee e2=(Employee)o2;

        return e1.getName().compareTo(e2.getName());
    }
}

package com.se.strings;

import java.util.Date;

final class Employee {
    private final String empName;
    private final int age;
    private final Address address;
    private final Date startDate;

    public Employee(String name, int age, Address address, Date startDate) {
        super();
        this.empName = name;
        this.age = age;
        this.address = address;
        this.startDate = startDate;
    }
    public String getEmpName() {
        return empName;
    }
    public int getAge() {
        return age;
    }
    //deep cloning

    public Address getAddress() {
        return new Address(address.getAddressType(), address.getAddress(), address.getCity());
    }

    public Date getStartDate(){
       return new Date(this.startDate.getTime());
    }



   /*
    public Address getAddress() throws CloneNotSupportedException {
        return (Address) address.clone();
    }*/

}

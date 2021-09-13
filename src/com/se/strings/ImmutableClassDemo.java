package com.se.strings;

import java.util.Date;

public class ImmutableClassDemo {

        public static void main(String[] args) throws Exception {
            Employee emp = new Employee("Adithya", 34, new Address("Home", "Madhapur", "Hyderabad"), new Date());
            Address address = emp.getAddress();
            System.out.println(address);
            address.setAddress("Hi-tech City");
            address.setAddressType("Office");
            address.setCity("Hyderabad");
            System.out.println(emp.getAddress());
            emp.getStartDate().setDate(10);

            System.out.println("emp date = " + emp.getStartDate());
        }
}

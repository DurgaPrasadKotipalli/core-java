package com.se.strings;

import java.util.Date;

public class ImmutableClassDemo {

        public static void main(String[] args) throws Exception {
            Employee emp = new Employee("Adithya", 34, new Address("office", "Madhapur", "Hyderabad"), new Date());
            Address address = emp.getAddress();
            System.out.println(address);
            address.setAddress("BV palem");
            address.setAddressType("home");
            address.setCity("Amalapuram");
            System.out.println(emp.getAddress());
            emp.getStartDate().setDate(10);

            System.out.println("emp date = " + emp.getStartDate());
        }
}

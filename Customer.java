package edu.psu.ist242;

import java.util.ArrayList;



public class Customer extends Order {


    private int customerId;
    protected String customerName;
    private String customerPhoneNumber;


    public Customer() {
    }

    public Customer(int _customerId) {
        this.customerId = _customerId;
    }



    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int _customerId) {
        this.customerId = _customerId;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String _customerName) {
        this.customerName = _customerName;
    }


    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String _customerPhoneNumber) {
        this.customerPhoneNumber = _customerPhoneNumber;
    }





    public static void printCustomer(ArrayList<Customer> cList) {
        for (Customer cust : cList) {
            System.out.printf("%-10s | %-12s | %-10s\n", cust.getCustomerId(), cust.getCustomerName(), cust.getCustomerPhoneNumber());


        }
    }





}

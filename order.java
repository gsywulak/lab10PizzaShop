package edu.psu.ist242;

import java.util.ArrayList;


public class Order {

    int cCount = 0;


    private Customer cust;
    private Menu menu;
    private ArrayList<Menu> menuItem;
    private int orderId;
    private int menuID;
    private int custID;
    private int quantity;
    private double price;
    private double totalPrice;
    private double subTotal;
    private double orderTotal = 0;


    public Order(){
    }
    public Order order() {
        Order ord1 = new Order(cCount++);
        return ord1;
    }
    public Order(int _orderId){
        this.orderId = _orderId;
    }
    public Order(int _orderId, double _totalPrice) {
        this.orderId = _orderId;
        this.price = _totalPrice;
    }



    public ArrayList<Menu> getMenuItem() {
        return menuItem;
    }
    public void setMenuItem(ArrayList<Menu> menuItem) {
        this.menuItem = menuItem;
    }


    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


    public int getMenuID() {
        return menuID;
    }
    public void setMenuID(int menuID) {
        this.menuID = menuID;
    }


    public int getCustID() {
        return custID;
    }
    public void setCustID(int custID) {
        this.custID = custID;
    }


    public int getQuantity() {

        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }


    public double getSubTotal() {
        return subTotal;
    }
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }


    public double getOrderTotal() {
        return orderTotal;
    }
    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }




    public double getSubtotal(double price, double quantity) {
        double subTotal = price * quantity;
        return subTotal;
    }

    public double getOrderTotal(double subTotal) {
        System.out.println("$ " + subTotal);
        orderTotal = orderTotal + subTotal;
        return orderTotal;
    }

    public void printOrder(String menuItem, double price, int quantity, double subtotal) {
        System.out.println(menuItem + " $" + price + " * " +  quantity + " = " + "$ " + subtotal);
    }


    public static void listOrderDetails(ArrayList<Order> oList) {
        for (Order orderDetails : oList) {
            System.out.println(orderDetails.getMenuItem());
        }
    }
}

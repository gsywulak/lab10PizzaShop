package edu.psu.ist242;

import java.util.ArrayList;

public class Menu {
    private int menuId;
    private String menuItem;
    private double price;




    public Menu(int _menuId, String _menuItem, double _price){
        this.menuId = _menuId;
        this.menuItem = _menuItem;
        this.price = _price;
    }


    public int getmenuId() {
        return menuId;
    }
    public void setmenuId(int _menuId) {
        this.menuId = _menuId;
    }


    public double getPrice(){
        return price;
    }
    public void setPrice(double _price){
        this.price = _price;
    }


    public String getMenuItem() {
        return menuItem;
    }
    public void setMenuItem(String _menuItem) {
        this.menuItem = _menuItem;
    }
    public static void listMenu(ArrayList<Menu> mList){
        for (Menu menu: mList) {
            System.out.println(menu.getMenuItem());
        }}
            public Menu printMenuInfo () {
                System.out.printf("%-1s | %-12s | %-12s\n", menuId, menuItem, "$" + price);
                return null;

            }
        }

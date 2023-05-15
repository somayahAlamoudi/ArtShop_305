
package artshop_305;


import static artshop_305.p1_main.menu;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Item {
    private String itemName;
    private double price;
    private String creatorName;
    private int quantity;//for today
    static ArrayList<Item> items = new ArrayList<>();

//CONSREUCTOR
    public Item(String itemName, double price, String creatorName, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.creatorName = creatorName;
        this.quantity = quantity;
    }

//SETTERS AND GETTERS
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

//METHODS: add the new item by the admin to mnue
    public static String addNewItem(Item newItem) throws FileNotFoundException {
        items.add(newItem);
        
        return "Item added successfully";
    }
//METHODS: delete the item by the admin from minu 

    public static String deleteItem(String itemName) {
        Item searchItem = searchItem(itemName);
        if (searchItem != null) { //############delete from file or remove delet buttun
            items.remove(searchItem);
            return "Item deleted successfully";
        } else {
            return "this Item is not exist!";
        }
    }

//METHODS: search for an item to delete it from minu 
    public static Item searchItem(String key) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).itemName.equals(key)) {
                return items.get(i);
            }
        }
        return null;
    }

//METHODS: print the avalible items "minu" to customer
    public static String printItems() {
        String list="";
        list+=("---------------------------------------------------\n");
        list+=("                   ART SHOP system                 \n");
        list+=("---------------------------------------------------\n");
        list+=("---------------------------------------------------\n");
        for (int i = 0; i < items.size(); i++) {
            list+=(items.get(i).toString()+"\n");
        }
        list+=("---------------------------------------------------\n");
        return list;
    }
    
//METHODS: search for creator and print all his creations ##################
        public static boolean searchCreator(String key) {
            boolean exist=false;
        System.out.println("---------------------------------------------------");
        System.out.println("                   ART SHOP system                 ");
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).creatorName.equals(key)) {
                exist=true;
                System.out.println(items.get(i));
            }
        }
        if(exist== false)System.out.println(" we are sorry we don't have any pice creates by "+ key);
        System.out.println("---------------------------------------------------");
        return exist;
    }

    @Override
    public String toString() {
        return String.format(" %-15s%7.1f %15s%10d",this.getItemName(),this.getPrice(),this.getCreatorName(),this.getQuantity());
    }
        
}

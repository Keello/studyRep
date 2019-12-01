package hash_tables;

import java.util.HashMap;
import java.util.Scanner;

public class HashTables {

    public static void main(String[] args){
        HashMap <String, Double> priceBook = new HashMap<>();
        priceBook.put("BMW", 5012.5);
        priceBook.put("Lexus", 4999.2);
        priceBook.put("Ferrari", 8567.9);
        System.out.println(priceBook);

        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = sc.nextLine();
        System.out.print("Input price: ");
        double price = sc.nextDouble();
        addProduct(priceBook, name, price);
        System.out.println(priceBook);
    }

    public static void addProduct(HashMap priceBook, String name, Double price){
        if (priceBook.containsKey(name)){
            System.out.println(name + " also contains");
        }
        else {
            priceBook.put(name, price);
        }
    }
}

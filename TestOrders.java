import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        // Menu items
        Item item1 = new Item();
        item1.name = "Mocha";
        item1.price = 3.99;

        Item item2 = new Item();
        item2.name = "Latte";
        item2.price = 3.50;

        Item item3 = new Item();
        item3.name = "Drip Coffee";
        item3.price = 1.98;

        Item item4 = new Item();
        item4.name = "Cappuccino";
        item4.price = 2.50;
    
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Cindihuri";
        order1.ready = true;

        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.ready = true;

        Order order3 = new Order();
        order3.name = "Noah";
        order3.total = 2.5;

        Order order4 = new Order();
        order4.name = "Sam";
        order4.total = 3.50 + 3.50 + 3.50;
        
    
        // Application Simulations
        order2.items = new ArrayList<Item>();
        order2.items.add(item1);

        order3.items = new ArrayList<Item>();
        order3.items.add(item4);

        order4.items = new ArrayList<Item>();
        order4.items.add(item2);
        order4.items.add(item2);
        order4.items.add(item2);
        // Use this example code to test various orders' updates
        // System.out.println(order2.items);
        // System.out.printf("Name: %s\n", order2.name);
        // System.out.printf("Total: %s\n", order2.total);
        // System.out.printf("Ready: %s\n", order2.ready);
        order4.displayStatus();
    }
}

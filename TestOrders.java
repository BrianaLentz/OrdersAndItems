import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        // Menu items
        Item item1 = new Item("Mocha", 3.99);

        Item item2 = new Item("Latte", 3.50);

        Item item3 = new Item("Drip Coffee", 1.98);

        Item item4 = new Item("Cappuccino", 2.50);
    
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.setReady(true);
        Order order2 = new Order();
        Order briana = new Order("Briana");
        briana.setReady(true);
        Order cooper = new Order("Cooper");
        Order meeko = new Order("Meeko");
        // Order order1 = new Order();
        // order1.name = "Cindihuri";
        // order1.ready = true;

        // Order order2 = new Order();
        // order2.name = "Jimmy";
        // order2.ready = true;

        // Order order3 = new Order();
        // order3.name = "Noah";
        // order3.total = 2.5;

        // Order order4 = new Order();
        // order4.name = "Sam";
        // order4.total = 3.50 + 3.50 + 3.50;
        
    
        // Application Simulations
        order1.addItem(item1);
        order1.addItem(item2);
        order2.addItem(item2);
        order2.addItem(item4);
        briana.addItem(item1);
        briana.addItem(item3);
        cooper.addItem(item1);
        cooper.addItem(item4);
        meeko.addItem(item4);
        meeko.addItem(item3);
        // print statements
        // order1.getStatusMessage();
        // System.out.println(order1.getOrderTotal());
        briana.displayStatus();
        
        
        
        
        
        // order2.items = new ArrayList<Item>();
        // order2.items.add(item1);

        // order3.items = new ArrayList<Item>();
        // order3.items.add(item4);

        // order4.items = new ArrayList<Item>();
        // order4.items.add(item2);
        // order4.items.add(item2);
        // order4.items.add(item2);
        // Use this example code to test various orders' updates
        // System.out.println(order2.items);
        // System.out.printf("Name: %s\n", order2.name);
        // System.out.printf("Total: %s\n", order2.total);
        // System.out.printf("Ready: %s\n", order2.ready);
        // order1.displayStatus();
    }
}
// their solution
// // Application Simulations

//         // Add the item1 to order2's item list and increment the order's total.
//         order2.items.add(item1);
//         order2.total += item1.price;

//         // order3 ordered a capuccino. Add the cappuccino to their order and to their tab.
//         order3.items.add(item4);
//         order3.total += item4.price;

//         // order4 added a latte. Update accordingly.
//         order4.items.add(item2);
//         order4.total += item2.price;

//         // Cindhuri’s order is now ready.  Update her status.
//         order1.ready = true;

//         // Sam ordered more drinks -- 2 lattes. Update their order as well.
//         order4.items.add(item2);
//         order4.items.add(item2);
//         order4.total += item2.price * 2;

//         // Jimmy’s order is now ready. Update his status.
//         order2.ready = true;

//         // Use this example code to test various orders' updates
//         System.out.printf("Name: %s\n", order1.name);
//         System.out.printf("Total: %s\n", order1.total);
//         System.out.printf("Ready: %s\n", order1.ready);

//         System.out.printf("Name: %s\n", order2.name);
//         System.out.printf("Total: %s\n", order2.total);
//         System.out.printf("Ready: %s\n", order2.ready);

//         System.out.printf("Name: %s\n", order3.name);
//         System.out.printf("Total: %s\n", order3.total);
//         System.out.printf("Ready: %s\n", order3.ready);
    
//         System.out.printf("Name: %s\n", order4.name);
//         System.out.printf("Total: %s\n", order4.total);
//         System.out.printf("Ready: %s\n", order4.ready);

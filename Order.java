import java.util.ArrayList;
class Order {
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items;

    public void displayStatus(){
        System.out.println("Name: " + this.name);
        System.out.println("Total: " + this.total);
        System.out.println("Ready: " + this.ready);
        System.out.println("Items: " + this.items);
        for(Item item : this.items){
            System.out.println(item.name + "(" + item.price + ")");
        }
    }
}
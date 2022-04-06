import java.util.ArrayList;
class Order {
    private String name;
    // private double total;
    private boolean ready;
    private ArrayList<Item> items;

    // constructor
    public Order() {
        this.name = "Guest";
        this.ready = false;
        this.items = new ArrayList<Item>();
    }
    public Order(String name) {
        this.name = name;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    // getters and setters
    // getter
    public String getName() {
        return this.name;
    }
    // setter
    public void setName() {
        this.name = name;
    }
    // getter
    public boolean getReady() {
        return this.ready;
    }
    // setter
    public void setReady(boolean ready) {
        this.ready = ready;
    }
    // getter
    public ArrayList<Item> getItems() {
        return this.items;
    }
    // setter
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    // Methods
    public void addItem(Item item){
        this.items.add(item);
    }

    public void getStatusMessage(){
        if(this.ready){
            System.out.println("Your order is ready!");
        }else{
            System.out.println("Thank you for waiting, your order will be ready soon!");
        }
    }

    public double getOrderTotal(){
        double sum = 0.0;
        for(int i=0; i< this.items.size(); i++){
            sum = sum + this.items.get(i).getPrice();
        }
        return sum;
    }

    public void displayStatus(){
        System.out.println("Customer Name: " + this.name);
        // System.out.println("Total: " + this.total);
        System.out.println("Ready: " + this.ready);
        System.out.println("Items: " + this.items);
        for(Item item : this.items){
            System.out.println(getName() + "(" + getItems() + ")");
        }
    }
}
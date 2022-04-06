class Item {
    // member variables set to private
    private String name;
    private double price;

    // constructor
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    // getters and setters for the member variables
    // getter
    public String getName() {
        return name;
    }
    // setter
    public void setName(String name) {
        this.name = name;
    }

    // getter
    public double getPrice() {
        return price;
    }

    // setter
    public void setPrice(double price) {
        this.price = price;
    }


    // public void displayStatus(){
    //     System.out.println("Name: " + this.name);
    //     System.out.println("Price: " + this.price);
    // }
    
}
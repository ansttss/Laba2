//клас-продукт
public class Product {

    private String name;
    private String description;
    private String designer;
    private int quantity;
    private double price;


    public Product(String name, String description, String designer, int quantity, double price) {
        this.name = name;
        this.description = description;
        this.designer = designer;
        this.quantity = quantity;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
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

}

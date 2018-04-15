import java.util.HashMap;
import java.util.Map;

public class ProductGroup {
    private String name;
    private String description;
    private Map<String, Product> allproducts = new HashMap<>();


    public ProductGroup(String name, String description) {
        this.name = name;
        this.description = description;
    }



    public Map<String, Product> getAllproducts() {
        return allproducts;
    }

    public void setAllproducts(Map<String, Product> allproducts) {
        this.allproducts = allproducts;
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
}

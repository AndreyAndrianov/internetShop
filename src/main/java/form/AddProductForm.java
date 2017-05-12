package form;

import model.Warehouse;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.List;

/**
 * Created by Andrey on 27.04.2017.
 */
public class AddProductForm {

//    @NotEmpty
    private String productName;
//    @NotEmpty
    private long warehouse;
//    @NotEmpty
    private String description;
//    @NotEmpty
    private int cost;
//    @NotEmpty
    private int amount;

    public List<Warehouse> getWarehouses() {
        return warehouses;
    }

    public void setWarehouses(List<Warehouse> warehouses) {
        this.warehouses = warehouses;
    }

    private List<Warehouse> warehouses;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(long warehouse) {
        this.warehouse = warehouse;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
package InventoryTest;
import BasedTest.BaseTestAfterLogin;
import com.Testglobal.Page.Inventory.Inventory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class InventoryTest extends BaseTestAfterLogin {

    @Test
    @DisplayName("TC1-Inventory-ListProduct")
    public void inventoryList(){
        Inventory product = new Inventory(getDriver());
        product.getProductNames();
        System.out.println("SP" + product.getProductNames());
    }

    @Test
    @DisplayName("TC2-Inventory-ListProduct")
    public void sortListProduct(){
        Inventory product = new Inventory(getDriver());
        product.setSortDropdown();
    }

    @Test
    @DisplayName("TC3-Inventory - Check add to cart button")
    public void addToCart(){
        Inventory product = new Inventory(getDriver());
        product.setAddToCartButton();
    }
}

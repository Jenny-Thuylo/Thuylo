package com.Testglobal.Page.Inventory;

import com.Testglobal.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class Inventory extends BasePage {
    @FindBy(how = How.CLASS_NAME, using = "inventory_item_name")
    List<WebElement> productNames;

    @FindBy(className = "product_sort_container")
    private WebElement sortDropdown;

    @FindBy(xpath = ("//option[text()='Name (Z to A)']"))
    private WebElement option;

    @FindBy(css = ".inventory_item_name:nth-child(1)")
    private WebElement productNamAfterSort;

    @FindBy(css = ".inventory_item_price:nth-child(1)")
    private WebElement price;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCartButton;

    @FindBy(className = "shopping_cart_link")
    private WebElement cartButton;

    @FindBy(id = "checkout")
    private  WebElement checkoutButton;

    @FindBy(id = "first-name")
    private  WebElement firstNameField;

    @FindBy(id = "last-name")
    private  WebElement lastNameField;

    @FindBy(id = "postal-code")
    private  WebElement zipCodeField;

    @FindBy(id = "continue")
    private  WebElement continueButton;

    @FindBy(id = "finish")
    private  WebElement finishButton;

    @FindBy(className = "complete-header")
    private  WebElement confirmationMessage;

    public Inventory(WebDriver driver) {
        super(driver); // Khởi tạo BasePage
        PageFactory.initElements(driver, this); // Khởi tạo các element được đánh dấu @FindBy
    }
    // Get all product names
    public List<String> getProductNames() {
        List<String> names = new ArrayList<>();
        for (WebElement product : productNames) {
            names.add(product.getText());
        }
        return names;
    }

    public void setSortDropdown(){
        sortDropdown.click();
        option.click();
        productNamAfterSort.isDisplayed();
        productNamAfterSort.getText();
        System.out.println("name of product after sort Z to A: " + productNamAfterSort.getText());
        System.out.println("price of this product: " + price.getText());
    }

    public void setAddToCartButton(){
        addToCartButton.click();
        cartButton.click();
        checkoutButton.click();
        firstNameField.sendKeys("Thuy");
        lastNameField.sendKeys("Jenny");
        zipCodeField.sendKeys("a123");
        continueButton.click();
        finishButton.click();
        confirmationMessage.isDisplayed();
        confirmationMessage.equals("Thank you for your order!");
    }

}

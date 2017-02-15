package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Stepdefs {

    ShoppingCart shoppingCart;

    @Given("^I have (\\d+) items in my shoppingcart$")
    public void I_have_items_in_my_shoppingcart(int items) throws Throwable {
        shoppingCart = new ShoppingCart();
        shoppingCart.checkout(items);
    }

    @When("^I wait (\\d+) seconds$")
    public void i_wait_hour(int seconds) throws Throwable {
        Thread.sleep(seconds*1000);
    }

    @Then("^my shoppingcart should be (.*)$")
    public void my_shoppingcart_should_beready(String status) throws Throwable {
        Assert.assertEquals(shoppingCart.getStatus(), status);
    }
}

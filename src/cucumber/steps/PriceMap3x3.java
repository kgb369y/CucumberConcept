package cucumber.steps;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.steps.models.Price;

public class PriceMap3x3 {
    private Map<String, Price> priceList;
    private int sumCol;
    private int sumArg;
    
    @Given("^the price list for an international coffee shop$")
    public void the_price_list_for_an_international_coffee_shop(List<Price> prices) throws Throwable {
        priceList = new HashMap<String, Price>();
        for (Price price : prices) {
            String key = price.getProduct();
            priceList.put(key, price);
        }
    }

    @When("^I buy (\\d+) (.*) and (\\d+) (.*)$")
    public void i_buy_coffee_and_donut(int numberOfFirstItems, String firstItem,
            int numberOfSecondItems, String secondItem) throws Throwable {
        Price firstPrice = priceList.get(firstItem);
        Price secondPrice = priceList.get(secondItem);
        
        if(firstPrice.getCurrency().equals("COL")) {
            sumCol += numberOfFirstItems * firstPrice.getPrice();
        }
        if(secondPrice.getCurrency().equals("ARG")) {
            sumArg += numberOfSecondItems * secondPrice.getPrice();
        }
    }

    @Then("^should I pay (\\d+) COL and (\\d+) ARG$")
    public void should_I_pay_EUR_and_SEK(int expectedColSum, int expectedArgSum) throws Throwable {
        assertThat(sumCol, is(expectedColSum));
        assertThat(sumArg, is(expectedArgSum));
    }
}

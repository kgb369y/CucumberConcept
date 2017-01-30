package cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import org.junit.Assert;
import static org.hamcrest.CoreMatchers.is;


public class SumListOfInt {
    private List<Integer> numbers;
    private int sum;

    @Given("^a list of numbers$")
    public void a_list_of_numbers(List<Integer> numbers) throws Throwable {
        this.numbers = numbers;
    }

    @When("^I summarize them$")
    public void i_summarize_them() throws Throwable {
        for(Integer number: numbers) {
            sum += number;
        }
    }

    @Then("^should I get (\\d+)$")
    public void should_I_get(int expectedSum) throws Throwable {
        Assert.assertThat(sum, is(expectedSum));
    }

}

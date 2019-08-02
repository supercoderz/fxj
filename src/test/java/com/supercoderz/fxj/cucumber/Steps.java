package com.supercoderz.fxj.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
    @Given("An instance of FX provider")
    public void an_instance_of_FX_provider() {
    }

    @When("Requested for {}")
    public void requested_for(String pair) {
    }

    @Then("A value is returned")
    public void a_value_is_returned() {
    }

    @Then("A list of rates is returned")
    public void a_list_of_rates_is_returned() {
    }

    @Then("A list of rates is returned along with the date")
    public void a_list_of_rates_is_returned_along_with_the_date() {
    }

    @Then("An empty list is returned")
    public void an_empty_list_is_returned() {
    }

}

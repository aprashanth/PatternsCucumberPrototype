package com.patterns.intro;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by PXV8340 on 10/9/2015.
 */
public class MyStepdefs {
    @Given("^This is my first dummy given step$")
    public void This_is_my_first_dummy_given_step() throws Throwable {
        // Express the Regexp above with the code you wish you had
        System.out.println("First Step");
    }

    @When("^This is my second dummy given step$")
    public void This_is_my_second_dummy_given_step() throws Throwable {
        // Express the Regexp above with the code you wish you had
        System.out.println("Second Step");
    }

    @Then("^This is my third dummy given step$")
    public void This_is_my_third_dummy_given_step() throws Throwable {
        // Express the Regexp above with the code you wish you had
        System.out.println("Third Step");
    }
}

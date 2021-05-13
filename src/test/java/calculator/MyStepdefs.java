package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
public class MyStepdefs {
    private Calculator calculator;
    private int value1;
    private int value2;
    private int result;
    private char op;
    @Before
    public void before() {
        calculator = new Calculator();
    }
    @Given("^Two input values, (-?\\d+) and (-?\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }
    @When("^I add the two values$")
    public void iAddTheTwoValues() {
        result = calculator.add(value1, value2);
        System.out.print(result);
    }
    @Then("^I expect the result (-?\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+) and operator (/|\\^)$")
    public void twoInputValuesFirstAndSecondAndOperatorOp(int arg0, int arg1, char operation) {
        value1 = arg0;
        value2 = arg1;
        op = operation;
        System.out.print(op);
    }

    @When("^I divide/power the first value by the second value$")
    public void iDividePowerTheFirstValueByTheSecondValue() {
        if(op == '/'){
            result = calculator.divide(value1, value2);
        }
        else if(op == '^'){
            result = calculator.power(value1,value2);
        }
        System.out.print(result);
    }


}
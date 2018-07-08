package skeleton.step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import skeleton.enums.TradeStatus;
import skeleton.models.Trade;

import java.util.List;
import org.junit.Assert;


public class FxTradeStepDefs {

//    Scenario: Book an FX Trade
//    Given trades with the following details are created:
//            |buyCcy |sellCcy |amount   |date       |
//            |EUR    |USD     |12345.67 |23-11-2017 |
//            |GBP    |EUR     |67890.12 |24-11-2017 |
//    When the trades are executed
//    Then the trades are confirmed

    List<Trade> trades;

    @Given("^trades with the following details are created:$")
    public void trades_with_the_following_details_are_created(DataTable dataTable) throws Throwable {
        //do something here
//        dataTable.convert(skeleton.Trade.class, false);
        trades = dataTable.asList(Trade.class);
        trades.stream().forEach(System.out::println);
    }

    @When("^the trades are executed$")
    public void trades_are_executd() throws Throwable {
        //do something here
        trades.stream().forEach(trade -> {trade.setTradeStatus(TradeStatus.EXECUTED);});
    }

    @Then("^the trades are confirmed$")
    public void trades_are_confirmed() throws Throwable {
        //do something here
        trades.stream().map(Trade::getTradeStatus).forEach(tradeStatus -> Assert.assertEquals(tradeStatus, TradeStatus.EXECUTED));
    }
}

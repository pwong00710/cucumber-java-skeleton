$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/keithwong/Projects/cucumber-java-skeleton/src/test/resources/skeleton/fxTRade.feature");
formatter.feature({
  "name": "FxTrade",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Book an FX Trade",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "trades with the following details are created:",
  "rows": [
    {
      "cells": [
        "buyCcy",
        "sellCcy",
        "amount",
        "date"
      ]
    },
    {
      "cells": [
        "EUR",
        "USD",
        "12345.67",
        "2017-11-23"
      ]
    },
    {
      "cells": [
        "GBP",
        "EUR",
        "67890.12",
        "2017-11-24"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "FxTradeStepDefs.trades_with_the_following_details_are_created(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the trades are executed",
  "keyword": "When "
});
formatter.match({
  "location": "FxTradeStepDefs.trades_are_executd()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the trades are confirmed",
  "keyword": "Then "
});
formatter.match({
  "location": "FxTradeStepDefs.trades_are_confirmed()"
});
formatter.result({
  "status": "passed"
});
});
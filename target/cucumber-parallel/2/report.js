$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("H:/Projects/Source/home/cucumber-java-skeleton/src/test/resources/skeleton/searchWikipedia.feature");
formatter.feature({
  "name": "search Wikipedia",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Enter search term \u0027\u003csearchTerm\u003e\u0027",
  "keyword": "Given "
});
formatter.step({
  "name": "Do search",
  "keyword": "When "
});
formatter.step({
  "name": "Search results are shown for \u0027\u003cresult\u003e\u0027",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "searchTerm",
        "result"
      ]
    },
    {
      "cells": [
        "mercury",
        "Mercury usually refers to:"
      ]
    },
    {
      "cells": [
        "max",
        "Max or MAX may refer to:"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter search term \u0027mercury\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchWikipediaStepDefs.searchFor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Do search",
  "keyword": "When "
});
formatter.match({
  "location": "SearchWikipediaStepDefs.clickSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search results are shown for \u0027Mercury usually refers to:\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchWikipediaStepDefs.assertSearchResult(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter search term \u0027max\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchWikipediaStepDefs.searchFor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Do search",
  "keyword": "When "
});
formatter.match({
  "location": "SearchWikipediaStepDefs.clickSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search results are shown for \u0027Max or MAX may refer to:\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchWikipediaStepDefs.assertSearchResult(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
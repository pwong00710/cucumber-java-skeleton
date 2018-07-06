$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("H:/Projects/Source/home/cucumber-java-skeleton/src/test/resources/skeleton/belly.feature");
formatter.feature({
  "name": "Belly",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "a few cukes",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have 42 cukes in my belly",
  "keyword": "Given "
});
formatter.match({
  "location": "BellyStepDefs.I_have_cukes_in_my_belly(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I wait 1 hour",
  "keyword": "When "
});
formatter.match({
  "location": "BellyStepDefs.i_wait_hour(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "my belly should growl",
  "keyword": "Then "
});
formatter.match({
  "location": "BellyStepDefs.my_belly_should_growl()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
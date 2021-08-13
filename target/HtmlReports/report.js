$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/login.feature");
formatter.feature({
  "name": "To test Login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify the login Page with title",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "name": "open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.CommonStep.open_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Open the url \"https://www.icicibank.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.CommonStep.open_the_url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the page title",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.CommonStep.Verify_the_page_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.CommonStep.Close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});
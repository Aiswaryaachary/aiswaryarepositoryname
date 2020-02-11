$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/Cucumber.feature");
formatter.feature({
  "name": "Testing demo webshop login feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User enters Username and Password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the login page is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdev.cucumerclass.the_login_page_is_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters aiswarya@gmail.com as username",
  "keyword": "When "
});
formatter.match({
  "location": "stepdev.cucumerclass.user_enters_aiswarya_gmail_com_as_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters aish@123 as password",
  "keyword": "And "
});
formatter.match({
  "location": "stepdev.cucumerclass.user_enters_aish_as_password(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdev.cucumerclass.user_will_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "demo webshop home page appears",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdev.cucumerclass.demo_webshop_home_page_appears()"
});
formatter.result({
  "status": "passed"
});
});
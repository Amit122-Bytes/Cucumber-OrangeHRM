$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2182251699,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Sucessfully login with valid credentials",
  "description": "",
  "id": "login;sucessfully-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@simplelogin"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User opens URL \"http://hrm.testingclub.in/symfony/web/index.php/auth/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters Username as \"automation\" and Password as \"Automation@123\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Page title shoud be \"OrangeHRM\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click on Logout",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_launch_chrome_browser()"
});
formatter.result({
  "duration": 246843400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://hrm.testingclub.in/symfony/web/index.php/auth/login",
      "offset": 16
    }
  ],
  "location": "steps.user_opens_URL(String)"
});
formatter.result({
  "duration": 2257296700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "automation",
      "offset": 25
    },
    {
      "val": "Automation@123",
      "offset": 54
    }
  ],
  "location": "steps.user_enters_Username_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 282502200,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_Login()"
});
formatter.result({
  "duration": 2076465699,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "OrangeHRM",
      "offset": 21
    }
  ],
  "location": "steps.page_title_shoud_be(String)"
});
formatter.result({
  "duration": 63367900,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_Logout()"
});
formatter.result({
  "duration": 6938521800,
  "status": "passed"
});
formatter.match({
  "location": "steps.close_Browser()"
});
formatter.result({
  "duration": 666498499,
  "status": "passed"
});
formatter.uri("Personaldetails.feature");
formatter.feature({
  "line": 1,
  "name": "Personal Details",
  "description": "",
  "id": "personal-details",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1243902499,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Edit Personal Details",
  "description": "",
  "id": "personal-details;edit-personal-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@editdetails"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User opens URL \"http://hrm.testingclub.in/symfony/web/index.php/auth/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters Username as \"automation\" and Password as \"Automation@123\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User click on My Info",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Click on Edit button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User Edit details",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click on Logout",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_launch_chrome_browser()"
});
formatter.result({
  "duration": 292399,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://hrm.testingclub.in/symfony/web/index.php/auth/login",
      "offset": 16
    }
  ],
  "location": "steps.user_opens_URL(String)"
});
formatter.result({
  "duration": 2319227200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "automation",
      "offset": 25
    },
    {
      "val": "Automation@123",
      "offset": 54
    }
  ],
  "location": "steps.user_enters_Username_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 267638600,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_Login()"
});
formatter.result({
  "duration": 1990767999,
  "status": "passed"
});
formatter.match({
  "location": "steps.user_can_view_Dashboard()"
});
formatter.result({
  "duration": 2153179900,
  "status": "passed"
});
formatter.match({
  "location": "steps.user_click_on_My_Info()"
});
formatter.result({
  "duration": 3518956901,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_Edit_button()"
});
formatter.result({
  "duration": 89831700,
  "status": "passed"
});
formatter.match({
  "location": "steps.user_Edit_details()"
});
formatter.result({
  "duration": 927608300,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_Save_button()"
});
formatter.result({
  "duration": 7008028599,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_Logout()"
});
formatter.result({
  "duration": 6946745801,
  "status": "passed"
});
formatter.match({
  "location": "steps.close_Browser()"
});
formatter.result({
  "duration": 736064200,
  "status": "passed"
});
});
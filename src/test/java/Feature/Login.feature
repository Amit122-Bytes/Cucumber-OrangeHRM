Feature: Login


@simplelogin
Scenario: Sucessfully login with valid credentials
		Given user launch chrome browser
		When User opens URL "http://hrm.testingclub.in/symfony/web/index.php/auth/login"
		And User enters Username as "automation" and Password as "Automation@123"
		And Click on Login
		Then Page title shoud be "OrangeHRM"
		When click on Logout
		And Close Browser
		
@DataDriven
Scenario Outline: Login Data Driven
		Given user launch chrome browser
		When User opens URL "http://hrm.testingclub.in/symfony/web/index.php/auth/login"
		And User enters Username as "<username>" and Password as "<password>"
		And Click on Login
		Then Page title shoud be "OrangeHRM"
		When click on Logout
		And Close Browser
		
		Examples: 
				|username | password|
				|abkckkd | 12345|
				|abkck2d | 145345|
				|automation | Automation@123|
				
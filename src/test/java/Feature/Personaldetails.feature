Feature: Personal Details

@editdetails
Scenario: Edit Personal Details
		Given user launch chrome browser
		When User opens URL "http://hrm.testingclub.in/symfony/web/index.php/auth/login"
		And User enters Username as "automation" and Password as "Automation@123"
		And Click on Login
		Then User can view Dashboard
		When User click on My Info
		And Click on Edit button
		Then User Edit details
		And Click on Save button
		When click on Logout
		And Close Browser	
		
@search
Scenario: Search Customer by Name
		Given user launch chrome browser
		When User opens URL "http://hrm.testingclub.in/symfony/web/index.php/auth/login"
		And User enters Username as "automation" and Password as "Automation@123"
		And Click on Login
	    Then Click on Directory 
	    And Enter customer name
	    When Click on search button
	    Then User should found Name in the search table
	    And Close Browser
	    
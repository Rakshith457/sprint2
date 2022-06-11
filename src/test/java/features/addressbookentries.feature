Feature: edit address information
Scenario Outline: sucessfull changing password
Given initilize browser with chrome
And navigate to "http://retailm1.upskills.in/account/account" site
Then enter <email> and <password>
And click on login
Then Click on Modify adresses book entries
And Click on edit
And select Country
And Select Region/State
And click on continue
Then verify you get<Success: Your address has been successfully updated.>
And close the browser
Examples:
|username			|password	|
|test99@gmail.com	|123456		|
|test123@gmail.com	|12345      |

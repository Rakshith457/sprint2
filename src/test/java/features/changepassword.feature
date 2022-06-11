Feature: Change password
Scenario Outline: sucessfull changing password
Given initilize browser with chrome
And navigate to "http://retailm1.upskills.in/account/account" site
Then enter <email> and <password>
And click on login
Then Click on Change password
And enter <Password> and <change password>
And click on continue
Then verify you get<Success: Your password has been successfully updated.>
And close the browser





Examples:
|username			|password	|       |password| |confirm password|
|test99@gmail.com	|123456		|   |123456|   |Error@1234|
|test123@gmail.com	|12345      |12345|     |Error@12345|

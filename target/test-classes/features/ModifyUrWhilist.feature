Feature: check adresss pincode availiable
Scenario Outline: sucessfull changing password
Given initilize browser with chrome
And navigate to "http://retailm1.upskills.in/account/account" site
Then enter <email> and <password>
And click on login
Then Click on Modify  your wishlist
And Click on image
And select  and enterpincode
And verify able to continue
And close the browser
Examples:
|username			|password	|
|test99@gmail.com	|123456		|
|test123@gmail.com	|12345      |

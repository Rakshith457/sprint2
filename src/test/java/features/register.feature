Feature: Register new account
Scenario Outline: sucessfull registration with positive response
Given initilize browser with chrome
And navigate to "http://retailm1.upskills.in/account/register" site
And Click on Register link in home page to land on Register account page
And  user enters <first name>,<last name> ,<email>,<telephone> ,<address1>,<address2>,<City>,<Postal code>,<Country>,<Region> ,<state> ,<password> ,<confirm password> 
And Click on yes or no
And Click on  I have read and agree to the Privacy Policy
And Click on continue
Then verify that user sucessfully regestried the account
And close the browser

| first name |  |last name| |email| |telephone| |address1| |address2| |city| |postal code| |Country| |Region| |State| |password| |confirm password| 
|Rakshith | |H S| |hsrakshith37@gmail.com| |8088774497| ||sri lakshmi ranganatha nilaya| |Hemavathi nagara| |hassan| |573202| |India| |Karnataka| |Error@1234| |Error@1234|
Feature: Sign up Functionality of BestBuy Ecommerce Website 

Scenario: Sign Up Functionality 
	Given User select the country 
	When User click the account 
	And User click the create an account 
	And User enter the firstname <firstName> 
	And User enter the last name <lastName> 
	And User enter the email address <mailId> 
	And User enter the password <password> 
	And User enter the confirm password <confirmPassword> 
	And User enter the mobile number <mobileNumber> 
	And User click the submit 
	Then User validate the create an account successfully or not <firstName> 
	
	
	Examples: 
	|firstName| lastName| mailId                | password    | confirmPassword| mobileNumber|
	|San|       kiou    | bomaye5845@hisotyr.com| Pass@word1243| Pass@word1243   | 6785586567  |
	
	
	
	
	
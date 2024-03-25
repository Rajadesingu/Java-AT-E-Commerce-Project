Feature: Sign in Functionality of BestBuy Ecommerce Website 

Scenario: Sign In Functionality positive testcase 
	Given First user select the country 
	When First user click the  account 
	And First user click the signin 
	And First user enter the signin email address   <mailId> 
	And First user enter the signin password        <password> 
	And First user click the sign in 
	Then First user validate homePage should be displayed 
	
Scenario: Sign In Functionality positive testcase 
	Given Second user select the country 
	When Second user click the account 
	And Second user click the signin 
	And Second user enter the signin invalid email address   <invalidMailId> 
	And Second user enter the signin password        <password> 
	And Second user click the sign in 
	Then Second user validate homePage should be displayed 
	
Scenario: Sign In Functionality positive testcase 
	Given Third user select the country 
	When Third user click the account 
	And Third user click the signin 
	And Third user enter the signin email address   <mailId> 
	And Third user enter the signin Invald password        <InvalidPassword> 
	And Third user click the sign in 
	Then Third user validate homePage should be displayed 
	
Scenario: Sign In Functionality positive testcase 
	Given Fourth user select the country 
	When Fourth user click the account 
	And Fourth user click the signin 
	And Fourth user enter the signin email address   <mailId> 
	And Fourth user enter the signin Invald password        <InvalidPassword> 
	And Fourth user click the sign in 
	Then Fourth user validate homePage should be displayed 
	
	
	Examples: 
	|mailId                | password|
	|bomaye5845@hisotyr.com| Jack!123|
	
	Examples: 
	|InvalidMailId                | password|
	|bomaye584| Jack!123|
	
	Examples: 
	|mailId                | InvalidPassword|
	|bomaye5845@hisotyr.com| Ja123|
	
	Examples: 
	|InvalidMailId                | InvalidPassword|
	|bomaye5845| Jack23|
	
	
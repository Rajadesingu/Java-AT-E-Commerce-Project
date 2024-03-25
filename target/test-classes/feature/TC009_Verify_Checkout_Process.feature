Feature: Checkout Process 

Scenario: 
	Navigate to the checkout page and fill out the form with dummy payment information 
	Given Launch the URL for checkout 
	When Add item to shopping cart 
	And Go to checkout page 
	And Fil the Contact information "<mailId>"  "<mobileNumber>"
	And Fill the payment imformation  "<cardNumber>"  "<firstName>"  "<lstName>"  "<address>"  "<city>"  "<state>"  "<zipcode>"
	Then Validate the order confirmation message 
	
	
	Examples: 
	|mailId|mobileNumber|cardNumber|firstName|lastName|address|city|state|zipcode|
	|tomnic@fmial.com|7867565434|6756 7876 567876|Tomnic|Kio|America|los|Alabama|87987|
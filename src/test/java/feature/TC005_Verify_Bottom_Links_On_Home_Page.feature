Feature: Validate bottom links on Best Buy homepage 

Scenario: Verify the presence of important bottom links 
	Given Launch the URL for bottom link 
	When Navigate the bottom link 
	Then Validate the accessibility link 
	And Validate the terms&conditions link 
	And Validate the privacy link 
	And Validate the interestbasedads link 
	
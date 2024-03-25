Feature: Navigation and title validation on Best Buy website

Scenario: Navigate through all menus and validate title
    Given Launch the URL link
    When Navigate through each menu
    Then Validate the title on each page
    And Validate the topdeal menu
    And Validate the dealoftheday menu
    And Validate the yesbestbuysellsthat menu
    And Validate the mybestbuymemberships menu
    And Validate the creditcard menu
    And Validate the moregiftcards menu
    And Validate the moregiftideas menu
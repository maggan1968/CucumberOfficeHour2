
  Feature: Google search functionality
    User Story: As a user, when I am on the google search page,
    I should be able to search whatever I want, and see relevant information.

    @googleSearch
    Scenario: User search title verification
      Given user is on google home page
      When user searches SDET
      Then user should see SDET in title

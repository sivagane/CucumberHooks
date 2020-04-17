Feature: Testing CrmPro Application
  @First
  Scenario: ContactsPage
    Given User Clicks on Contacts Page
    When User Enters Contacts Details
    Then Contact is Created
@Second
  Scenario: DealsPage
    Given User Clicks on Deals Page
    When User Enters Deals Deatils
    Then Deal is Created
@Third
  Scenario Outline: Tasks Page
    Given User Clicks on Tasks Page
    When User enters Title <Title> and Completion Percentage <Completion>
    Then User Clicks on Save button

    Examples: 
      | Title    | Completion |
      | NewTask1 |         50 |
      | NewTask2 |         70 |

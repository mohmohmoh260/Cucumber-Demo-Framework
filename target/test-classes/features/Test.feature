@RunTest
Feature: Google Search "covid-19 in Malaysia"

  @Test1
  Scenario: Verify Top stories section is available
    Given launch the browser and navigate to "https://www.google.com/"
    And search "covid 19 in Malaysia"
    Then verify Top stories section

  @Test2
  Scenario: Verify Statistic section is available
    Given launch the browser and navigate to "https://www.google.com/"
    And search "covid 19 in Malaysia"
    Then verify Statistic section is displayed

  @Test3
  Scenario: User Navigate to MOH website
    Given launch the browser and navigate to "https://www.google.com/"
    And search "covid 19 in Malaysia"
    Then verify MOH website link is available
    When click MOH link
    Then verify MOH landing page is displayed

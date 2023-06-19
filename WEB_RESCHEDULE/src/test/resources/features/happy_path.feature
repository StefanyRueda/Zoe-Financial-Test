#Author: Stefany Rueda

Feature: Rschedule a meet

  Background: The user access
    Given the user accesses to the reschedule interface from the link
    When the user select an avalible date and an avalible time option

  Scenario: The user wants reschedule a meeting with his/her advisor
    And ends the reschedule process
    Then the user should see the confirm message



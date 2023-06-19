#Author: Stefany Rueda

Feature: Usage of the time zone option in the same attempt of reschedule

Scenario Outline: The user wants reschedule a meeting with his/her advisor with time zone changes.
  Given the user accesses to the reschedule interface from the link
  When the user select an avalible date and an avalible time option
  And change the <time zone>
  Then the user should see selected the time that selected previously homologated to the new time zone

Examples:
|time zone           |
|Central Time      |
|Eastern Time      |
|Mountain Time |
|Pacific Time       |

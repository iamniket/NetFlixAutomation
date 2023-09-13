Feature: Video Playback Automation with login

  Scenario Outline: As a User I login and Play and Pause Video
    Given I am on NetFlix Login page
    When I enter the valid <username> and <password>
    Then I can able to login successfully
    Then I as User can Able to search for a <Series>
    And I as user Able to go to detail page from the search result
    Then I as user can able to play the video

    Examples:
      | username               | password  | Series       |
      | niketpatil20@gmail.com | Niket@123 | Breaking Bad |
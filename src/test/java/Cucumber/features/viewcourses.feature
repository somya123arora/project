Feature:View courses
Scenario Outline: ine :To check that the user is able to view all the courses
  Given user is on the Home Page
  When User Navigate to LogIn Page
  And user enters login details
    |USERNAME |PASSWORD |
  Then he is successfully able to login into his account
  And user can select the <coursetype> from the searchbar
    |coursetype |
  Then he is successfully able to view the course contents

Examples:
  |USERNAME                 |PASSWORD  |coursetype |
  |somyaoct1993@gmail.com   | somi123  |AAPLITOOLS |


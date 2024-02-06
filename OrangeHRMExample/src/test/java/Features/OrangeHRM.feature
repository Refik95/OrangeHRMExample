@OrangeHRM
  Feature:  OrangeHRM Example Test Cases

    @AllEmpty
    Scenario: Empty Username & Empty Password
      Given User at login page
      When Click login button
      Then Check Required message about Username and Password

    @FalseLogin
      Scenario:  False Username & False Password
        Given User at login page
        When Type Username and Password
        When Click login button
        Then Check Invalid credentials message about login

    @TrueLogin
        Scenario: True Username & True Password
          Given User at login page
          When Type True Username and Password
          When Click login button
          Then Check Successfull Login

    @ChangeName
      Scenario: Change Employee Full Name
      Given User at login page
      When Type True Username and Password
      When Click login button
      When Click to My Info Button
      When Change First Name, Middle Name and Last Name
      When Click to Save Button
      Then Check New Name, Middle Name and Last Name
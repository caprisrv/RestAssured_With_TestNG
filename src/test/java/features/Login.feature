Feature: Application Login

Scenario: Home pagedefault login with user saurabh
Given User is on netbanking landing page
When User login in to application with "saurabh" username and password "test123"
Then Home page is displayed
And Cards are displayed "true"

Scenario: Home pagedefault login with user yuvaan
Given User is on netbanking landing page
When User login in to application with "yuvaan" username and password "test124"
Then Home page is displayed
And Cards are displayed "false"
Feature: MyAccount

Scenario Outline: Verify MyAccount page is opening when clicking on Login
Given Navigating to the website 
And Login with <username> and <password>
When Click on MyAccount
Then Navigate to MyAccount page

Examples:
|username			|password	|
|abhignya7@gmail.com	|Abhignya123	|
|abhignya7@gmail.com| abc|
|abc|Abhignya123|
|abc|xyz|	
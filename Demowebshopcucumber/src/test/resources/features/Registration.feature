Feature:Registeration functionality for Demowebshop
@Abc
Scenario:Registration check
Given User navigate to DemowebshopRegistration
When User click on Gender male
And User enters Firstname as "Roshan"
And User enters Lastname as "Aware"
And User enters email as "Rosh@gmail.com"
And User enters password "Roshan8007"
And User enters Conform password "Roshan8007"
And User clicks on Register Button
Then User Complete Registration
@Def
Scenario:Add to Cart 
Given User navigate to Books
And Click on book of his choice
And Click on addtocart
And User navigate to cart
And User accept Terms of policy
And User clicks on Checkout
And User clicks on checkoutasGuest
@Ghi
Scenario:Billing address
Given User enters firstname as "Roshan"
And User enters lasname as "Aware"
And User enters Email as "Rosh@gmail.com" 
And User enters name of the Company as "Tcs"
And User Select country as "India"
And User select State as "0"
And User enters City as "Amravati"
And User enters address1 as "Pune"
And User enters address2 as "Mumbai"
And User enters zip/postal code as "444806"
And User enters Phone number as "8007192247"
And User enters Fax as "444809"
And User Clicks on Continue
@Jkl
Scenario:Shipping address
Given user clicks on continue second time
And user clicks on continue third time
And user clicks on coninue fourth time
And user clicks on continue fifth time
And user clicks on continue sixth time

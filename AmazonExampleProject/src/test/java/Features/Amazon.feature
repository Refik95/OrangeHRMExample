Feature: Amazon.com

  Scenario: Amazon.com Adding Product
    Given User is on homepage
    When  User clicks accept cookies
    When User click search bar
    When User types the product name
    When User clicks search button
    When User filters Shipped by Amazon
    When User filters for Apple
    When User clikcs the first product
    When User adds product to Cart
    When User checks product is at Cart page
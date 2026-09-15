# Dominos Website - E2E Test Automation

## Overview
Selenium + Java automation script that simulates an end-to-end user journey 
on the Dominos India website — from landing page to adding a delivery address.

## Flow Covered
1. Launch website & handle popups (skip promo, notification permissions)
2. Select delivery order type
3. Search & select delivery location
4. Confirm address
5. Browse & add products to cart (Chicken Burst, Chicken Maxxx BBQ, Coca Cola)
6. Go to cart → Add new delivery address (building no, name, mobile number)
7. Save address

## Tech Stack
- Java
- Selenium WebDriver
- ChromeDriver

## Techniques Used
- Explicit Waits (WebDriverWait + ExpectedConditions)
- JavaScript Executor (for elements not directly clickable)
- Dynamic XPath locators

## Next Steps / Improvements
- Refactor into Page Object Model (POM) for maintainability
- Add TestNG for assertions and structured test reporting
- Replace Thread.sleep() with more explicit waits throughout

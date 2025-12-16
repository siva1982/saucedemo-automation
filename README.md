# saucedemo-automation

SauceDemo Automation Framework
Overview

This project is a Java + Selenium automation framework built to validate core user journeys on the SauceDemo application.
The framework follows industry best practices with a focus on maintainability, clarity, and business-driven test logic.

The primary objective of this exercise is to identify and add the highest-priced product to the cart without using the UI sort functionality, demonstrating data-driven validation rather than UI dependency.

Technology Stack

Java 11

Selenium WebDriver 4

TestNG

Maven

Allure Reporting

Page Object Model (POM)


## Framework Design Approach

Page Object Model to separate UI logic from test logic

Reusable base setup for WebDriver lifecycle management

Dynamic data handling for price comparison

Explicit, readable test steps

Lightweight design suitable for small to medium test suites

This approach avoids over-engineering while remaining scalable.

Test Scenario Covered
Add Highest Priced Item to Cart

Launch SauceDemo application

Login using valid credentials

Retrieve all product prices dynamically

Identify the highest-priced product without using sorting

Add the product to the cart

## Running the Tests Prerequisites

Java 11 or higher

Maven installed

Google Chrome browser

Note: Selenium Manager is used, so no local ChromeDriver setup is required.

## Execute Tests
mvn clean test

Allure Interactive Report
Generate and View Report
mvn allure:serve


This will generate an interactive report containing:

Test execution summary

Step-by-step execution details

Failure stack traces (if any)

Execution timeline and statistics

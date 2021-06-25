# unitConverter
Java Project

Project A: Unit Converter Application

Introduction
In this Java module, you will design a menu-driven console application that will let users convert between one type of unit and another.

Instructions
In Eclipse, create a new Java Project named "UnitConverter"
In the UnitConverter project, create a package named "main"
Inside the main package, create a class named Converter, which has a main(String[]) method.
Inside this main(String[]) method, your code should follow this pattern:

Create an int variable named menuSelection
Inside a while loop, with the condition menuSelection != /*last menu option */
Using System.out.println(), print a menu with numbered options. For example (please feel free to choose your own conversions):
Please select an option:
1. Cups to Teaspoons
2. Miles to Kilometers
3. US Gallons to Imperial Gallons
4. Quiz

Use a Scanner object to collect the user's menuSelection
switch on the selection to collect the user's quanity of the first unit, convert to the second unit, and print the output.

And that's basically it! But from here, there are a lot of improvements you could make...

Break the input collection to a seaprate method
private static double collectQuantity(String unit1, String unit2) { ... }
Break each unit conversion to a separate method
public double convertCelsiusToFarenheit(double qty) { ... }

Instead of the user selecting their conversion directly from the first menu, have two layers of menus:
Volume conversions
Teaspoons to Tablespoons
Teaspoons to Cups
...
Distance conversions
Feet to Meters
Miles to Kilometers
...
...
Quit
Create a **PUBLIC** repository on GitHub.com and push your project there.

When you're done, send your Trainer the link to your github.

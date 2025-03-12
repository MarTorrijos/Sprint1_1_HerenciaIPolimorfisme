# Sprint 1 - Tasca 1: Herencia i polimorfisme

## Summary

The repository is a collection of Java programming exercises that cover key concepts such as object-oriented programming, collections, and best practices, with a tiered structure that helps build hands-on skills through the application of theoretical knowledge.

### Technologies Used

Java 23

***


## Level 1

EXERCISE 1: Musical instruments

A music group has various instruments, each with a name, price, and a "play" method. When played, each instrument displays a unique message. The class loading process in Java occurs only once, and initialization blocks and static blocks are also used.

EXERCISE 2: Car Class

Create a "Car" class with attributes: brand, model, and power. The brand is static and final, the model is static, and the power is final. Add two methods: a static "brake" method and a non-static "accelerate" method. The "accelerate" method displays "The vehicle is accelerating" and the "brake" method displays "The vehicle is braking". Demonstrate how to invoke these methods from the main class.

*** 


## Level 2

EXERCISE 1: Smartphone

Create a "Phone" class with brand, model, and a call() method. Then, create "Camera" and "Clock" interfaces with photograph() and alarm() methods, respectively. Create a "Smartphone" class that extends "Phone" and implements both interfaces. The methods should print messages when called. In main(), create a Smartphone object and call the methods.

***


## Level 3:

EXERCISE 1

In a sports news system, news is categorized by sport (football, basketball, tennis, F1, and motocross). Each reporter has a name, ID (which can't change), and salary (currently €1500). Reporters can work on multiple news stories, each with a title, text (initially empty), score, and price.

For each sport, specific details are required:

- Football: competition, club, and player.
- Basketball: competition and club.
- Tennis: competition and players.
- F1: team.
- MotoGP: team.

News is sold to various outlets, with a method to calculate the price based on the story's content. Each story has its own price and score depending on its subject.

***


## How to run it
Clone the repository or download the zip file, then open it in your preferred IDE.

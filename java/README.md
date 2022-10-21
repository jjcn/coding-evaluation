# Coding evaluation
Your goal is to make this project functional by completing the `hire()` method in the `Organization` class. You are free to change existing code or add additonal code, with the exception of `MyOrganization.java`. This file must not be changed.

## Running the project
This project should be run on a Java 11 or later JVM. It can be compiled and run in your favorite IDE or by using the command line instructions below.

Compile the project by running:

    javac com/aa/act/interview/org/*.java

The `MyOrganization` class has a `main()` method, so the project can be run with:

    java com.aa.act.interview.org.MyOrganization

## Additions
- A `findPosition` method is added in the class `Organization` to find a position in the position tree.
- An overloaded `Employee` constructor that auto-generates an auto-increment identifier.
- Null check and blank check in `hire` method.
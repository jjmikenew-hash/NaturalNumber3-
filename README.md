NaturalNumber3

Overview

NaturalNumber3 is a Java implementation of the NaturalNumber interface, extending NaturalNumberSecondary. It represents a non-negative integer (a natural number) using a String as its underlying data structure.

This class provides a robust way to handle arbitrarily large natural numbers that exceed the capacity of standard primitive types like int or long, while offering standard mathematical and manipulation kernel methods.

Authors: Jacob Newman and Liam Mchale

Implementation Details

Internal Representation

The natural number is represented internally by a private String variable named rep.

Convention & Correspondence

To ensure the integrity of the data structure, the class adheres to the following conventions:

All characters within the rep string are digits '0' through '9'.

The rep string does not start with the character '0'.

An empty string "" mathematically represents the value 0. Otherwise, the value is the decimal number formed by the string.

Features and Methods

Constructors

The class provides flexible ways to instantiate a new NaturalNumber3 object:

NaturalNumber3(): No-argument constructor. Initializes the number to 0.

NaturalNumber3(int i): Initializes the number from an integer (must be >= 0).

NaturalNumber3(String s): Initializes the number from a String representation of a natural number.

NaturalNumber3(NaturalNumber n): Copy constructor that initializes from another NaturalNumber instance.

Kernel Methods

The core operations defined by this kernel implementation include:

multiplyBy10(int k): Multiplies this by 10 and adds k (where 0 <= k < 10). Conceptually, this appends the digit k to the end of the string representation.

divideBy10(): Divides this by 10, updating this to the quotient and returning the remainder. Conceptually, this removes and returns the last digit of the string representation.

isZero(): Evaluates whether this is equal to 0 (checks if the internal string is empty).

Standard Methods

newInstance(): Creates and returns a new object of the same dynamic type as this, initialized to 0.

clear(): Resets the value of this to 0.

transferFrom(NaturalNumber source): Efficiently transfers the value from a source object to this, leaving the source as 0.

Dependencies

This class is part of a larger component framework and requires the following interfaces/classes to be present in your project:

components.naturalnumber.NaturalNumber

components.naturalnumber.NaturalNumberSecondary

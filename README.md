# FooBarQix
<img src="https://app.travis-ci.com/hboufaied/FooBarQix.svg?branch=main" alt="Build Status" />


## Statement
You should implement a function String compute(String) which implements the following rules.

### Step 1

Write a program that prints numbers from 1 to 100, one number per line. For each printed number, use the following rules:

1. if the number is divisible by 3 or contains 3, replace 3 by "Foo";
2. if the number is divisible by 5 or contains 5, replace 5 by "Bar";
3. if the number is devisible by 7 or contains 7, replace 7 by "Qix".`

Example: 1 2 FooFoo 4 BarBar Foo QixQix 8 Foo Bar

More details:

* Divisors have high precedence, ex: 51 -> FooBar
* The content is analysed in the order they appear, ex: 53 -> BarFoo
* 13 contains 3 so we print "Foo"
* 15 is divisible by 3 and 5 and contains 5, so we print “FooBarBar”
* 33 contains 3 two times and is divisible by 3, so we print “FooFooFoo”

### Step 2
We have a new business request: we must keep a trace of 0 in numbers, each 0 must be replaced by char “*“.

Examples
* 101   => 1*1
* 303   => FooFoo*Foo
* 105   => FooBarQix*Bar
* 10101 => FooQix**

## Implementation

### Environment
Was developed and tested with:
- Maven 3.8.3
- Eclipse IDE 2021‑09
- JDK 11
- Git

### Solution
For each number passed to the compute method, we must check if this number is divisible by 3, 5 and 7 and in each case we replace the number with the string that corresponds (3 => Foo, 5 => Bar, 7 => Qix)

After we convert the number into a string, we go through each character to replace 3, 5 and 7 by "Foo", "Bar" and "Qix"

To compute the entry number for all possibles rules that can be added already, I use a class Rule, this call is initialized with a number to check (for division and contains check) and the replacement string.

For Step 2, we need to keep only the character '0', at the end we method replace("0", "*") to replace all existing 0 with *.

### Code Refactoring
In order to make our code more clear and apply the SRP, we create a concrete class for ContainsRule and DivideRule with a method apply() to compute and substitue the initialNumber according to rules param.
Then the client can use the class ComputingRuleComposite to compute his number by adding one or more computingRule.

For this part, I used the composite pattern : https://refactoring.guru/design-patterns/composite

## Run

To run and test the kata, you can checkout the git project and run the maven command

```
git clone https://github.com/hboufaied/FooBarQix.git
```

```
mvn clean test
```
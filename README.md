Internship Tasks Repository

Welcome to my Internship Tasks Repository!
This repository contains all the tasks assigned to me during my internship, including source code, documentation, and explanations.

Task 1: Number Guessing Game 

Description:
A simple console-based Java game where the computer generates a random number, and the player has to guess it within limited attempts.
The game provides hints like “Too High”, “Too Low”, “A Bit High”, and “A Bit Low”, depending on how close the guess is.
Players earn scores based on how quickly they guess the number, and can choose to play multiple rounds.

Features:

Random number generation (1–100)

5 attempts per round

Hints for close/far guesses

Cumulative scoring system

Option to play again

Clean and user-friendly console interaction

Technologies Used:

Java

Scanner (for user input)

Math.random() (for random number generation)

Sample Output:

Welcome to the Number Guessing Game!
A random number between 1 and 100 has been generated!
You have 5 attempts to guess it.
Enter your guess: 45
A bit low! Try again.
Enter your guess: 68
Too high! Try again.
Enter your guess: 59
🎉 Correct! You guessed it in 3 attempts!
Your total score: 30
Do you want to play again? (yes/no)


File: NumberGame.java

Task 2: Student Grade Calculator

Description:
A simple program that calculates a student’s total marks, average percentage, and grade based on marks entered for each subject.

Features:

Takes user input for number of subjects and marks (out of 100)

Calculates total and average percentage

Assigns grades based on performance

Displays results in a clear format

Grade Criteria:

Average %	Grade
90–100	O
80–89	A
70–79	B
60–69	C
50–59	D
40–49	E
Below 40	F

File:
StudentGradeCalc.java

Task 3 : ATM Interface

Description

This project is a simple ATM Interface built in Java. It allows users to perform basic banking operations such as checking balance, depositing money, and withdrawing funds through a console-based menu system.

Features

Check Balance: Displays the current account balance.

Deposit: Allows users to deposit a valid amount into their account.

Withdraw: Enables users to withdraw funds if they have sufficient balance.

Exit: Ends the program gracefully.

Input Validation: Prevents invalid transactions such as negative deposits or withdrawals exceeding available balance.

Concepts Used

Classes and Methods

Conditional Statements (if-else)

Loops (while, switch)

Static Variables and Methods

User Input Handling using Scanner

Code Overview

The program maintains a static balance and provides an interactive menu for the user. Each action is handled by a separate method:

checkBalance() → Returns the current balance.

deposit(amount) → Adds the entered amount to the balance if it’s valid.

withdraw(amount) → Deducts the amount if sufficient funds are available.

Sample Output
-----------------------------
ATM Menu:
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Please select an option (1-4): 1
Your current balance is: Rs1000.0

-----------------------------
ATM Menu:
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Please select an option (1-4): 2
Enter amount to deposit: Rs500
Deposit successful. Your new balance is: Rs1500.0

-----------------------------
ATM Menu:
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Please select an option (1-4): 3
Enter amount to withdraw: Rs200
Withdrawal successful. Your new balance is: Rs1300.0

File : 
AtmInterface.java

How to Run:

Clone this repository

git clone https://github.com/Harshitkulkarni8055/CodSoft.git


Navigate to the project folder

cd CodSoft


Compile and run the Java file

javac NumberGame.java
java NumberGame

Author :

Harshit Kulkarni
📍 Hyderabad, India
💼 Intern | Computer Science Engineer
🚀 Passionate about Java, AI/ML, and Full Stack Development

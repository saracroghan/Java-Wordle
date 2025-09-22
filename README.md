# Java Wordle Game 

A simple, command-line implementation of the popular word-guessing game, Wordle, built in Java.

## Description

This project is a console-based game where the player has six attempts to guess a randomly selected five-letter word. After each guess, the game provides feedback using emojis, indicating which letters are correct and in the right position, correct but in the wrong position, or not in the word at all.

[Image of a command-line Wordle game in action]

---

## Features

* **Random Word Selection**: The game randomly picks a word from a predefined list in `words.txt`.
* **Turn-Based Gameplay**: Players have up to six chances to guess the word.
* **Input Validation**: Checks if the guessed word has the correct length.
* **Emoji Feedback**:
    * `✔️` - The letter is correct and in the correct position.
    * `🟨` - The letter is in the word but in the wrong position.
    * `❌` - The letter is not in the word.
* **Game Over States**: The game ends when the player either guesses the word correctly or runs out of attempts, revealing the word if they failed.

---

## 🚀 Getting Started

### Prerequisites

* Java Development Kit (JDK) installed on your system.
* A text file named `words.txt` containing a list of five-letter words (one per line) in all uppercase letters.

### How to Run

1.  **Place Files**: Ensure `Wordle.java`, `WordleDemo.java`, and `words.txt` are all in the same directory.

2.  **Compile the Code**: Open a terminal or command prompt in the project directory and compile the Java files.
    ```bash
    javac WordleDemo.java Wordle.java
    ```

3.  **Run the Game**: Execute the main class to start playing.
    ```bash
    java WordleDemo
    ```
4.  **Play**: Follow the on-screen prompts to enter your guesses.

    [Image of the terminal showing the "Enter your guess:" prompt]

---

## Code Overview

### `Wordle.java`

This file contains the core logic for the game.

* `Wordle()`: The constructor initializes the game state, including the word bank array and guess tally.
* `getWordBank()`: Reads words line-by-line from `words.txt` and populates the `word_bank` array.
* `getWord()`: Selects a single random word from the `word_bank` to be the secret word for the current game.
* `simulate()`: This is the main game loop. It handles player input, compares the guess against the secret word, provides feedback, and checks for win/loss conditions using recursion.

### `WordleDemo.java`

This is the driver class for the project.

* `main(String[] args)`: The entry point of the application. It creates an instance of the `Wordle` class and calls the methods in the correct sequence to start the game.

### `words.txt`

This file is the source for the game's words. It must be present in the same directory as the `.java` files.

* **Format**: One five-letter, uppercase

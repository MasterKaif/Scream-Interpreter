# SCREAM Interpreter (Java)

The SCREAM Interpreter is an implementation of the SCREAM programming language in Java. It utilizes various Java functionalities, such as inheritance, abstraction, file I/O, and interfaces, to provide an efficient and powerful interpreter for SCREAM programs.

## Table of Contents

- [Description](#description)
- [Installation](#installation)
- [Usage](#usage)
- [Features](#features)
- [Contributing](#contributing)
- [License](#license)

## Description

The SCREAM Interpreter is a Java program that takes a SCREAM program file as input, interprets the code, and executes it line by line. It incorporates object-oriented programming concepts like inheritance and abstraction to provide a modular and extensible interpreter for the SCREAM language. The interpreter supports various language features and provides error handling for invalid SCREAM programs.

## Installation

1. Clone the project repository: `git clone https://github.com/MasterKaif/Scream-Compiler.git`
2. Navigate to the project directory: `cd Scream/src/`
3. Compile the Java source files: `javac Scream/*.java`

## Usage

To use the SCREAM Interpreter, you have two options:

**Option 1: Run in Terminal**
1. Compile theAll files of Scream module : `javac Scream/*.java`
2. Run the compiled Scream main file: `java Scream/Scream`
3. This will start the SCREAM interpreter in the terminal. You can now execute statements and expressions directly in the terminal.

**Option 2: Run with a File**
1. Compile theAll files of Scream module : `javac Scream/*.java`
2. Run the compiled program with a file path argument: `java Scream/Scream [filepath]`
    - Replace `[filepath]` with the path to your SCREAM program file.
    - Note that the file does not have to have a specific extension. It can be any file containing SCREAM code.
    - For example, you can use the provided test file: `java Scream/Scream test.scream`

By following either option, you can execute SCREAM programs and interact with the interpreter.

## Features

The SCREAM Interpreter implemented in Java provides the following language features:

- Evaluation of constant expressions (numbers, strings, booleans)
- Array expressions and operations (creation, indexing, appending, subarrays) // -- TODO
- Variable expressions and assignment
- Composite expressions (arithmetic operations, comparison operators, logical operators)
- Function expressions and definitions
- Control flow statements (if-else, while)
- Built-in functions (PRINT, LEN, APPEND, SUBARRAY)

The interpreter leverages Java's object-oriented capabilities to create classes and interfaces representing the various language elements, making it modular and extensible.


## Contributing

Contributions to the SCREAM Interpreter project are welcome! If you find any bugs, have suggestions for improvements, or want to contribute new features, please follow these steps:

1. Fork the repository.
2. Create a new branch for your contribution: `git checkout -b feature-name`.
3. Make your changes and commit them: `git commit -m 'Add feature'`.
4. Push the changes to your fork: `git push origin feature-name`.
5. Opena pull request in the main repository.

Please ensure that your contributions adhere to the project's coding conventions, include appropriate tests, and follow best practices.

## License

The SCREAM Interpreter is licensed under the [MIT License](https://opensource.org/licenses/MIT). Refer to the `LICENSE` file for more information.
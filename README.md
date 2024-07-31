# Simple Calculator Application

This project is a simple calculator application built using Java Swing. It allows users to perform basic arithmetic operations including addition, subtraction, multiplication, and division. The application features a graphical user interface (GUI) for user interaction.

## Features

- **Addition**
- **Subtraction**
- **Multiplication**
- **Division**

## How to Use

1. **Input Operands**: Enter the first and second numbers in the provided text fields.
2. **Select Operation**: Choose the type of operation (Summation, Subtraction, Multiply, Division) from the dropdown menu.
3. **Calculate**: Click the "CALCULATE" button to perform the operation and display the result.
4. **Error Handling**: If the input is not valid (e.g., non-integer values) or if there is an attempt to divide by zero, an error message will be displayed in the error area.

## Installation and Setup

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/calculator-app.git
    cd calculator-app
    ```

2. **Compile the Java code**:
    ```bash
    javac CalculatorApp.java
    ```

3. **Run the application**:
    ```bash
    java CalculatorApp
    ```

## Code Overview

- **`CalculatorApp`**: Main class that sets up the GUI and handles user interactions.
  - **Components**:
    - `JComboBox<String> selectionOfOperations`: Dropdown menu for selecting arithmetic operations.
    - `JLabel operandLabel1, operandLabel2, kindOfLabel, labelOfResult, labelOfOperator`: Labels for displaying instructions and results.
    - `JTextArea errorArea`: Text area for displaying error messages.
    - `JTextField firstOperand, secondOperand`: Text fields for user input.
    - `JButton KEY`: Button to trigger the calculation.
    - `JFrame SHAPE`: Main window frame.
    - `JPanel PANO`: Panel to hold the components.
  - **Event Listeners**:
    - `ComboActionListener`: Handles actions on the dropdown menu (currently not used for any specific action).
    - `MyButtonActionListener`: Handles the calculation logic when the "CALCULATE" button is pressed.

## Example

1. Enter `10` in the "First Number" field.
2. Enter `5` in the "Second Number" field.
3. Select `Summation` from the dropdown menu.
4. Click `CALCULATE`.
5. The result `15` will be displayed, and the input fields will be cleared.

## Contributing

If you'd like to contribute to this project, please fork the repository and use a feature branch. Pull requests are welcome.



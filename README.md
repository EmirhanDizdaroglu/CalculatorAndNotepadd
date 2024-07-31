### Calculator and Notepad Application
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

# Notepad Application
The Notepad application is a simple text editor built using Java Swing. It allows users to open and save text files. The application provides basic functionality for viewing and editing text files through a graphical user interface (GUI).

##Features
Open File: Allows users to open and read text files from their filesystem.
Save File: Allows users to save the current content of the text area to a text file.

## How to Use

1- Open File:
Click the "OPEN" button to open a file chooser dialog.
Select a text file (.txt) from your filesystem.
The content of the selected file will be displayed in the text area.

2- Save File:
Click the "SAVE" button to open a file save dialog.
Choose the location and name for the text file.
The current content of the text area will be saved to the specified file.
Installation and Setup

3- Clone the repository:
bash
git clone https://github.com/yourusername/calculator-and-notepad.git
cd calculator-and-notepad

4- Compile the Java code:
bash
javac NotepadApp.java

5- Run the application:
bash
java NotepadApp
Code Overview

## NotepadApp: Main class that sets up the GUI and handles user interactions.
Components:

- `JFrame SHAPE`: Main window frame.
- `JPanel PANO`: Panel to hold the components.
- `JTextArea NOTEPAD`: Text area for displaying and editing text.
- `JButton KEY`: Button to open files.
- `JButton KEY2`: Button to save files.
- `JScrollPane`: Scroll pane for the text area to handle large text content.

Event Listeners:
ButtonOneActionListener: Handles the file opening logic when the "OPEN" button is pressed.
ButtonTwoActionListener: Handles the file saving logic when the "SAVE" button is pressed.
## Example:
Click OPEN to select a text file.
The content of the file will be loaded and displayed in the text area.
Edit the text as needed.
Click SAVE to save the changes to a new or existing text file.


# PassGenerator
 Program Documentation: "Password Generator"

This Java Swing GUI application generates a random alphanumeric string of a desired length. The user can input the length of the desired string and click the "Generuj" (Generate) button to generate a new random string. The generated string will be displayed in a label on the GUI.

The application consists of a single class:

MainGUI: The main class that creates and sets up the graphical user interface. It contains the following components:

JFrame: The main window of the application.

JTextField: A text field for the user to input the desired length of the alphanumeric string.

JLabel: A label to display the generated alphanumeric string.

JButton: A button to trigger the generation of the alphanumeric string.

ActionListener: An interface to handle the action of clicking the generate button.

The MainGUI class has a constructor that sets up the GUI components and adds them to the frame. The actionPerformed method handles the action of clicking the generate button by getting the user input from the text field, generating an alphanumeric string of the desired length using the Main.getAlphaNumericString(n) method, and updating the output label with the generated string.

The Main class contains the getAlphaNumericString method, which generates a random alphanumeric string of a specified length. It uses a StringBuilder to build the string and a Random object to generate random characters.

To use the application, simply run the program and enter the desired length of the alphanumeric string in the text field. Click the "Generuj" button to generate a new random string. The generated string will be displayed in the label below the text field.
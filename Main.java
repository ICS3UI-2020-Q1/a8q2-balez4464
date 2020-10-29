import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  

  JLabel firstNumberLabel;
  JLabel secondNumberLabel;
  JLabel resultLabel;

  JTextField firstInput;
  JTextField secondInput;
  JTextField result;

  JButton addButton;
  JButton minusButton;
  JButton multiplyButton;
  JButton divideButton;

  JPanel mainPanel;
  


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Simple Calculator");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);

    //creates panel and adds panel to frame
    mainPanel = new JPanel();
    mainPanel.setLayout(null);
    frame.add(mainPanel);

    //creates labels and setsbounds
    firstNumberLabel = new JLabel("First Number");
    firstNumberLabel.setBounds(150, 50, 150, 30);
    secondNumberLabel = new JLabel("Second Number");
    secondNumberLabel.setBounds(150, 80, 150, 30);
    resultLabel = new JLabel("Result");
    resultLabel.setBounds(150, 110, 150, 30);

    //makes labels setVisible
    mainPanel.add(firstNumberLabel);
    mainPanel.add(secondNumberLabel);
    mainPanel.add(resultLabel);


    //creates text fields and sets bounds
    firstInput = new JTextField("");
    firstInput.setBounds(450, 50, 200, 25);
    secondInput = new JTextField("");
    secondInput.setBounds(450, 80, 200, 25);
    result = new JTextField("");
    result.setBounds(450, 110, 200, 25);

    //makes text fileds setVisible
    mainPanel.add(firstInput);
    mainPanel.add(secondInput);
    mainPanel.add(result);

    //creates buttons and sets bounds
    addButton = new JButton("Add");
    addButton.setBounds(150, 185, 80, 30);
    minusButton = new JButton("Sub");
    minusButton.setBounds(250, 185, 80, 30);
    multiplyButton = new JButton("Mul");
    multiplyButton.setBounds(350, 185, 80, 30);
    divideButton = new JButton("Div");
    divideButton.setBounds(450, 185, 80, 30);

    //sets action commands for buttons
    addButton.setActionCommand("addition");
    minusButton.setActionCommand("subtraction");
    multiplyButton.setActionCommand("multiplication");
    divideButton.setActionCommand("division");

    //creates action listener for buttons
    addButton.addActionListener(this);
    minusButton.addActionListener(this);
    multiplyButton.addActionListener(this);
    divideButton.addActionListener(this);
    
    //adds buttons to main panel
    mainPanel.add(addButton);
    mainPanel.add(minusButton);
    mainPanel.add(multiplyButton);
    mainPanel.add(divideButton);
 

  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();
    

    //for loop for commands and calulating results
    if(command.equals("addition")){
      //gets text from the boxes and makes it into strings
      String firstText = firstInput.getText();
      String secondText = secondInput.getText();
      //makes the strings into integers
      int firstNumber = Integer.parseInt(firstText);
      int secondNumber = Integer.parseInt(secondText);
      //adds answer
      int answer = firstNumber + secondNumber;
      //allows answer to be written
      String printedAnswer = "" + answer;
      //sets askwer as text
      result.setText(printedAnswer);

    //for subtraction
    }else if(command.equals("subtraction")){
      //gets text from the boxes and makes it into strings
      String firstText = firstInput.getText();
      String secondText = secondInput.getText();
      //makes the strings into integers
      int firstNumber = Integer.parseInt(firstText);
      int secondNumber = Integer.parseInt(secondText);
      //subtracts
      int answer = firstNumber - secondNumber;
      //allows answer to be written
      String printedAnswer = "" + answer;
      //prints result
      result.setText(printedAnswer);

    //For multiplication  
    }else if(command.equals("multiplication")){
      //gets text from the boxes and makes it into strings
      String firstText = firstInput.getText();
      String secondText = secondInput.getText();
      //makes the strings into integers
      int firstNumber = Integer.parseInt(firstText);
      int secondNumber = Integer.parseInt(secondText);
      //multiplies
      int answer = firstNumber * secondNumber;
      //allows answer to be written
      String printedAnswer = "" + answer;
      //prints out result
      result.setText(printedAnswer);

    //For division  
    }else if(command.equals("division")){
      //gets text from the boxes and makes it into strings
      String firstText = firstInput.getText();
      String secondText = secondInput.getText();
      //makes the strings into integers
      int firstNumber = Integer.parseInt(firstText);
      int secondNumber = Integer.parseInt(secondText);
      //divides
      int answer = firstNumber / secondNumber;
      //allows answer to be written
      String printedAnswer = "" + answer;
      //prints out result
      result.setText(printedAnswer);
    }else{
      result.setText("");
    }

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}

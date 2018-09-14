/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz.stuff;

import javax.swing.JOptionPane;

/**
 *
 * @author anarc6700
 */
public class QuizStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String fistName = JOptionPane.showInputDialog("Please enter your First Name");
       String lastName = JOptionPane.showInputDialog("Please enter your Last Name");
       String number3 = JOptionPane.showInputDialog("Please enter a number");
       String number4 = JOptionPane.showInputDialog("Please enter a number");
        double number1 = Double.parseDouble(number3);
        double number2 = Double.parseDouble(number4);
       
       System.out.println(fistName.toUpperCase()); 
       System.out.println("The sum of the numbers is" + (number1 + number2));
       System.out.println("The diffrence of the numbers is " + (number1 - number2));
       System.out.println("The quotient of the numbers is" + (number1/number2));
       System.out.println("The product of the numbers is" + (number1 * number2));
    }
    
}

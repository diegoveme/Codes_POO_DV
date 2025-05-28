import javax.swing.JOptionPane;

public class App{
    public static void main(String[] args) {   
    
        String number1 = JOptionPane.showInputDialog("Dame un NUMERO");
        String number2 = JOptionPane.showInputDialog("Dame otro NUMERO");
        System.out.println(Integer.parseInt(number1) + Integer.parseInt(number2));
        
    } 
}
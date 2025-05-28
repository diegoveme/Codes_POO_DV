import javax.swing.JOptionPane;

public class Promedio{
    public static void main(String[] args)throws Exception{   

        String grade1 = JOptionPane.showInputDialog("Give me your first grade");
        String grade2 = JOptionPane.showInputDialog("Give me your second grade");
        String grade3 = JOptionPane.showInputDialog("Give me your third grade");
        System.out.print("Your average is: ");
        System.out.println((Float.parseFloat(grade1) + Float.parseFloat(grade2) + Float.parseFloat(grade3))/3);

    }
}
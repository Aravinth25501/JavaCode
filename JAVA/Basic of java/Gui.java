import javax.swing.JOptionPane;
public class Gui {
    public static void main(String[] args){

    String name= JOptionPane.showInputDialog(null, args, "Enter the name : ", 0);

    JOptionPane.showMessageDialog(null," hello "+ name);
    }
}

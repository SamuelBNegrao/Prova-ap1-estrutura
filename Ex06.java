import javax.swing.JOptionPane;
public class Ex06 {
    public static void main(String []args){
        float a = Float.parseFloat(JOptionPane.showInputDialog("Informe o (a) da equação: "));
        float b = Float.parseFloat(JOptionPane.showInputDialog("Informe o (b) da equação: "));
        float c = Float.parseFloat(JOptionPane.showInputDialog("Informe o (c) da equação: "));

        double delta = (b*b) - 4 *a*c;
        JOptionPane.showMessageDialog(null,"O delta é: " + delta  );
    }
}

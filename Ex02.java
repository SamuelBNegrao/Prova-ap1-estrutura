import javax.swing.JOptionPane;
public class Ex02 {
    public static void main(String[] args){
        float tempC = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor em celsius: "));
        double fahr = (1.8 * tempC) + 32;
        String fahr_formata = String.format("%.1f", fahr);

        JOptionPane.showMessageDialog(null,"A temperatura em F° é " + fahr_formata + "F°");

    }
}
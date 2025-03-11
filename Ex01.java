import javax.swing.JOptionPane;
public class Ex01 {
    public static void main(String[] args){
        float tempF = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor em fahrenheit: "));
        double celsius = (tempF -32) /1.8;
        String celsius_formata = String.format("%.1f", celsius);

        JOptionPane.showMessageDialog(null,"A temperatura em C° é " + celsius_formata + "C°");

    }
}

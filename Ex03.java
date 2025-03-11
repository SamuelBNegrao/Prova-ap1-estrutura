import javax.swing.JOptionPane;
public class Ex03 {
    public static void main(String[] args){
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite seu peso: "));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura: "));
        double imc = peso / (altura * altura);

        String imc_formata = String.format("%.2f", imc);
        JOptionPane.showMessageDialog(null,"Seu índice de IMC é " + imc_formata );
    }
}

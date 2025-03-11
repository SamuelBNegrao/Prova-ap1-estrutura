import javax.swing.JOptionPane;
public class Ex04 {
    public static void main(String[] args){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int quadrado = (num*num), cubo = (num*num*num);

        JOptionPane.showMessageDialog(null,"Seu número ao quadrado deu: " + quadrado + "\n" +
                "Seu número ao cubo deu: " +cubo);

    }
}

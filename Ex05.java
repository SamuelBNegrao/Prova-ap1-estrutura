import javax.swing.JOptionPane;
public class Ex05 {
    public static void main(String[] args) {
        boolean numPositivo = true;

            try {
                float tri_base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do triângulo(não pode ser negativo!): "));
                float tri_altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do triângulo(não pode ser negativo!): "));
                if (tri_base < 0 || tri_altura < 0) {
                    throw new IllegalArgumentException("O número não pode ser negativo!!!");
                }

                double area = (tri_base *tri_altura) /2;
                JOptionPane.showMessageDialog(null,"A área do triângulo é: " + area);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: O número não pode ser negativo!!");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
        }
    }



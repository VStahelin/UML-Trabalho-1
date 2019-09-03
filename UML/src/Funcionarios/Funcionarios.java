import javax.swing.*;
 public class Funcionarios{
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(String.valueOf(JOptionPane.showInputDialog("Por favor digite o nome do Funcionario: ")));
        funcionario.setSalarioBruto(Float.parseFloat(JOptionPane.showInputDialog("Por favor digite o salario bruto do Funcionario: ")));
        funcionario.setPercentualDeAcrecimo(Float.parseFloat(JOptionPane.showInputDialog("Por favor digite o  Fpercentual de acresimo do Funcionario: ")));

        String mensagem;
        mensagem = "O funcionario " + funcionario.getNome() + " tem o salario bruto de " + funcionario.getSalarioBruto() + "\n porem apenas " + funcionario.getSalarioLiquido() + " de salario liquido";
        JOptionPane.showMessageDialog(null, mensagem);

        float valorTranferencia = 0;
        
        valorTranferencia = Float.parseFloat(JOptionPane.showInputDialog("Quanto deseja tranferir para essa conta:"));
        funcionario.setSalarioBruto(funcionario.getSalarioBruto() + valorTranferencia);

        JOptionPane.showMessageDialog(null, "Seu novo saldo é: " + String.valueOf(funcionario.getSalarioBruto()));
    }
 }
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
    }
}

class Funcionario{
    private String nome;
    private float salarioBruto;
    private float percentualDeAcrecimo;

    float getSalarioLiquido(){
        float salarioLiquido = 0;
        salarioLiquido = salarioBruto * (1 * percentualDeAcrecimo / 100);
        return salarioLiquido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public float getPercentualDeAcrecimo() {
        return percentualDeAcrecimo;
    }

    public void setPercentualDeAcrecimo(float percentualDeAcrecimo) {
        this.percentualDeAcrecimo = percentualDeAcrecimo;
    }
    

}
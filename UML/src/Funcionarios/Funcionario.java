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
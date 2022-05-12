
package appfolgapgtoherança;

import java.text.DecimalFormat;

public class Funcionario {
    
    private String nome, carteiraTrabalho;
    protected double salario;

    public Funcionario(String nome, String carteiraTrabalho, double salario) {
        this.nome = nome;
        this.carteiraTrabalho = carteiraTrabalho;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(String carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String dadosFuncionario(){
        DecimalFormat mascara = new DecimalFormat("#,##0.00");
        String dados;
        dados =  "Exemplo pagamento"
                +"\nFuncionário: " + nome
                +"\nCarteira de Trabalho: " + carteiraTrabalho
                +"\nSalário: R$" + salario;
        return dados;
    }
    
}

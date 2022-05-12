
package appfolgapgtoherança;

public class FuncionarioComissionado extends Funcionario{
    
    private double totalVenda, percentualComissao;
    
    public FuncionarioComissionado(String nome, String carteiraTrabalho, double salario, double vendas, double percentual) {
        super(nome, carteiraTrabalho, salario);
        this.totalVenda = vendas;
        this.percentualComissao = percentual;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
    public double calculaSalarioTotal(){
        return salario + totalVenda*percentualComissao/100;
    }

    @Override
    public String dadosFuncionario() {
        return super.dadosFuncionario() + "\nSalário Final: "+ calculaSalarioTotal();
    }
    
    
}

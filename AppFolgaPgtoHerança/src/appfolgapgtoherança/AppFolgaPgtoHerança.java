
package appfolgapgtoherança;

import javax.swing.JOptionPane;

public class AppFolgaPgtoHerança {

    public static void main(String[] args) {
        
        String catFuncionario[] = {"Funcionário", "Funcionário Comissionado"};
        
        String nome = JOptionPane.showInputDialog(null, "Informe o nome do funcionário:", "Folha de Pagamento", 3);
        
        String carteiraTrabalho = JOptionPane.showInputDialog(null, "Informe a carteira de trabalho do funcionário:", "Folha de pagamento", 3);
        
        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salário do funcionário:", "Folha de Pagamento", 3));
        
        String opUser = (String) JOptionPane.showInputDialog(null, "Escolha a categoria:", "Folha de Pagamento", 3, null, catFuncionario, catFuncionario[0]);
        
        if(opUser.equals("Funcionário")){
            
            Funcionario funcionario = new Funcionario(nome, carteiraTrabalho, salario);
            
            JOptionPane.showMessageDialog(null, funcionario.dadosFuncionario(), "Folha de Pagamento", 1);
            
        } else if(opUser.equals("Funcionário Comissionado")){
            
            double vendas = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade de vendas do funcionário:", "Folha de Pagamento", 3));
            
            double percentual = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a comissão por vendas do funcionário:", "Folha de Pagamento", 3));
            
            Funcionario funcComissionado = new FuncionarioComissionado(nome, carteiraTrabalho, salario, vendas, percentual);
            
            JOptionPane.showMessageDialog(null, funcComissionado.dadosFuncionario(), "Folha de Pagamento", 1);
            
        }
        
        System.exit(0);
    }
    
}

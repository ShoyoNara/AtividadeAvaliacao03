
package atividade03;

import javax.swing.JOptionPane;

/**
 *
 * @author samuc
 */
public class Atividade03 {

    /**
     * Elabore um algoritmo que calcule o que deve ser pago por um produto, 
     * considerando o preço normal de etiqueta e a escolha da condição de 
     * pagamento. Leia o código e o valor do produto e efetue o cálculo
     * adequado, mostre o resultado .
     * 
     * Código Condição de pagamento
     * 1 À vista em dinheiro ou cheque  recebe 15% de desconto
     * 2 À vista no cartão de crédito  recebe 10% de desconto
     * 3 Em duas vezes  preço normal de etiqueta sem juros
     * 4 Em três vezes  preço normal de etiqueta mais juros de 10%
     */
    public static void main(String[] args) {
        
        double ValorP, ValorPFinal;
        int CodigoP;
        
       
        ValorP = Double.parseDouble(JOptionPane.showInputDialog("Insira o Valor do Produto: R$"));
        
        CodigoP = Integer.parseInt(JOptionPane.showInputDialog("insira o codigo do pagamento: "
                + "\n(1 À vista em dinheiro ou cheque)\n(2 À vista no cartão de crédito)"
                + "\n(3 Em duas vezes)\n(4 Em três vezes)"));
        
        if(CodigoP == 1){
            
            ValorPFinal = ValorP - 0.15;
            
            JOptionPane.showMessageDialog(null, "O Código inserido foi 1\nentão você recebera 15% de deconto\n "
                    + "e o Valor Final do produto a ser pago sera de: R$"+ValorPFinal);
            
        }else if(CodigoP == 2){
            
            ValorPFinal = ValorP - 0.1;
            
            JOptionPane.showMessageDialog(null, "O Código inserido foi 2\nentão você recebera 10% de deconto\n"
                    + "e o Valor Final do produto a ser pago sera de: R$"+ValorPFinal);
        }else if(CodigoP == 3){
            
            ValorPFinal = ValorP;
            
            JOptionPane.showMessageDialog(null, "O Código inserido foi 3\n"
                    + "Então você não receberá Juros \ne o Valor Final do produto a ser pago sera de: R$"+ValorPFinal);
        }else if(CodigoP == 4){
            
            
            ValorPFinal = ValorP + 0.1;
            
            JOptionPane.showMessageDialog(null, "O Código inserido foi 4\nentão você tera um Juros de 10% "
                    + "Pelo Produto\ne o Valor Final do produto a ser pago sera de: R$"+ValorPFinal);
            
            
        } else{
            
            JOptionPane.showMessageDialog(null, "Código inserido invalido ;-;\nme desculpe mas coloque o código correto porfavor\n"
                    + " Arigato Gozaimasu ^^");
            
        }
        
        
    }
    
}

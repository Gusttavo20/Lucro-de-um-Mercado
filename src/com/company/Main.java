package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaNomeMerc = new Scanner(System.in);

        String nomeMerc;
        int cont10 = 0, cont1020 = 0, cont20 = 0;
        double valorComp = 0, valorVenda = 0, lucro = 0, lucroTotal = 0, somaComp = 0, somaVenda = 0;

        System.out.println(" Informe o valor da venda: ");
        valorVenda = entrada.nextDouble();

        while(valorVenda != 0){
            System.out.println(" Informe o nome da mercadoria: ");
            nomeMerc = entradaNomeMerc.nextLine();
            System.out.println(" Informe o valor da compra da mercadoria para revenda: ");
            valorComp = entrada.nextDouble();

            lucro = ((valorVenda/valorComp)-1)*100;

            if(lucro < 10){
                cont10++;
            }else if(lucro > 20){
                cont20++;
            }else{
                cont1020++;
            }
            lucroTotal +=lucro;
            somaComp += valorComp;
            somaVenda += valorVenda;

            System.out.println(" Nome da mercadoria: " + nomeMerc);
            System.out.println(" Valor da venda: " + valorVenda);
            System.out.println(" Valor da compra da mercadoria para revenda: " + valorComp);
            System.out.println(" Lucro:" + lucro);
            System.out.println(" ");

            System.out.println("Informe o valor da venda: ");
            valorVenda = entrada.nextDouble();

        }
        System.out.println(" Números de mercadorias com lucro < 10%: " + cont10);
        System.out.println(" Números de mercadorias com lucro entre 10% e 20%: " + cont1020);
        System.out.println(" Número de mercadorias com o lucro > 20%: " + cont20);
        System.out.printf(" Total das compras: R$ %.2f \n " , somaComp);
        System.out.printf(" Total das vendas: R$ %.2f \n" , somaVenda);
        System.out.printf(" Lucro total: %.2f \n" , lucroTotal , " % ");
    }

}


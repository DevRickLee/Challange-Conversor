package br.com.alura.conversor.Controllers;

import br.com.alura.conversor.classes.Conversor;

import java.io.IOException;
import java.util.Scanner;

public class PainelController {

    public PainelController() throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        String input = "0";
        String resposta = "";
        boolean onTrue = true;
        while(onTrue){
            if(input.equalsIgnoreCase("7")){
                onTrue = false;
            }
            //if(input.equalsIgnoreCase("0")){
                System.out.println("*************************************");
                System.out.println("Seja bem-vindo ao conversor de Moedas!");
                System.out.println(" ");
                String opc = """
                1) Dólar ==> Peso Argentino
                2) Peso Argentino ==> Dólar
                3) Dólar ==> Real Brasileiro
                4) Real Brasileiro ==> Dólar
                5) Dólar ==> Peso Colombiano
                6) Peso Colombiano ==> Dólar
                7) Sair
                """;
                System.out.println(opc);
                System.out.println("Escolha uma opção válida: ");
                System.out.println("*************************************");
                System.out.println(" ");

                input = scan.next();
           // }

            if(input.equalsIgnoreCase("1")){
                Conversor conversor = new Conversor("USD", "ARS");
                System.out.println("Digite o valor que deseja converter: ");
                float valor = scan.nextFloat();

               float valorConversao = conversor.calcula(valor);
               resposta = "O valor de " + valor + " [" + conversor.getCotacao() + "] corresponde ao valor final de ==> " +
                       valorConversao + "[" + conversor.getTarget() + "]";
               System.out.println(resposta);
               input = "0";
                continue;

            } else if(input.equalsIgnoreCase("2")) {
                Conversor conversor = new Conversor("ARS", "USD");
                System.out.println("Digite o valor que deseja converter: ");
                float valor = scan.nextFloat();

                float valorConversao = conversor.calcula(valor);
                resposta = "O valor de " + valor + " [" + conversor.getCotacao() + "] corresponde ao valor final de ==> " +
                        valorConversao + "[" + conversor.getTarget() + "]";
                System.out.println(resposta);
                input = "0";
                continue;
            } else if(input.equalsIgnoreCase("3")){
                Conversor conversor = new Conversor("USD", "BRL");
                System.out.println("Digite o valor que deseja converter: ");
                float valor = scan.nextFloat();

                float valorConversao = conversor.calcula(valor);
                resposta = "O valor de " + valor + " [" + conversor.getCotacao() + "] corresponde ao valor final de ==> " +
                        valorConversao + "[" + conversor.getTarget() + "]";
                System.out.println(resposta);
                input = "0";
                continue;
            } else if (input.equalsIgnoreCase("4")) {
                Conversor conversor = new Conversor("BRL", "USD");
                System.out.println("Digite o valor que deseja converter: ");
                float valor = scan.nextFloat();

                float valorConversao = conversor.calcula(valor);
                resposta = "O valor de " + valor + " [" + conversor.getCotacao() + "] corresponde ao valor final de ==> " +
                        valorConversao + "[" + conversor.getTarget() + "]";
                System.out.println(resposta);
                input = "0";
                continue;
            } else if(input.equalsIgnoreCase("5")){
                Conversor conversor = new Conversor("USD", "COP");
                System.out.println("Digite o valor que deseja converter: ");
                float valor = scan.nextFloat();

                float valorConversao = conversor.calcula(valor);
                resposta = "O valor de " + valor + " [" + conversor.getCotacao() + "] corresponde ao valor final de ==> " +
                        valorConversao + "[" + conversor.getTarget() + "]";
                System.out.println(resposta);
                input = "0";
                continue;
            } else if(input.equalsIgnoreCase("6")) {
                Conversor conversor = new Conversor("COP", "USD");
                System.out.println("Digite o valor que deseja converter: ");
                float valor = scan.nextFloat();

                float valorConversao = conversor.calcula(valor);
                resposta = "O valor de " + valor + " [" + conversor.getCotacao() + "] corresponde ao valor final de ==> " +
                        valorConversao + "[" + conversor.getTarget() + "]";
                System.out.println(resposta);
                input = "0";
                continue;
            }




        }
    }

}

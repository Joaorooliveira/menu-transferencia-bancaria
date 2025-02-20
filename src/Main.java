import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int opcao;

        System.out.println("Informe seu nome completo:");
        String nome = leitura.nextLine();
        System.out.println("Informe seu tipo de conta:");
        String conta = leitura.nextLine();
        System.out.println("Informe seu saldo inicial:");
        double saldoInicial = leitura.nextDouble();
        double saldoAtualizado = saldoInicial;
        double variavelSuporte =0;
        //Mostrar ao Usuario os seus dados
        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente:");

        System.out.println("Nome: "+nome);
        System.out.println("Tipo conta: "+ conta);
        System.out.println("Saldo inicial: "+saldoInicial);
        System.out.println("***********************");

        //Menu das operacoes
        do{
            System.out.println("Operacoes");

            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");

            opcao = leitura.nextInt();


            switch (opcao){
                case 1:
                    System.out.println("Seu saldo e :"+ saldoAtualizado);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber:");
                    variavelSuporte = leitura.nextDouble();
                    saldoAtualizado += variavelSuporte;
                    System.out.println("Saldo atualizado R$ "+saldoAtualizado);
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir:");
                    variavelSuporte = leitura.nextDouble();
                    System.out.println(variavelSuporte);
                    if(variavelSuporte<=saldoAtualizado) {
                        saldoAtualizado -= variavelSuporte;
                        System.out.println("Saldo atualizado R$ " + saldoAtualizado);
                    }else{
                        System.out.println("Nao ha saldo suficiente para fazer essa transferencia.");
                    }
                    break;
            }
        }while(opcao!=4);



    }
}
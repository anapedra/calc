package ex.ex02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        int var1 = 10;
        int var2 = 5;
        System.out.println(var1 + var2);
        System.out.println(var1 - var2);
        System.out.println(var1 * var2);
        System.out.println(var1 / var2);
        System.out.println(var1 % var2);

        String name1="Paula";
        int anoAtual = 2023;
        int anoNascimento = 1983;

        System.out.println("Thiago Sant`anna nascido em "+ anoNascimento +
                " com idade de " + (anoAtual - anoNascimento) + " anos.");

        System.out.printf("Thiago Sant`anna nascido em %d com idade de %d anos",
                anoNascimento, (anoAtual - anoNascimento));

         */


        System.out.println("Digite a quantidade de pesquisas: ");
        int x=scanner.nextInt();
        for(int i=1;i<=x;i++){
            System.out.println("Digite o nome da passoa: ");
            String name= scanner.next();
            System.out.println("Digite o ano actual: ");
            int anoAt=scanner.nextInt();
            System.out.println("Digite o ano atual de nascimento: ");
            int anoNas=scanner.nextInt();
            int idade=anoAt-anoNas;
            System.out.printf("NOME: %s%nANO DE NASCIMENTO: %d%nANO ATUAL: %d%nIDADE: %d%n ",name,anoNas,anoAt,idade);

        }

    }




}



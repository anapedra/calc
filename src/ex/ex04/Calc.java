package ex.ex04;

import java.util.Locale;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Number n1=new Number();
        Number n2=new Number();
        Number res=new Number();
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite uma das seguintes opções :\n" +
                "1 para soma\n" +
                "2 para subtração\n" +
                "3 para multiplicação\n" +
                "4 para divisão\n");
        int x= sc.nextInt();
        String op="Sim";
        switch (x){
            case 1:
                while (op.equalsIgnoreCase("sim")){

                    System.out.println("Digite o primeiro valor: ");
                    n1.setValue(sc.nextInt());
                    System.out.println("Digite o segundo valor: ");
                    n2.setValue(sc.nextInt());
                    res.setValue(n1.getValue());
                    res.setValue(n1.getValue() + n2.getValue());
                    System.out.printf("%n%d + %d = %d%n%n",n1.getValue(),n2.getValue(),res.getValue());
                    System.out.printf("A soma de %d e %d é igual a %d%n%n ",n1.getValue(),n2.getValue(),res.getValue());
                    System.out.println("Se deseja fazer outra adição digite: sim (Caso digite qualquer ourto carácter esta operação sera encerrada!");
                    op=sc.next();
                }
                break;
            case 2:
                while (op.equalsIgnoreCase("sim")){

                    System.out.println("Digite o primeiro valor: ");
                    n1.setValue(sc.nextInt());
                    System.out.println("Digite o segundo valor: ");
                    n2.setValue(sc.nextInt());
                    res.setValue(n1.getValue());
                    res.setValue(n1.getValue() - n2.getValue());
                    System.out.printf("%n%d - %d = %d%n%n",n1.getValue(),n2.getValue(),res.getValue());
                    System.out.printf("O resultado de %d menos %d é igual a %d%n%n ",n1.getValue(),n2.getValue(),res.getValue());
                    System.out.println("Se deseja fazer outra subtração digite: sim (Caso digite qualquer ourto carácter esta operação sera encerrada!");
                    op=sc.next();

                }
                break;
            case 3:
                while (op.equalsIgnoreCase("sim")){

                    System.out.println("Digite o primeiro valor: ");
                    n1.setValue(sc.nextInt());
                    System.out.println("Digite o segundo valor: ");
                    n2.setValue(sc.nextInt());
                    res.setValue(n1.getValue());
                    res.setValue(n1.getValue() * n2.getValue());
                    System.out.printf("%n%d * %d = %d%n%n",n1.getValue(),n2.getValue(),res.getValue());
                    System.out.printf("O resultado de %d vezes %d é igual a %d%n%n ",n1.getValue(),n2.getValue(),res.getValue());
                    System.out.println("Se deseja fazer outra mutiplicação digite: sim (Caso digite qualquer ourto carácter esta operação sera encerrada!)");
                    op=sc.next();
                }
                break;
            case 4:
                while (op.equalsIgnoreCase("sim")){
                    Number sobraDivisão=new Number();
                    Locale.setDefault(Locale.US);
                    System.out.println("Digite o primeiro valor: ");
                    n1.setValueDecimal(sc.nextDouble());
                    System.out.println("Digite o segundo valor: ");
                    n2.setValueDecimal(sc.nextDouble());
                    res.setValueDecimal(n1.getValue());
                    sobraDivisão.setValueDecimal(n1.getValueDecimal() % n2.getValueDecimal());
                    res.setValueDecimal(n1.getValueDecimal() / n2.getValueDecimal());
                    System.out.printf("%n%.2f / %.2f = %.2f%nSOBRA DA DIVISÃO: %.2f%n",n1.getValueDecimal(),n2.getValueDecimal(),res.getValueDecimal(),
                            sobraDivisão.getValueDecimal());
                    System.out.printf("A divisão de %.2f por %.2f é igual a %.2f e resta %.2f%n%n ",n1.getValueDecimal(),n2.getValueDecimal(),res.getValueDecimal(),sobraDivisão.getValueDecimal());
                    System.out.println("Se deseja fazer outra divisão digite: sim (Caso digite qualquer ourto carácter esta operação sera encerrada!)");
                    op=sc.next();

                }
            default:
                System.out.println("Opcão invalida!");

        }

    }

}

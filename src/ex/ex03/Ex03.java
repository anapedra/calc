package ex.ex03;

public class Ex03 {
    public static void main(String[] args) {
        long var1 = 14;
        long var2 = 3;
        System.out.println(var1 % var2);


        System.out.println(((9123 * 344) + 2344 ) >= (8799) != false ? "Moderna " + "Tecnologia" : "Tá saindo !!!");
        System.out.println((123 * 344) + 2344 );

        String result=((123 * 344) + 2344 ) <= (8799) != false ? "Moderna " + "Tecnologia" : "Tá saindo !!!";
        System.out.println(result);

        String result1=((3 * 3) + 2 ) <= (99) ? "Verdadeiro "  : "Falso";
        System.out.println(result1);
        System.out.println("=================================================================");

        String result2=((3 * 3) + 2 ) >= (99) == false ? ":) "+"Verdadeiro"  : ":( "+"Falso";
        System.out.println(result2);

        String result3=((3 * 3) + 2 ) >= (99) != false ? ":) "+"Verdadeiro"  : ":( "+"Falso";
        System.out.println(result3);

        String result4=((3 * 3) + 2 ) <= (99) != false ? ":) "+"Verdadeiro"  : ":( "+"Falso";
        System.out.println(result4);

        String result5=((3 * 3) + 2 ) > (99) != false ? ":) "+"Verdadeiro"  : ":( "+"Falso";
        System.out.println(result5);
    }
}

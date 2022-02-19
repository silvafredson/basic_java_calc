import java.util.Scanner;

public class Calc {
    static public void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        Number n1=new Number();
        Number n2=new Number();
        Number res=new Number();

        String opc="S";

        while(opc.equals("s") || opc.equals("S")){

            System.out.printf("%nDigite o primeiro número: ");
            n1.setValor(scan.nextInt());

            System.out.printf("%nDigite o segundo número: ");
            n2.setValor(scan.nextInt());

            res.setValor(n1.getValor() + n2.getValor());

            System.out.printf("%nA soma de %d + %d e igual a %d %n",n1.getValor(),n2.getValor(),res.getValor());

            System.out.printf("%nDeseja somar outro número?");
            opc=scan.next();

            System.out.printf("%n%n%n");

            // "n" finaliza o programa
        }
    }
}

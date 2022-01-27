import java.util.Scanner;

public class ReajusteDoSaldo {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ola, qual o seu nome?");
        String name = sc.nextLine();
        System.out.println("Entao, "+name+", informe o saldo (BRL/R$) ao qual estara " +
                "sujeito a um reajuste de 1%.");
        float balance = Float.parseFloat(sc.nextLine());

        float readjustment = (float) (balance*1.01);

        System.out.printf("\nApos o reajuste, o seu saldo ficara: %.2f", readjustment);
        System.out.printf(". Com uma diferenca de %.2f\n", (readjustment - balance));
        System.out.println("Ou seja, o seu saldo ficou " +
                "sujeito a um acrescecimo de: " + (readjustment/balance)*100+"%");

        sc.close();

    }

}

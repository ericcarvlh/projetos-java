import java.util.Scanner;

public class QuantosSalariosRecebo {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salario minimo base em reais (BRL/R$): ");
        float baseWage = Float.parseFloat(sc.nextLine());
        System.out.println("Digite o seu salario em reais (BRL/R$): ");
        float userWage = Float.parseFloat(sc.nextLine());

        float wageQuantity = (userWage / baseWage);
        float wagePercent = (wageQuantity * 100);
        float baseWagePercent = (baseWage / userWage)*100;

        System.out.println("Voce recebe um total de "+wageQuantity+" salario (s) minimo (s). ");

        if (wageQuantity > 1)
            System.out.println("Ou seja, voce recebe "+wagePercent+"% a mais comparado ao salario minimo.");
        else
            System.out.println("Ou seja, voce recebe "+wagePercent+"% a menos comparado ao salario minimo.");

        System.out.println("E o salario minimo corresponde a "+baseWagePercent+"% do seu salario ("+userWage+") total.");

        sc.close();

    }

}

import java.util.Scanner;

public class IdadeMesesDiasParaDias {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[3];
        int totalDays;
        String name;

        System.out.println("Ola, qual o seu nome?");
        name = sc.nextLine();
        System.out.println("Entao, "+name+" voce deve informar sua idade em anos, meses e dia, " +
                "respectivamente e entao sera retornado a quantidade total de dias que " +
                "voce se encocontra neste mundo.");

        System.out.println("Ano (s): ");
        vetor[0] = Integer.parseInt(sc.nextLine());
        System.out.println("Mes (es): ");
        vetor[1] = Integer.parseInt(sc.nextLine());
        System.out.println("Dia (s): ");
        vetor[2] = Integer.parseInt(sc.nextLine());

        totalDays = (vetor[0]*365 + vetor[1]*30 + vetor[2]);

        System.out.println("A quantidade em dias que voce esta na Terra e: "+totalDays);

        System.out.println("Este foi um exemplo utilizando vetor, seguimos agora para um proximo.");

        int years, months, days;

        System.out.println("Ano (s):");
        years = Integer.parseInt(sc.nextLine());
        System.out.println("Mes (es):");
        months = Integer.parseInt(sc.nextLine());
        System.out.println("Dia (s):");
        days = Integer.parseInt(sc.nextLine());

        totalDays = (years*365 + months*30 + days);

        System.out.println("A quantidade em dias que voce esta na Terra e: "+totalDays);
        System.out.println("Este foi um exemplo sem vetor.");

    }

}

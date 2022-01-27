import java.util.Scanner;

public class CompraDePeca {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código do 1° produto: ");
        int cd1 = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o código do 2° produto: ");
        int cd2 = Integer.parseInt(sc.nextLine());

        if (cd1!=cd2){

            System.out.println("Digite a porcentagem (%): ");
            float IPI = Float.parseFloat(sc.nextLine());

            System.out.println("Digite o valor unitario do 1° produto: ");
            float price1 = Float.parseFloat(sc.nextLine());
            System.out.println("Digite a quantidade do 1° produto: ");
            int quan1 = Integer.parseInt(sc.nextLine());

            System.out.println("Digite o valor unitario do 2° produto: ");
            float price2 = Float.parseFloat(sc.nextLine());
            System.out.println("Digite a quantidade do 2° produto: ");
            int quan2 = Integer.parseInt(sc.nextLine());

            float totalAmount = (price1*quan1 + price2*quan2)*(IPI/100 + 1);
            System.out.printf("O valor total é: R$ %.2f", totalAmount);

        } else
        System.out.println("O codigo de ambos os produtos devem ser difernetes.");

        sc.close();
    }

}

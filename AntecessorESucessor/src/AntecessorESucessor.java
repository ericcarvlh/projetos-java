import java.util.Scanner;

public class AntecessorESucessor {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = Integer.parseInt(sc.nextLine());

        System.out.println("O antecessor, nao decimal, do numero "+num+" é: "+ (num-1));
        System.out.println("O sucessor, nao decimal, do numero "+num+" é: "+ (num+1));

        sc.close();

    }

}

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //Criando o objeto Scanner
        Scanner myObj = new Scanner(System.in);

        System.out.println("Insira um número: ");

        //Pegando os inputso do usuário
        int num = myObj.nextInt();

        System.out.println("Seu número é " + num); //Mostrando o número do usuário

        //Convertendo o número para String
        String textNum = Integer.toString(num);

        //Revertendo o número do usuário
        String inverseNum = new StringBuilder(textNum).reverse().toString();
        System.out.println("O número invertido é " + inverseNum);
    }
}

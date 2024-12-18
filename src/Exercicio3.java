import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //Criando o objeto Scanner
        Scanner myObj = new Scanner(System.in);

        System.out.println("Digite os números para exibir a sequência de Fibonacci: \n");

        //Pegando os inputs do usuário
        int myNum = myObj.nextInt();

        if (myNum >= 0){
            int a = 0;
            int b = 1;

            for (int i = 1; i <= myNum; i++) {
                System.out.print(a + " ");

                // Calculando o próximo número
                int c = a + b;
                a = b;
                b = c;
            }

        } else {
            System.out.println("O número informado deve ser positivo, por favor tente novamente.");
        }
    }
}

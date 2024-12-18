import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        // Criando o meu objeto Scanner
        Scanner myObj = new Scanner(System.in);

        //Criando a mensagem inicial para informar sobre o programa
        System.out.println("\nEstá é uma calculadora simples que realizará operações básicas (+, -, *, /). Para começarmos digite dois números\n");

        //Pegando os valores do usuário
        System.out.println("Primeiro valor: ");
        int myNum1 = myObj.nextInt();
        System.out.println("Segundo valor: ");
        int myNum2 = myObj.nextInt();

        //Definindo o tipo de operação que deve ser realizada
        System.out.println("Qual operação você deseja realizar? Adição (+), Subtração (-), Multiplicação (*) ou Divisão (/)");
        String opreacao = myObj.next();


        switch (opreacao){
            case "+":
                System.out.println("O resultado da soma de " + myNum1 + " e " + myNum2 + " é " + (myNum1 + myNum2));
                break;
            case "-":
                System.out.println("O resultado da subtração de " + myNum1 + " e " + myNum2 + " é " + (myNum1 - myNum2));
                break;
            case "*":
                System.out.println("O resultado da multiplicação de " + myNum1 + " e " + myNum2 + " é " + (myNum1 * myNum2));
                break;
            case "/":
                System.out.printf("O resultado da divisão de " + myNum1 + " e " + myNum2 + " é " + (myNum1 / myNum2));
                break;
            default:
                System.out.println("Operação inválida, por favor tente novamente.");
                break;
        }
    }
}

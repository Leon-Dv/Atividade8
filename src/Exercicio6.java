import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        System.out.println("======== JOGO DA ADIVINHAÇÃO =========");

        //Gerando um número de 1 a 50
         int randomNum = (int)(Math.random() * 51);
        /* System.out.println(randomNum);*/
        //Pegando a entrada de usuário
        Scanner myNum = new Scanner(System.in);
        System.out.println("Tente acertar qual número entre 1 e 50 o programa escolheu");
        int num = myNum.nextInt();

        //Criando  o laço de repetição para que o usuário continue tentando até acertar
        do {
            if (num == randomNum) {
                System.out.println("Parabéns, você acertou a resposta");
            }
        } while (num != randomNum); //Enquanto randomNum for diferente do meu Número

        //Encerrando o jogo
        System.out.println("Jogo encerrado");
    }
}

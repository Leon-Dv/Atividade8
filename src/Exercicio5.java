import java.util.Arrays;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        // Criando o meu objeto Scanner
        Scanner myObj = new Scanner(System.in);

        System.out.println("Teste dos Anagramas: insira duas palavras \n");

        String palavra1 = myObj.nextLine().toLowerCase().replace(" ", "");

        String palavra2 = myObj.nextLine().toLowerCase().replace(" ", "");

        //Comparando o comprimento das duas strings
        if (palavra1.length() != palavra2.length()) {
            System.out.println("Estes textos não podem ser anagramas, pois possuem tamanhos diferentes.");
        } else {
            //Convertendo as palavras em arrays de caracteres
            char[] textArray1 = palavra1.toCharArray();
            char[] textArray2 = palavra2.toCharArray();

            //Ordenando os arrays
            Arrays.sort(textArray1);
            Arrays.sort(textArray2);

            //Comparando os arrays para verificar se são iguais
            if (Arrays.equals(textArray1, textArray2)) {
                System.out.println("As palavras \"" + palavra1 + "\" e \"" + palavra2 + "\" são anagramas.");
            } else {
                System.out.println("As palavras \"" + palavra1 + "\" e \"" + palavra2 + "\" não são anagramas.");
            }
        }
    }
}

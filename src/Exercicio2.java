import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //Criando o meu Scanner
        Scanner myObj = new Scanner(System.in);

        System.out.println("Verificador de palíndromos");
        System.out.println("Digite uma palavra. Ex.: \"Palavra\"\n");

        String text = myObj.nextLine(); //Texto do usuário
        String invertido = new StringBuilder(text).reverse().toString(); //Invertendo o texto com o StringBuilder

        //Comparando as palavras
        if (text.equalsIgnoreCase(invertido)){ //Se o texto for igual a palavra invertida é um palíndromo
            System.out.println("As palavra " + text + " e " + invertido + " são palíndromos.");
        } else {
            System.out.println("As palavra " + text + " e " + invertido + " não são palíndromos.");
        }
    }
}

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        //Criando o Scanner
        Scanner myObj = new Scanner(System.in);

        //Pedindo a frase para o usuário
        System.out.println("Insira uma frase");
        String myText = myObj.nextLine().trim(); //Pegando os inputs do usuário
        System.out.println(myText);

        if (myText.isEmpty()) {
            System.out.println("Nenhuma palavra ou frase foi inserida, por favor tente novamente");
        } else {
            String[] palavras = myText.split("\\s+");
            System.out.println("O seu texto tem " + palavras.length + " palavras");
        }
    }
}

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Adriano", "992021603");
        Carro carro = new Carro("Gol Rock in Rio", "AXV-3355");


        System.out.println("-=-=-=-LAVA CARRO ADRIANO VALE 123-=-=-=-");

        System.out.println("Aguarde sua vez, temos um carro a caminho ...");
        System.out.println("FILA:");
        System.out.println("[1]" + carro.getCarroNome());

        for (int id = 2; id < 5; id++) {

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Qual o seu nome? ");
            pessoa.setNome(myObj.nextLine());  // Read user input

            System.out.println("Qual seu telefone? ");
            pessoa.setTelefone(myObj.nextLine());  // Read user input

            System.out.println("Seja bem vindo " + pessoa.getNome());

            System.out.println("Informe o modelo do carro: ");
            carro.setCarroNome(myObj.nextLine());  // Read user input

            System.out.println("Agora informe a placa do seu carro: ");
            carro.setCarroPlaca(myObj.nextLine());  // Read user input

            System.out.println("Aguarde seu carro ficar pronto, entraremos em contato pelo telefone informado "+ pessoa.getTelefone());

            System.out.println("Sua posição na fila é: ");
            System.out.println("["+ id +"] " + carro.getCarroNome());





        }



    }


}
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nome;
        int cpf;
        int qtdEnd;

        Pessoa pessoa = new Pessoa(teclado.nextLine(), teclado.nextByte(), teclado.nextByte());

        Endereco end;
        
        pessoa.mostraInfo();

    }
}
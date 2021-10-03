public class Principal {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Vinicius",123456,2);

        Endereco end1 = new Endereco("Direita","Centro",151);
        Endereco end2 = new Endereco("Dois","Monte", 97);

        pessoa.addEndereco(end1);
        pessoa.addEndereco(end2);

        pessoa.mostraInfo();

    }
}
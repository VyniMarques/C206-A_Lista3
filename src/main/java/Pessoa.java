public class Pessoa {

    public String nome;
    public int cpf;
    public Endereco[] enderecos;

    public Pessoa(String nome, int cpf, int qtdEnd){
        this.nome = nome;
        this.cpf = cpf;
        if(qtdEnd != 0)
            enderecos = new Endereco[qtdEnd];
    }

    public void addEndereco(Endereco end){
        for(int i = 0; i< enderecos.length; i++)
            if(enderecos[i] != null)
                this.enderecos[i] = end;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço(s): ");
        for(int i = 0; i < enderecos.length; i++)
            if(enderecos[i] != null && enderecos.length > 0){
                System.out.println("Endereço " + i + ": ");
                System.out.println("Rua: " + enderecos[i].rua);
                System.out.println("Bairro: " + enderecos[i].bairro);
                System.out.println("Número: " + enderecos[i].num);
            }
    }
}
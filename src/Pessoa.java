public class Pessoa {
    private String nome, cep, endereco, numero, complemento, bairro, cidade, estado, telefone = null;

    public  Pessoa (String nome, String cep, String endereco, String numero, String complemento,  String bairro, String  cidade,  String estado, String telefone){
        this.nome = nome;
        this.cep = cep;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
   }
    public String obterInformacoes(){

              return this.nome + "\n"+
              this.cep + "\n" +
              this.endereco + "\n" +
              this.numero + "\n" +
              this.complemento + "\n" +
              this.bairro + "\n" +
              this.cidade + "\n" +
              this.estado + "\n" +
              this.telefone + "\n";




    }

}

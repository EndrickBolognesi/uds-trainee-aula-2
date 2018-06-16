import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        Produto produto = new Produto("Celular", 1900.00);
        Produto produto1 = new Produto("Celular", 1800.00);
        Produto produto2 = new Produto("Celular", 1700.00);
        Produto produto3 = new Produto("Celular", 1500.00);
        Produto produto4 = new Produto("Celular", 1400.00);

        Pedido pedido = new Pedido(produto.valor);




        PatoDeCabecaVermelha patoVermelho = new PatoDeCabecaVermelha();
        patoVermelho.voar();

        PatoCibernetico jetPato = new PatoCibernetico();
        jetPato.voar();


        //    Macaco macaco = new Macaco();
//    macaco.comerBanana();
//    macaco.comerBanana();
//    macaco.comerBanana();
//    macaco.andar();
//    System.out.println(macaco.setBananasComidas());

//        Pessoa pessoa = new Pessoa("Endrick", "87060102", "rua Baçidasd", "390", "Casa", "JD Santa Rosa", "Maringá", "Paraná", "44 9986-9560");
//
//        System.out.println(pessoa.obterInformacoes());

      /*ArrayList<String> meuArray = new ArrayList();
        meuArray.add("Endrick \n");
        meuArray.add("87000-009 \n");
        meuArray.add("Rua Baliza da Silva \n");
        meuArray.add("390 \n");
        meuArray.add("Casa \n");
        meuArray.add("JD Santa Rosa \n");
        meuArray.add("Maringá \n");
        meuArray.add("Paraná \n");
        meuArray.add("(44)99869-5006 \n");
        System.out.println(meuArray.get(0));
        System.out.println(meuArray.get(8));
        meuArray.set(0, "Endrick Gustavo Bolognesi \n");
        meuArray.remove(8);
        System.out.println(meuArray);

        meuArray.stream().forEach((item)->{
            System.out.println(item);
        });*/

    }
}

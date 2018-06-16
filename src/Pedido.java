import java.util.ArrayList;

public class Pedido {
    Double Total;
    ArrayList<Produto> produto = new ArrayList();

    Pedido(String nome, Double valor) {


    }

    public void adicionarProduto(Produto valor){
        produto.add(valor);
    }

    public void calcularTotal(){

    }


}

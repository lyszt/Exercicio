import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    int id;
    float valorTotal = 0;
    ArrayList<ItemPedido> itens = new ArrayList<ItemPedido>();

    public Pedido(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(float valorTotal) {
        this.valorTotal += valorTotal;
    }
    public ArrayList<ItemPedido> getItemPedido() {
        return itens;
    }
    public void setItemPedido(ArrayList<ItemPedido> itens) {
        this.itens = itens;
    }
    // ----------------------------------------------------------

    public void addPedido(ItemPedido item ){
        itens.add(item);
    }
    
    
}

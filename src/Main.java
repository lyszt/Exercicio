import java.util.Scanner;

public class Main {
    public static void print(String content){
        System.out.println(content);
    }
    private static void buildRequest(Scanner sc, Produto product, Pedido lista){
        print("Quanta voce quer ?\n");
        int quantity = sc.nextInt();
        ItemPedido itempedido = new ItemPedido(product, quantity);
        lista.addPedido(itempedido);
        lista.setValorTotal(quantity*product.getPrice());
        print(quantity + " " + product.getName() + " no capricho, vai ser " + product.getPrice() * quantity + " meu patrao\n");
        print("por enquanto esta " + lista.getValorTotal() + "\n");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto pipoca = new Produto(1,"Pipoca",50,500.00f);
        Produto cigarro = new Produto(2, "Cigarro", 1000, 1.00f);
        print("Loja do Fabiano\n");
        
        Pedido lista = new Pedido(1);
        while(true){
            print("1 - Pipoca 500R$\n");
            print("2 - Cigarro 1R$\n");
            int answer = sc.nextInt();
            switch(answer){
                case 1:
                    buildRequest(sc, pipoca, lista);
                    print("volte sempre amigo");
                    break;
                case 2:
                    buildRequest(sc, cigarro, lista);
                    print("da proxima vez seja mais irresponsavel\n");
                    break;
                default:
                    print("?\n");
                    break;

        }   
    }
    }
}
public class Produto {
    
    int id;
    String name;
    int stock;
    float price;

    public Produto(int id, String name, int stock, float price) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Produto [id=" + id + ", name=" + name + ", stock=" + stock + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public float getPrice(){
        return price;
    }


}

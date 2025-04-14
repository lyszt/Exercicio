public class Porta {
    float dimensaoX;
    float dimensaoY;
    float dimensaoZ;
    boolean aberta;
    String cor;

    public Porta(float dimensaoX, float dimensaoY, float dimensaoZ, boolean aberta, String cor){
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
        this.aberta = aberta;
        this.cor = cor;
    }

    public void abre(){
        if(!aberta){
            aberta = true;
        }
    }
    public void fecha(){
        if(aberta){
            aberta = false;
        }
    }
    public boolean estaAberta(){
        return aberta;
    }
    public void pinta(String cor){
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Porta{" +
                "dimensaoX=" + dimensaoX +
                ", dimensaoY=" + dimensaoY +
                ", dimensaoZ=" + dimensaoZ +
                ", aberta=" + aberta +
                ", cor='" + cor + '\'' +
                '}';
    }
}

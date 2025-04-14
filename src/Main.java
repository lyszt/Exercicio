public class Main {

    public static void testaPortas(){
        Porta johnson = new Porta(25,25,25,true,"rosa");
        johnson.abre();
        System.out.println(johnson.toString());
        System.out.println(johnson.estaAberta());
        johnson.fecha();
        System.out.println(johnson.estaAberta());
        johnson.pinta("miau");
        System.out.println(johnson.toString());
    }
    public static void testaCasas(){

    }
    public static void main(String[] args) throws Exception{

    }
}

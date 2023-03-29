public class Main {
    public static void main(String[] args) {
        Coche Micoche = new Coche();
        Micoche.AgregarPuerta();
        Micoche.AgregarPuerta();
        Micoche.AgregarPuerta();
        System.out.println(Micoche.Puesta);
    }
    public static int suma(int a, int b){
        return a + b;
    }
}
class Coche{
    public int Puesta = 0;
    public void AgregarPuerta(){
        this.Puesta++;
    }
}

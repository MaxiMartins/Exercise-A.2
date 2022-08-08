public class Main {

    public static void main(String[] args) {
        Vehiculo miAuto = new Vehiculo();
        miAuto.QuitarPuerta();
        System.out.println(miAuto.Puertas);

    }
    public static int sum(int a, int b){
        return a + b;
    }
}
class Vehiculo {
    public int Puertas = 4;

    public void QuitarPuerta(){
        this.Puertas--;
    }
}